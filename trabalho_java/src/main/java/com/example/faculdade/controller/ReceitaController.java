package com.example.faculdade.controller;

import com.example.faculdade.model.Receita;
import com.example.faculdade.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receitas") // Base URL para tudo relacionado a receitas
public class ReceitaController {

    @Autowired
    private ReceitaService service; // Injeta o serviço de receitas

    // Endpoint para criar uma nova receita (POST /receitas)
    @PostMapping
    public ResponseEntity<Receita> criar(@RequestBody Receita receita) {
        Receita novaReceita = service.salvar(receita);
        return ResponseEntity.status(201).body(novaReceita);
    }

    // Endpoint para listar todas as receitas (GET /receitas)
    @GetMapping
    public ResponseEntity<List<Receita>> listar() {
       // Linha corrigida
    return ResponseEntity.ok(service.listarTodos());
    }

    // Endpoint para deletar uma receita por ID (DELETE /receitas/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}