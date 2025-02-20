package com.api.sprinapi.models.repositories;

import com.api.sprinapi.models.modelsExperiencia.*;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.YearMonth;


@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    Optional<Experiencia> findByCargoContaining(String cargo);
    Optional<Experiencia> findByEmpresaContaining(String empresa);
    List<Experiencia> findByDataInicio(YearMonth dataInicio);
    List<Experiencia> findByDataFinal(YearMonth dataFinal);
}
