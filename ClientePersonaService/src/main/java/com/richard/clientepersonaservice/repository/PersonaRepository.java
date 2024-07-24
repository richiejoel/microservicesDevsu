package com.richard.clientepersonaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richard.clientepersonaservice.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
	
}
