package br.com.apo.sistema;

import br.com.apo.sistema.gui.TelaLogin;

public class SistemaApoAplication {

	public static void main(String[] args){
		
		TelaLogin telaLogin = new TelaLogin();
		telaLogin.criarJanela();
		
//		
//		DAO<Garcom> dao = new DAO<>(Garcom.class);
//		dao.abrirTransacao().incuir(garcom).fecharTransacao().fechar();
		
		//DAO<Object> dao = new DAO<Object>();
		
//		AtendenteDAO daoAtendente = new AtendenteDAO();
//		Garcom garcom = new Garcom("carlos", "carlos", "192@sis");
//		Pedido<Atendente> pedido = new Pedido<>();
//		Bebida coca = new Bebida("coca-cola", 5.39);
//		ItemPedido<Cardapio> itemPedido = new ItemPedido<Cardapio>(pedido, coca, 2);
//		Mesa mesa = new Mesa(1);
//		pedido.setMesa(mesa);
//		pedido.setAtendente(garcom);
////		
////		//dao.abrirTransacao().incuir(agua).incuir(mesa).incuir(pedido).incuir(itemPedido).fecharTransacao().fechar();
////		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("apo");
//		EntityManager em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		em.persist(coca);
//		em.persist(mesa);
//		em.persist(garcom);
//		em.persist(pedido);
//		em.persist(itemPedido);
//		em.getTransaction().commit();
//		em.close();
	}

}
