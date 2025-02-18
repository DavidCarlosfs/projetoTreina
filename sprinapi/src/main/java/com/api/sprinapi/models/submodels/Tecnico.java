package com.api.sprinapi.models.submodels;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

import com.api.sprinapi.models.Formacao;

@Entity
@DiscriminatorValue("Tecnico")
public class Tecnico extends Formacao {
    
}
