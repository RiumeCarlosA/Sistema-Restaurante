package br.com.apo.sistema.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.apo.sistema.interfaces.Usuario;
import br.com.apo.sistema.interfaces.Entidade;

@Entity
@DiscriminatorValue("GAR")
public class Garcom extends Usuario implements Entidade{
	
	public Garcom() {
		
	}
	
	public Garcom(String nome, String usuario, String senha) {
		super();
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
}
