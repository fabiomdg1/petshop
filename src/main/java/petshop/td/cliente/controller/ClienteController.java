package petshop.td.cliente.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import petshop.td.cliente.service.ClienteService;

@CrossOrigin @RestController @RequestMapping("petshop")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("/clientes")
	public List<List> buscarUmCliente(){
		List<List> dados = clienteService.mostrar_dados_clientes();
		return dados;
	}
	
	@GetMapping("cliente/{id_cliente}")
	public List<List> cliente_id(@PathVariable Integer id_cliente){
		List<List> clienteId = clienteService.mostrar_um_cliente(id_cliente);
		return clienteId;
	}
	
	@GetMapping("listaClientes")
	public List<List> listaClientes(){
		List<List> lista = clienteService.listaClientes();
		return lista;
	}
}
