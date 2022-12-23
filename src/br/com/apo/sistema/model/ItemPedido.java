package br.com.apo.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.apo.sistema.interfaces.Usuario;
import br.com.apo.sistema.interfaces.Cardapio;

@Entity
@Table(name = "item_pedido")
public class ItemPedido<E extends Cardapio> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@ManyToOne
	private Pedido<Usuario> pedido;
	
	@ManyToOne
	private Cardapio produto;
	
	@Column(nullable = false)
	private int quantidade;
	
	@Column(nullable = false)
	private Double total;
	
	public ItemPedido() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemPedido(Pedido<Usuario> pedido, Cardapio produto, int quantidade) {
		super();
		this.setPedido(pedido);
		this.setProduto(produto);
		this.setQuantidade(quantidade);
	}

	public Pedido<Usuario> getPedido() {
		return pedido;
	}

	public void setPedido(Pedido<Usuario> pedido) {
		this.pedido = pedido;
	}

	public Cardapio getProduto() {
		return produto;
	}

	public void setProduto(Cardapio produto) {
		this.produto = produto;
		calcularTotal();
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		calcularTotal();
	}

	public Long getId() {
		return id;
	}
	
	private void calcularTotal() {
		this.total = produto.getPrecos() * this.quantidade;
	}
	
	public double getTotal() {
		return this.total;
	}

}
