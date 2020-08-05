package com.matheusbortolon.demoacmeap.repository;

import java.util.Optional;

import com.matheusbortolon.demoacmeap.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Optional<Cliente> findByCpf(String cpf);
	
}
