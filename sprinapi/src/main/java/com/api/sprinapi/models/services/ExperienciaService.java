package com.api.sprinapi.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sprinapi.models.modelsExperiencia.*;
import com.api.sprinapi.models.repositories.ExperienciaRepository;

@Service
public class ExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    public Experiencia salvarExperiencia(Experiencia experiencia) {
        //Verificar se há descrições e valida as datas
        if (experiencia.getDescricoes() != null) {
            for (Descricao descricao : experiencia.getDescricoes()) {
                validarPeriodoDescricao(descricao, experiencia);
            }
        }
        return experienciaRepository.save(experiencia);
    }
    
    private void validarPeriodoDescricao(Descricao descricao, Experiencia experiencia) {
        if (descricao.getDataInicioFunc().isBefore(experiencia.getDataInicio())) {
            throw new IllegalArgumentException("Data de início da função não pode ser anterior à data de início da experiência.");
        }
        if (descricao.getDataFinalFunc() != null && experiencia.getDataFinal() != null && descricao.getDataFinalFunc().isAfter(experiencia.getDataFinal())) {
            throw new IllegalArgumentException("Data de término da função não pode ser posterior à data de término da experiência.");
        }
    }
}
