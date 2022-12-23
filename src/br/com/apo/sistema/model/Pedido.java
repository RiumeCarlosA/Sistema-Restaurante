package br.com.apo.sistema.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import br.com.apo.sistema.interfaces.Atendente;
import br.com.apo.sistema.interfaces.Cardapio;

@Entity
@Table(name = "pedido")
public class Pedido<E extends Atendente> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Mesa mesa;
	
	@ManyToOne
	private Atendente atendente;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	} 
	
	public Pedido(Atendente atendente, Mesa mesa) {
		super();
		this.atendente = atendente;
		this.mesa = mesa;
	}
	
	public Mesa getMesa() {
		return mesa;
	}
	
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public Long getId() {
		return id;
	}
}
