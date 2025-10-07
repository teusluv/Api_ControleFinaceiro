package com.example.faculdade.controller;

import com.example.faculdade.model.Usuario;
import com.example.faculdade.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios") // Define que todos os endpoints nesta classe começarão com /usuarios
public class UsuarioController {

    @Autowired
    private UsuarioService service; // Injeta o serviço que contém a lógica de negócio

    // Endpoint para criar um novo usuário (POST /usuarios)
    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario) {
        Usuario novoUsuario = service.salvar(usuario);
        return ResponseEntity.status(201).body(novoUsuario); // Retorna 201 Created com o usuário criado
    }

    // Endpoint para listar todos os usuários (GET /usuarios)
    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        return ResponseEntity.ok(service.listarTodos()); // Retorna 200 OK com a lista de usuários
    }

    // Endpoint para deletar um usuário por ID (DELETE /usuarios/{id})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build(); // Retorna 204 No Content
    }
}
