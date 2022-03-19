package petshop.td.funcionario.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_funcionario;
	
	@Column(nullable=false, length=100)
	private String nome;
	
	@Column(nullable=true, length=20)
	private String genero;
	
	@Column(nullable=true, length=20)
	private String dataNascimento;
	
	@Column(nullable=true, length=500)
	private String observacao;
	
	@Column(nullable=true, length=10)
	private String status;

	@JsonIgnore
	@OneToMany(mappedBy="contato")
	private List<ContatoFunc> contatoFunc;
	
	@OneToMany(mappedBy="cargo")
	private List<CargoFunc> cargoFunc;
	
	@OneToMany(mappedBy="endereco")
	private List<EnderecoFunc> enderecoFunc;
}
