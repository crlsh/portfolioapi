package com.example.portfolioapi.repos;



import com.example.portfolioapi.models.ExperienciaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends CrudRepository<ExperienciaModel, Integer> {

}

