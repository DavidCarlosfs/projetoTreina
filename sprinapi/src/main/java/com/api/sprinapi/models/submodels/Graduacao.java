package com.api.sprinapi.models.submodels;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

import com.api.sprinapi.models.Formacao;

@Entity
@DiscriminatorValue("Graduacao")
public class Graduacao extends Formacao {
    
}
