package br.com.apo.sistema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.apo.sistema.interfaces.Entidade;

public class DAO<E> {
	
	private static EntityManagerFactory emf;
	
	private Class<E> classe;
	
	protected EntityManager em;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("apo");
		}catch (Exception e) {
			
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> abrirTransacao(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharTransacao(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incuir(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incuirAtomico(E entidade){
		return this.abrirTransacao().incuir(entidade).fecharTransacao();
	}
	
	public List<E> obterTodos(){
		return this.obterTodos(10, 0);
	}
	
	public List<E> obterTodos(int quantidade, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "SELECT e FROM " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql,  classe);
		query.setMaxResults(quantidade);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
	
}
