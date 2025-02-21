package com.api.sprinapi.models.repositories;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.sprinapi.models.modelsIdentificacao.Identificacao;

@Repository
public interface IdentificacaoRepositories extends JpaRepository<Identificacao, Long> {
    Optional<Identificacao> findByNome(String nome);
    Optional<Identificacao> findByEmail(String email);

    
}
