package com.api.sprinapi.models.submodels;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.YearMonth;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.api.sprinapi.models.Experiencia;

@Entity
@DiscriminatorValue("descricao")
public class Descricao extends Experiencia {

    @Column(name = "dataInicioFunc", length = 7, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 7, max = 7)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private YearMonth dataInicioFunc;

    @Column(name = "dataFinalFunc", length = 7, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 7, max = 7)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private YearMonth dataFinalFunc;

    @Column(name = "funcao", length = 150, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 150)
    private String funcao;

    public YearMonth getdataInicioFunc() { return dataInicioFunc; }
    public void setdataInicioFunc(YearMonth dataInicioFunc) { this.dataInicioFunc = dataInicioFunc; }

    public YearMonth getdataFinalFunc() { return dataFinalFunc; }
    public void setdataFinalFunc(YearMonth dataFinalFunc) { this.dataFinalFunc = dataFinalFunc; }

    public String getFuncao() { return funcao; }
    public void setFuncao(String funcao) { this.funcao = funcao; }
}
