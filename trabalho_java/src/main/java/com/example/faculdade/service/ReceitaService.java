package com.example.faculdade.service;

import com.example.faculdade.model.Receita;
import com.example.faculdade.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository repository; // Deve usar o ReceitaRepository

    // O método deve salvar uma Receita
    public Receita salvar(Receita receita) {
        return repository.save(receita);
    }

    // O método deve listar Receitas
    public List<Receita> listarTodos() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}