package com.api.sprinapi.models.modelsFormacao;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("PosGraduacao")
public class PosGraduacao extends Formacao {
    private String titulo;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
}
