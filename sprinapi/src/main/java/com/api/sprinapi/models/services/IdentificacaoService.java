package com.api.sprinapi.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sprinapi.models.modelsIdentificacao.*;
import com.api.sprinapi.models.repositories.IdentificacaoRepositories;

@Service
public class IdentificacaoService {
    
    @Autowired
    private IdentificacaoRepositories identificacaoRepositories;

    public Identificacao salvar(Identificacao identificacao) {
        return identificacaoRepositories.save(identificacao);
    }

    public void deletarIdentificacao(Long id) {
        identificacaoRepositories.deleteById(id);

    }

}
