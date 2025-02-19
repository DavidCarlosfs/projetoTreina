package com.api.sprinapi.models.modelsFormacao;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("Graduacao")
public class Graduacao extends Formacao {
    
}
