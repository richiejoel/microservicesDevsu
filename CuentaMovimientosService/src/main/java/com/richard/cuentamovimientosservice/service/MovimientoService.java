package com.richard.cuentamovimientosservice.service;

import com.richard.cuentamovimientosservice.model.Movimiento;
import com.richard.cuentamovimientosservice.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoService {
    @Autowired
    private MovimientoRepository movimientoRepository;

    public List<Movimiento> findAll() {
        return movimientoRepository.findAll();
    }

    public Movimiento findById(Long id) {
        return movimientoRepository.findById(id).orElse(null);
    }

    public Movimiento save(Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public void deleteById(Long id) {
        movimientoRepository.deleteById(id);
    }

    public List<Movimiento> findByCuentaId(Long cuentaId) {
        return movimientoRepository.findByCuentaId(cuentaId);
    }
}
