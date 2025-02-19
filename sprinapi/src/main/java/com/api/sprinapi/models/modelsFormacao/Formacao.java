package com.api.sprinapi.models.modelsFormacao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;

import java.time.Year;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "formacao", discriminatorType = DiscriminatorType.STRING)

public class Formacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_formacao;

    @Column(name = "anoInt", length = 4, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 4, max = 4)
    private Integer anoInt;

    @Column(name = "curso", length = 100, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String curso;

    @Column(name = "ies", length = 100, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String ies;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Graduacao> graduacoes;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PosGraduacao> posGraduacoes;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tecnico> tecnicos;

    public Long getId_formacao() { return id_formacao; }
    public void setId_formacao(Long id_formacao) { this.id_formacao = id_formacao; }

    public Year getAno() { return Year.of(anoInt); }
    public void setAno(Year ano) { this.anoInt = ano.getValue(); }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getIes() { return ies; }
    public void setIes(String ies) { this.ies = ies; }

    public List<Graduacao> getGraduacoes() { return graduacoes; }
    public void setGraduacoes(List<Graduacao> graduacoes) { this.graduacoes = graduacoes; }

    public List<PosGraduacao> getPosGraduacoes() { return posGraduacoes; }
    public void setPosGraduacoes(List<PosGraduacao> posGraduacoes) { this.posGraduacoes = posGraduacoes; }

    public List<Tecnico> getTecnicos() { return tecnicos; }
    public void setTecnicos(List<Tecnico> tecnicos) { this.tecnicos = tecnicos; }

}
