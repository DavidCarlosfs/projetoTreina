package com.api.sprinapi.models.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.sprinapi.models.modelsFormacao.*;
import com.api.sprinapi.models.repositories.FormacaoRepository;

@Service
public class FormacaoService extends BaseService<Formacao, Long> {

    private final FormacaoRepository formacaoRepository;

    public FormacaoService(FormacaoRepository formacaoRepository) {
        super(formacaoRepository);
        this.formacaoRepository = formacaoRepository;
    }

    public List<Formacao> ListarTodos() {
        return formacaoRepository.findAll();
    }
    
    public List<Graduacao> ListarTodasGraduacoes() {
        return formacaoRepository.findByTipo(Graduacao.class);
    }

    public List<PosGraduacao> ListarTodasPosGraduacoes() {
        return formacaoRepository.findByTipo(PosGraduacao.class);
    }

    public List<Tecnico> ListarTodosTecnicos() {
        return formacaoRepository.findByTipo(Tecnico.class);
    }
}
