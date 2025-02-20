package com.api.sprinapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.api.sprinapi.models.modelsInformacoes.Informacoes;

public interface InformacoesRepository extends JpaRepository<Informacoes, Long> {
    List<Informacoes> findByLink(String link);
    
}
