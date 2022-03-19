package petshop.td.cliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import petshop.td.cliente.repository.ClienteRepository;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public List<List> mostrar_dados_clientes(){
		return clienteRepository.dados_cliente();
	}
	
	public List<List> mostrar_um_cliente(Integer cliente_id){
		return clienteRepository.cliente_id(cliente_id);
	}
	
	public List<List> listaClientes(){
		return clienteRepository.listaClientes();
	}
}
