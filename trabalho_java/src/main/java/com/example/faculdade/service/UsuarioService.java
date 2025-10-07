package com.example.faculdade.service;

import com.example.faculdade.model.Usuario;
import com.example.faculdade.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository; // Deve usar o UsuarioRepository

    // O método deve salvar um Usuario
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    // O método deve listar Usuarios
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    // Adicionei o método de deletar que será útil
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}