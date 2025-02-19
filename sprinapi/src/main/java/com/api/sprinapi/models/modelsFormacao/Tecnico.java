package com.api.sprinapi.models.modelsFormacao;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("Tecnico")
public class Tecnico extends Formacao {
    
}
