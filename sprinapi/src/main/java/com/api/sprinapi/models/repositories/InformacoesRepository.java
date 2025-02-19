package com.api.sprinapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sprinapi.models.modelsInformacoes.Informacoes;

import java.util.List;

public interface InformacoesRepository extends JpaRepository<Informacoes, Long> {
    List<Informacoes> findByLink(String link);
    List<Informacoes> findByRede(String rede);
    
}
