package com.api.sprinapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.api.sprinapi.models.modelsFormacao.Graduacao;

public interface GraduacaoRepository extends JpaRepository<Graduacao, Long> {
    List<Graduacao> findByCursoContaining(String curso);
    List<Graduacao> findByIes(String ies);
    List<Graduacao> findByAnoInt(int ano);
}
