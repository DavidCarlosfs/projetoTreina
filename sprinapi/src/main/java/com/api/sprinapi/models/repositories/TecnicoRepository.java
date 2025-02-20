package com.api.sprinapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.api.sprinapi.models.modelsFormacao.Tecnico;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
    List<Tecnico> findByCurso(String curso);
    List<Tecnico> findByIes(String ies);
    
}
