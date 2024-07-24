package com.richard.cuentamovimientosservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richard.cuentamovimientosservice.model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
    List<Movimiento> findByCuentaId(Long cuentaId);
}