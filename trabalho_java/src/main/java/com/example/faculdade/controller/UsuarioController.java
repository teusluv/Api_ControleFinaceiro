package com.example.faculdade.controller;

import com.example.faculdade.model.Usuario;
import com.example.faculdade.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios") 
public class UsuarioController {

    @Autowired
    private UsuarioService service; 

    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario) {
        Usuario novoUsuario = service.salvar(usuario);
        return ResponseEntity.status(201).body(novoUsuario); 
    }

    
    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        return ResponseEntity.ok(service.listarTodos()); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build(); 
    }
}
