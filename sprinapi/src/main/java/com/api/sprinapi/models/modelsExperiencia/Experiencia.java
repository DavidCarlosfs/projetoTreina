package com.api.sprinapi.models.modelsExperiencia;

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

import java.time.YearMonth;
import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "experiencia", discriminatorType = DiscriminatorType.STRING)

public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_experiencia;

    @Column(name = "empresa", length = 100, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String empresa;

    @Column(name = "dataInicio", length = 7, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 7, max = 7)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private YearMonth dataInicio;

    @Column(name = "dataFinal", length = 7, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 7, max = 7)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private YearMonth dataFinal;

    @Column(name = "cargo", length = 100, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String cargo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Descricao> descricoes;

    public Long getId_experiencia() { return id_experiencia; }
    public void setId_experiencia(Long id_experiencia) { this.id_experiencia = id_experiencia; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public YearMonth getDataInicio() { return dataInicio; }
    public void setDataInicio(YearMonth dataInicio) { this.dataInicio = dataInicio; }

    public YearMonth getDataFinal() { return dataFinal; }
    public void setDataFinal(YearMonth dataFinal) { this.dataFinal = dataFinal; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public List<Descricao> getDescricoes() { return descricoes;  }
    
    public void setDescricoes(List<Descricao> descricoes) { this.descricoes = descricoes; }    

}
