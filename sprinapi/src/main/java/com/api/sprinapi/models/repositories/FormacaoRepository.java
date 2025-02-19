package com.api.sprinapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.api.sprinapi.models.modelsFormacao.Formacao;

public interface FormacaoRepository extends JpaRepository<Formacao, Long> {
    List<Formacao> findByAnoInt(int ano);
    List<Formacao> findByCursoContaining(String curso);
}
