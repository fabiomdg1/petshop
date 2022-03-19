package petshop.td.funcionario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import petshop.td.cliente.model.Cliente;


@Entity
public class ContatoFunc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_contato;
	
	@Column(nullable=false, length=50)
	private String telefone;
	
	@Column(nullable=true, length=200)
	private String email;
	
	@Column(nullable=true, length=200)
	private String redeSocial;
	
	@Column(nullable=true, length=500)
	private String observacao;

	@ManyToOne
	@JoinColumn(name="contatoFunc")	
	private Funcionario contato;
	
	
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

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}	
	
}
