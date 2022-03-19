package petshop.td.cliente.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pet;
	
	@Column(nullable=false, length=100)
	private String nomePet;
	
	@Column(nullable=false, length=20)
	private String tipo;
	
	@Column(nullable=true, length=50)
	private String raca;
	
	@Column(nullable=true, length=50)
	private String porte;
	
	@Column(nullable=true, length=20)
	private String dataNascimento;
	
	@Column(nullable=true, length=20)
	private String castrado;
	
	@Column(nullable=true, length=10)
	private String sexo;
	
	@Column(nullable=true, length=50)
	private String vacinado;
	
	@Column(nullable=true, length=200)
	private String redeSocialPet;
	
	@Column(nullable=true, length=500)
	private String observacaoPet;
	
	@ManyToOne
	@JoinColumn(name="ref_id_cliente")	
	private Cliente cliente;

	@JsonIgnore
	@ManyToMany
	@JoinTable(
			name="petServicos", 
			joinColumns = @JoinColumn(name="pet", referencedColumnName="id_pet"),
			inverseJoinColumns = @JoinColumn(name = "servico", referencedColumnName="id_prestacaoServico")
			)
	private List<PrestacaoServico> servicos;
	
	//Getters and Setters

	public Integer getId_pet() {
		return id_pet;
	}


	public void setId_pet(Integer id_pet) {
		this.id_pet = id_pet;
	}

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getCastrado() {
		return castrado;
	}


	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getVacinado() {
		return vacinado;
	}


	public void setVacinado(String vacinado) {
		this.vacinado = vacinado;
	}

	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}


	public List<PrestacaoServico> getServicos() {
		return servicos;
	}


	public void setServicos(List<PrestacaoServico> servicos) {
		this.servicos = servicos;
	}


	public String getNomePet() {
		return nomePet;
	}


	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}


	public String getRedeSocialPet() {
		return redeSocialPet;
	}


	public void setRedeSocialPet(String redeSocialPet) {
		this.redeSocialPet = redeSocialPet;
	}


	public String getObservacaoPet() {
		return observacaoPet;
	}


	public void setObservacaoPet(String observacaoPet) {
		this.observacaoPet = observacaoPet;
	}
	

	
}
