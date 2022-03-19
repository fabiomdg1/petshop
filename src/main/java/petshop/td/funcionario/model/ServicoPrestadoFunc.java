package petshop.td.funcionario.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ServicoPrestadoFunc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_serv_func;
	
	@Column(nullable=false, length=100)
	private Date data;
	
	@Column(nullable=true, length=100)
	private String jornada;
	
	@Column(nullable=false, length=100)
	private Double valor;
	
	@Column(nullable=false, length=100)
	private String horario_entrada;
	
	@Column(nullable=false, length=100)
	private String horario_saida;
	
	@Column(nullable=false, length=500)
	private String observacao;

	@ManyToOne
	@JoinColumn(name="servicosFunc")	
	private CargoFunc serv_prestado;
	
	//Getters and Setters
	public Integer getId_serv_func() {
		return id_serv_func;
	}

	public void setId_serv_func(Integer id_serv_func) {
		this.id_serv_func = id_serv_func;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getHorario_entrada() {
		return horario_entrada;
	}

	public void setHorario_entrada(String horario_entrada) {
		this.horario_entrada = horario_entrada;
	}

	public String getHorario_saida() {
		return horario_saida;
	}

	public void setHorario_saida(String horario_saida) {
		this.horario_saida = horario_saida;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}	
	
}
