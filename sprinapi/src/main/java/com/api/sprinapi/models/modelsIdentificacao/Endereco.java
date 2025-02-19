package com.api.sprinapi.models.modelsIdentificacao;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Embeddable
public class Endereco {
    @Column(name = "rua", length = 100, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String rua;

    @Column(name = "numero", length = 6)
    @NotEmpty
    @Size(min = 1, max = 6)
    private String numero;

    @Column(name = "bairro", length = 100, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String bairro;

    @Column(name = "cep", length = 8, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 8, max = 8)
    private String cep;

    @Column(name = "cidade", length = 100, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String cidade;

    @Column(name = "estado", length = 2, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 2)
    private String estado;

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    
}
