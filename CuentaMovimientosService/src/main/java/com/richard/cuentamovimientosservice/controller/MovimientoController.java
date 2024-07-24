package com.richard.cuentamovimientosservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.richard.cuentamovimientosservice.model.Movimiento;
import com.richard.cuentamovimientosservice.service.MovimientoService;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {
    @Autowired
    private MovimientoService movimientoService;

    @GetMapping
    public List<Movimiento> getAllMovimientos() {
        return movimientoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimiento> getMovimientoById(@PathVariable Long id) {
        Movimiento movimiento = movimientoService.findById(id);
        if (movimiento == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movimiento);
    }

    @PostMapping
    public Movimiento createMovimiento(@RequestBody Movimiento movimiento) {
        return movimientoService.save(movimiento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movimiento> updateMovimiento(@PathVariable Long id, @RequestBody Movimiento movimientoDetails) {
        Movimiento movimiento = movimientoService.findById(id);
        if (movimiento == null) {
            return ResponseEntity.notFound().build();
        }
        movimiento.setFecha(movimientoDetails.getFecha());
        movimiento.setTipoMovimiento(movimientoDetails.getTipoMovimiento());
        movimiento.setValor(movimientoDetails.getValor());
        movimiento.setSaldo(movimientoDetails.getSaldo());
        Movimiento updatedMovimiento = movimientoService.save(movimiento);
        return ResponseEntity.ok(updatedMovimiento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovimiento(@PathVariable Long id) {
        Movimiento movimiento = movimientoService.findById(id);
        if (movimiento == null) {
            return ResponseEntity.notFound().build();
        }
        movimientoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
