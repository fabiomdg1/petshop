package petshop.td.cliente.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import petshop.td.cliente.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>{

	@Query(value="select * from pet", nativeQuery=true)
	List<List> dados_pet();

	@Query(value="select nome_pet from pet where ref_id_cliente=:id_cliente",nativeQuery=true)
	List<List> nome_pet_cliente(Integer id_cliente);
}
