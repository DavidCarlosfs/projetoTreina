package com.api.sprinapi.models.services;

import org.springframework.stereotype.Service;

import com.api.sprinapi.models.modelsInformacoes.*;
import com.api.sprinapi.models.repositories.InformacoesRepository;

@Service
public class InformacoesService extends BaseService<Informacoes, Long> {
     public InformacoesService(InformacoesRepository repository) {
        super(repository);
     }
    
}
