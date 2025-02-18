package com.api.sprinapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = Informacoes.TABLE_STRING)
public class Informacoes {
    public static final String TABLE_STRING = "informacoes";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_informacoes;

    @Column(name = "rede", length = 50, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 50)
    private String rede;

    
    
}
