package com.example.faculdade.service;

import com.example.faculdade.model.Despesa;
import com.example.faculdade.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository repository;

    public Despesa salvar(Despesa despesa) {
        return repository.save(despesa);
    }

    public List<Despesa> listarTodas() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}