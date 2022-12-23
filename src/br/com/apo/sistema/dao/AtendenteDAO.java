package br.com.apo.sistema.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.apo.sistema.interfaces.Usuario;

public class AtendenteDAO extends DAO<Usuario>{
	
	public AtendenteDAO() {
		super(Usuario.class);
	}
	
	public String retornarDtype(Usuario usuario) {
		String jpql = "SELECT dtype FROM atendente WHERE atendente.id = " + usuario.getId();
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		List<Usuario> resultado = query.getResultList();
		System.err.println(resultado.get(0).toString());
		return resultado.get(0).toString();
		
	}
}
