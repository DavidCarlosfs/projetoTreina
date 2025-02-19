package com.api.sprinapi.models.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.sprinapi.models.modelsExperiencia.*;
import com.api.sprinapi.models.services.ExperienciaService;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {

    @Autowired
    private ExperienciaService experienciaService;

    @PostMapping
    public ResponseEntity<?> criarExperiencia(@RequestBody Experiencia experiencia) {
        try {
            Experiencia experienciaSalva = experienciaService.salvarExperiencia(experiencia);
            return ResponseEntity.ok(experienciaSalva);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
