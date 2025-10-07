package com.example.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.faculdade.model.Usuario; // O import deve ser da classe Usuario

public interface UsuarioRepository extends JpaRepository<Usuario, Long> { // Corrigido para <Usuario, Long>

}
