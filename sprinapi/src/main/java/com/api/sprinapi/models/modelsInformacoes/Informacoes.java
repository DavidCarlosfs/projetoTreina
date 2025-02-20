package com.api.sprinapi.models.modelsInformacoes;

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

    @Column(name = "link", length = 100, nullable = false, unique = true)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String link;

    public Long getId_informacoes() { return id_informacoes; }
    public void setId_informacoes(Long id_informacoes) { this.id_informacoes = id_informacoes; }

    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }
    
}
