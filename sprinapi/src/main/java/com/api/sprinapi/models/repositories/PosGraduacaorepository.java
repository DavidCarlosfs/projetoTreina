package com.api.sprinapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.api.sprinapi.models.modelsFormacao.PosGraduacao;


@Repository
public interface PosGraduacaorepository extends JpaRepository<PosGraduacao, Long> {
    List<PosGraduacao> findByCursoContaining(String curso);
    List<PosGraduacao> findByIes(String ies);
    List<PosGraduacao> findByTitulo(String titulo);
    
}
