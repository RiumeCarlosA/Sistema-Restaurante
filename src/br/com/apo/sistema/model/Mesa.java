package br.com.apo.sistema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.apo.sistema.interfaces.Usuario;
import br.com.apo.sistema.interfaces.Entidade;

@Entity
@Table(name = "mesas")
public class Mesa implements Entidade{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private int numero;
	
	
	public Mesa() {
		// TODO Auto-generated constructor stub
	}

	public Mesa(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}
	
	
}
