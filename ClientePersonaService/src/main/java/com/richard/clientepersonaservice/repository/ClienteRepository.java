package com.richard.clientepersonaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richard.clientepersonaservice.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}
