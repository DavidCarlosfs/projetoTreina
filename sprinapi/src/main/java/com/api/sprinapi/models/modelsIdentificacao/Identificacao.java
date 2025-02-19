package com.api.sprinapi.models.modelsIdentificacao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Embedded;

@Entity
@Table(name = Identificacao.TABLE_STRING)
public class Identificacao {
    public static final String TABLE_STRING = "identificacao";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_identificacao;

    @Column(name = "nome", length = 100, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String nome;

    @Column(name = "telefone", length = 11, nullable = false)
    @NotNull
    @NotEmpty
    private String telefone;

    @Column(name = "email", length = 100, nullable = false)
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 100)
    private String email;

    @Embedded
    @NotNull
    private Endereco endereco;

    public Long getId_identificacao() { return id_identificacao; }
    public void setId_identificacao(Long id_identificacao) { this.id_identificacao = id_identificacao; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }


}
