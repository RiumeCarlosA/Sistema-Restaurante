package br.com.apo.sistema.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import br.com.apo.sistema.interfaces.Cardapio;
import br.com.apo.sistema.interfaces.Entidade;

@Entity
@DiscriminatorValue("BEB")
public class Bebida extends Cardapio implements Entidade{
	
	public Bebida() {
		// TODO Auto-generated constructor stub
	}
	public Bebida(String nome, Double precos) {
		super();
		this.nome = nome;
		this.precos = precos;
	}
	
}
