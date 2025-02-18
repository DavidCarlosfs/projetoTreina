package com.api.sprinapi.models.submodels;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

import com.api.sprinapi.models.Formacao;

@Entity
@DiscriminatorValue("PosGraduacao")
public class PosGraduacao extends Formacao {
    private String titulo;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
}
