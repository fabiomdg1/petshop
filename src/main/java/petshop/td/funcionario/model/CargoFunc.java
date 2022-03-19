package petshop.td.funcionario.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CargoFunc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cargo;
	
	@Column(nullable=false, length=200)
	private String nomeCargo;
	
	@Column(nullable=true, length=200)
	private String descricao;
	
	@Column(nullable=true, length=50)
	private String tipoContratacao;
	
	@Column(nullable=true, length=200)
	private Double salario;
	
	@Column(nullable=true, length=500)
	private String observacao;
	
	@Column(nullable=true, length=500)
	private String beneficios;

	@ManyToOne
	@JoinColumn(name="cargoFunc")
	private Funcionario cargo;
	
	@JsonIgnore
	@OneToMany(mappedBy="serv_prestado")
	private List<ServicoPrestadoFunc> servicosFunc;
	
	//Getters and Setters
	public Integer getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(Integer id_cargo) {
		this.id_cargo = id_cargo;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoContratacao() {
		return tipoContratacao;
	}

	public void setTipoContratacao(String tipoContratacao) {
		this.tipoContratacao = tipoContratacao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}		
	

}
