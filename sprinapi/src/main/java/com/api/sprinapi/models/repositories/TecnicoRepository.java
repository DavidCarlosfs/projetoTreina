package com.api.sprinapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.api.sprinapi.models.modelsFormacao.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
    List<Tecnico> findByCursoContaining(String curso);
    List<Tecnico> findByIes(String ies);
    List<Tecnico> findByAnoInt(int ano);
    
}
