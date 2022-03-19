package petshop.td.cliente.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import petshop.td.cliente.service.PetService;

@CrossOrigin @RestController @RequestMapping("petshop")
public class PetController {
	
	@Autowired
	private PetService petService;

	@GetMapping("/pets")
	public List<List> buscarPets(){
		List<List> pets = petService.mostrarPets();
		return pets;
	}
	
	@GetMapping("/buscarNomePet/{id_cliente}")
	public List<List> buscarNomePet(@PathVariable Integer id_cliente){
		List<List> nomePet = petService.mostrarNomePet(id_cliente);
		return nomePet;
	}
}
