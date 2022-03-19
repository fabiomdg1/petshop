package petshop.td.cliente.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import petshop.td.cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
		
	@Query(value="select cliente.id_cliente, cliente.nome, contato_cliente.telefone from cliente join contato_cliente on cliente.id_cliente = contato_cliente.contato_cli join endereco_cliente on endereco_cliente.end_ref_cliente = contato_cliente.contato_cli", nativeQuery = true)
	List<List> dados_cliente();
	
	//Mostra todos os dados de um cliente por ID
	@Query(value="select cliente.id_cliente, cliente.nome, cliente.status_cliente, cliente.data_aniversario, cliente.observacao,cliente.genero, contato_cliente.telefone, contato_cliente.email, contato_cliente.rede_social, endereco_cliente.estado, endereco_cliente.cidade, endereco_cliente.bairro, endereco_cliente.logradouro, endereco_cliente.complemento,endereco_cliente.cep, pet.nome_pet, pet.tipo, pet.raca, pet.porte, pet.data_nascimento, pet.castrado, pet.sexo, pet.vacinado, pet.rede_social_pet, pet.observacao_pet from cliente join contato_cliente on cliente.id_cliente = contato_cliente.contato_cli join endereco_cliente on endereco_cliente.end_ref_cliente = contato_cliente.contato_cli join pet on pet.ref_id_cliente = endereco_cliente.end_ref_cliente where cliente.id_cliente = :id_cliente", nativeQuery = true)
	List<List> cliente_id(Integer id_cliente);
	
	//Lista de pesquisa por cliente
	@Query(value="select cliente.id_cliente, cliente.nome, pet.nome_pet from cliente join pet on cliente.id_cliente = pet.ref_id_cliente",nativeQuery = true)
	List<List> listaClientes();
}
