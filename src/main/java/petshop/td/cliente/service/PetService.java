package petshop.td.cliente.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petshop.td.cliente.repository.PetRepository;

@Service
public class PetService {

	@Autowired
	private PetRepository petRepository;
	
	public List<List> mostrarPets(){
		return petRepository.dados_pet();
	}
	
	public List<List> mostrarNomePet(Integer id_cliente){
		return petRepository.nome_pet_cliente(id_cliente);
	}
}
