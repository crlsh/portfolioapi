package com.example.portfolioapi.services;

import com.example.portfolioapi.models.ExperienciaModel;
import com.example.portfolioapi.repos.ExperienciaRepo;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
    @Autowired
    ExperienciaRepo experienciaRepo;
   
    public List<ExperienciaModel> getAll(){
        return (List<ExperienciaModel>) experienciaRepo.findAll();
    }
    
    public ResponseEntity< ExperienciaModel> getById(int id) {

        Optional<ExperienciaModel> experiencia = experienciaRepo.findById(id);

        if (experiencia.isPresent()) {
            return ResponseEntity.ok().body(experiencia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    public ExperienciaModel save( ExperienciaModel experiencia) {
        return experienciaRepo.save(experiencia); 
    }

    
public boolean delete(int id) {
    try {
        experienciaRepo.deleteById(id);
        return true;
    } catch(Exception err){
        return false;
    }
}

}
