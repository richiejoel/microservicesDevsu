package com.richard.cuentamovimientosservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richard.cuentamovimientosservice.model.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
	
}
