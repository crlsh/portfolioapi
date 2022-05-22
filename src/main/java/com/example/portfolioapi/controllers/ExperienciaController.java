package com.example.portfolioapi.controllers;

import java.util.List;

import com.example.portfolioapi.models.ExperienciaModel;
import com.example.portfolioapi.services.ExperienciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/experiencia")
public class ExperienciaController {

    @Autowired
    private ExperienciaService experienciaService;

    @GetMapping
    public List<ExperienciaModel> getAll() {
        return experienciaService.getAll();
    }        

    @GetMapping("/{id}")
    public ResponseEntity<ExperienciaModel> getById(@PathVariable(value = "id") int id) {
        return experienciaService.getById(id);
    } 
    
    @PostMapping
    public ExperienciaModel save(@Validated @RequestBody ExperienciaModel experiencia) {
        return experienciaService.save(experiencia);
    }
    



    @PutMapping("/{id}")
    public ResponseEntity<ExperienciaModel> update(@PathVariable(value = "id") int id, @Validated @RequestBody ExperienciaModel experiencia) {
        if (id == experiencia.getId_experiencia()) {
            ExperienciaModel taskNew = experienciaService.save(experiencia);
            return ResponseEntity.ok().body(taskNew);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<ExperienciaModel> delete(@PathVariable int id) {
        boolean ok = experienciaService.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }
    }
}