package br.com.petz.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String celular;
	private String email; 
	private String cpf;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return clientes.stream().map(c -> new ClienteListResponse(c)).collect(Collectors.toList());
	}

	public ClienteListResponse(Cliente cliente) {
		super();
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.celular = cliente.getCelular();
		this.email = cliente.getEmail();
		this.cpf = cliente.getCpf();
	}
	
	
}
