package com.richard.cuentamovimientosservice.service;

import com.richard.cuentamovimientosservice.model.Cuenta;
import com.richard.cuentamovimientosservice.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaService {
    @Autowired
    private CuentaRepository cuentaRepository;

    public List<Cuenta> findAll() {
        return cuentaRepository.findAll();
    }

    public Cuenta findById(Long id) {
        return cuentaRepository.findById(id).orElse(null);
    }

    public Cuenta save(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    public void deleteById(Long id) {
        cuentaRepository.deleteById(id);
    }
}
