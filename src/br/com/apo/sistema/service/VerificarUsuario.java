package br.com.apo.sistema.service;

import java.util.List;

import br.com.apo.sistema.dao.AtendenteDAO;
import br.com.apo.sistema.dao.DAO;
import br.com.apo.sistema.interfaces.Usuario;
import br.com.apo.sistema.model.Administrador;
import br.com.apo.sistema.model.Garcom;

public class VerificarUsuario {
	
	private String usuario;
	
	private String senha;
			
	private AtendenteDAO dao = new AtendenteDAO();
	
	private List<Usuario> lista = dao.abrirTransacao().obterTodos();
	
	public VerificarUsuario() {
		// TODO Auto-generated constructor stub
	}
	
	public VerificarUsuario(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	public String verificar() {
		for(Usuario ate : lista) {
			if(ate.getUsuario() == this.usuario && ate.getSenha() == this.senha) {
				System.out.println(dao.retornarDtype(ate));
				return dao.retornarDtype(ate);
			}			
			System.out.println(dao.retornarDtype(ate));

		}
		return "incorreto";
	}
	
}
