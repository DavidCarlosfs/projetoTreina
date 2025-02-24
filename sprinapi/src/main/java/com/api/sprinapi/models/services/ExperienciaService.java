package com.api.sprinapi.models.services;

import java.util.Optional;
import java.lang.RuntimeException;
import java.lang.Override;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sprinapi.models.modelsExperiencia.*;
import com.api.sprinapi.models.repositories.ExperienciaRepository;

@Service
public class ExperienciaService extends BaseService<Experiencia, Long> {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    //Construtor para adcionar novas experiências
    public ExperienciaService(ExperienciaRepository repository) {
        super(repository);
    }

    //método para salvar a experiência
    @Override
    public Experiencia salvar(Experiencia experiencia) {
        //Verificar se há descrições e valida as datas
        if (experiencia.getDescricoes() != null) {
            for (Descricao descricao : experiencia.getDescricoes()) {
                validarPeriodoDescricao(descricao, experiencia);
            }
        }
        return super.salvar(experiencia);
    }
    
    //método de verificação do período da função informada
    private void validarPeriodoDescricao(Descricao descricao, Experiencia experiencia) {
        if (descricao.getDataInicioFunc().isBefore(experiencia.getDataInicio())) {
            throw new IllegalArgumentException("Data de início da função não pode ser anterior à data de início da experiência.");
        }
        if (descricao.getDataFinalFunc() != null && experiencia.getDataFinal() != null && descricao.getDataFinalFunc().isAfter(experiencia.getDataFinal())) {
            throw new IllegalArgumentException("Data de término da função não pode ser posterior à data de término da experiência.");
        }
    }

    //método para buscar a experiência por empresa
    public Experiencia EncontrarEmpresa(String empresa) {
        Optional<Experiencia> experiencias = this.experienciaRepository.findByEmpresaContaining(empresa);
        return experiencias.orElseThrow(() -> new RuntimeException("Empresa não encontrada"));

    }

    //método para buscar a experiência por cargo
    public Experiencia EncontrarCargo(String cargo) {
        Optional<Experiencia> cargos = this.experienciaRepository.findByCargoContaining(cargo);
        return cargos.orElseThrow(() -> new RuntimeException("Cargo não encontrada"));

    }

}
