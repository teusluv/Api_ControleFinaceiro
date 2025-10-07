package com.example.faculdade.controller;

import com.example.faculdade.model.Despesa;
import com.example.faculdade.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    @Autowired
    private DespesaService service;

    @PostMapping
    public ResponseEntity<Despesa> criar(@RequestBody Despesa despesa) {
        return ResponseEntity.ok(service.salvar(despesa));
    }

    @GetMapping
    public ResponseEntity<List<Despesa>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
        }
}
