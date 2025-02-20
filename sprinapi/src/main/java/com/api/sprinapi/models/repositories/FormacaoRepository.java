package com.api.sprinapi.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.api.sprinapi.models.modelsFormacao.Formacao;

import feign.Param;

@Repository
public interface FormacaoRepository extends JpaRepository<Formacao, Long> {
    @Query("SELECT f FROM Formacao f WHERE TYPE(f) = :type")
    <T extends Formacao> List<T> findByTipo(@Param("type") Class<T> type);
}
