package com.api.sprinapi.models.services;

import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

//Uma base de serviços para os métodos de salvar, buscar, listar e deletar
@Service
public abstract class BaseService<T, ID> {
    private final JpaRepository<T, ID> repository;

    protected BaseService(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    public T salvar(T entity) {
        return repository.save(entity);
    }

    public Optional<T> buscarPorId(ID id) {
        return repository.findById(id);
    }

    public List<T> listarTodos() {
        return repository.findAll();
    }

    public void deletar(ID id) {
        repository.deleteById(id);
    }
}
