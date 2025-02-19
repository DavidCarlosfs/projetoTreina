package com.api.sprinapi.models.repositories;

import com.api.sprinapi.models.modelsExperiencia.*;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    List<Experiencia> findByCargoContaining(String cargo);
    List<Experiencia> findByDataInicio(String dataInicio);
    List<Experiencia> findByDataFinal(String dataFinal);
    List<Experiencia> findByEmpresaContaining(String empresa);
    
}
