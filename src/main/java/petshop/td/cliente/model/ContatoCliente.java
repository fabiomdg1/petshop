package petshop.td.cliente.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ContatoCliente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_contato;
	
	@Column(nullable=false, length=20)
	private String telefone;
	
	@Column(nullable=false, length=100)
	private String email;
	
	@Column(nullable=false, length=200)
	private String redeSocial;
	
	@ManyToOne
	@JoinColumn(name="contatoCli")	
	private Cliente cliente;

	
	//Getters and Setters
	public Integer getId_contato() {
		return id_contato;
	}

	public void setId_contato(Integer id_contato) {
		this.id_contato = id_contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRedeSocial() {
		return redeSocial;
	}

	public void setRedeSocial(String redeSocial) {
		this.redeSocial = redeSocial;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
