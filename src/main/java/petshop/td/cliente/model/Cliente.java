package petshop.td.cliente.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;
	
	@Column(nullable=false, length=100)
	private String nome;
	
	@Column(nullable=true, length=20)
	private String genero;
	
	@Column(nullable=true, length=20)
	private String data_aniversario;
	
	@Column(nullable=true, length=500)
	private String observacao;
	
	@Column(nullable=true, length=10)
	private String statusCliente;



	@JsonIgnore
	@OneToMany(mappedBy="cliente")
	private List<Pet> ref_id_cliente = new ArrayList<>();
	
	@OneToMany(mappedBy="cliente")
	private List<ContatoCliente> contatoCli = new ArrayList<ContatoCliente>();
	
	@OneToMany(mappedBy="cliente")
	private List<EnderecoCliente> end_ref_cliente = new ArrayList<>();
	
	
	
	//Getters ans Setters	
	
	
	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getData_aniversario() {
		return data_aniversario;
	}

	public void setData_aniversario(String data_aniversario) {
		this.data_aniversario = data_aniversario;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getStatusCliente() {
		return statusCliente;
	}

	public void setStatusCliente(String statusCliente) {
		this.statusCliente = statusCliente;
	}

	
	public List<Pet> getRef_id_cliente() {
		return ref_id_cliente;
	}

	public void setRef_id_cliente(List<Pet> ref_id_cliente) {
		this.ref_id_cliente = ref_id_cliente;
	}

	public List<ContatoCliente> getContatoCli() {
		return contatoCli;
	}

	public void setContatoCli(List<ContatoCliente> contatoCli) {
		this.contatoCli = contatoCli;
	}

	public List<EnderecoCliente> getEnd_ref_cliente() {
		return end_ref_cliente;
	}

	public void setEnd_ref_cliente(List<EnderecoCliente> end_ref_cliente) {
		this.end_ref_cliente = end_ref_cliente;
	}
	

	
	
}
