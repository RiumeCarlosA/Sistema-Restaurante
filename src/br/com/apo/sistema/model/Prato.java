package br.com.apo.sistema.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import br.com.apo.sistema.interfaces.Cardapio;
import br.com.apo.sistema.interfaces.Entidade;

@Entity
@DiscriminatorValue("PRA")
public class Prato extends Cardapio implements Entidade {
	
	private String descricao;
	
	public Prato(){
		
	}
	public Prato(String nome, Double precos) {
		super();
		this.nome = nome;
		this.precos = precos;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
