// A primeira linha DEVE ser esta
package com.example.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.faculdade.model.Despesa;

// A anotação @Repository é opcional aqui, mas é uma boa prática.
// O Spring já entende que é um repositório porque estende JpaRepository.
public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}