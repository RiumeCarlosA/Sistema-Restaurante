package br.com.apo.sistema.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import br.com.apo.sistema.interfaces.Usuario;
import br.com.apo.sistema.interfaces.Entidade;

@Entity
@DiscriminatorValue("ADM")
public class Administrador extends Usuario implements Entidade{
	
	public Administrador(){
		// TODO Auto-generated constructor stub
	}
	
	public Administrador(String nome, String usuario, String senha) {
		super();
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}

}
