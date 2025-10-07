package com.example.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.faculdade.model.Receita; // O import também deve ser da classe Receita

public interface ReceitaRepository extends JpaRepository<Receita, Long> { // Corrigido para <Receita, Long>

}