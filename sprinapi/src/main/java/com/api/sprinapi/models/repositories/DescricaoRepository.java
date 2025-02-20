package com.api.sprinapi.models.repositories;

import com.api.sprinapi.models.modelsExperiencia.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescricaoRepository extends JpaRepository<Descricao, Long> {
    List<Descricao> findByFuncaoContaining(String funcao);
    List<Descricao> findByEmpresaContainind(String empresa);
    
}
