package br.com.petz.clientepet.cliente.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.clientepet.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
	
	@Override
	default Optional<Cliente> findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}
}
