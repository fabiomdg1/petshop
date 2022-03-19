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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PrestacaoServico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_prestacaoServico;
	
	@Column(nullable=true, length=100)
	private String nome;
	
	@Column(nullable=true, length=500)
	private String descricao;
	
	@Column(nullable=true, length=20)
	private String data;
	
	@Column(nullable=true, length=20)
	private Double valor;
	
	@Column(nullable=true, length=100)
	private String formaPagamento;
	
	
	
	@Column(nullable=true, length=500)
	private String observacao;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			name="petServicos", 
			inverseJoinColumns = @JoinColumn(name="pet", referencedColumnName="id_pet"),
			joinColumns = @JoinColumn(name = "servico", referencedColumnName="id_prestacaoServico")
			)
	private List<Pet> pets;
	
	

	//Getters ans Setters
	public Integer getId_prestacaoServico() {
		return id_prestacaoServico;
	}

	public void setId_prestacaoServico(Integer id_prestacaoServico) {
		this.id_prestacaoServico = id_prestacaoServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}	
	
}
