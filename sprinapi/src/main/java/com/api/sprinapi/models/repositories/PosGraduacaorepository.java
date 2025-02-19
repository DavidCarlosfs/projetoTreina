package com.api.sprinapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.api.sprinapi.models.modelsFormacao.PosGraduacao;

public interface PosGraduacaorepository extends JpaRepository<PosGraduacao, Long> {
    List<PosGraduacao> findByAnoInt(int ano);
    List<PosGraduacao> findByCursoContaining(String curso);
    List<PosGraduacao> findByIes(String ies);
    List<PosGraduacao> findByTitulo(String titulo);
    
}
