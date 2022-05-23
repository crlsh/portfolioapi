package com.example.portfolioapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Setter @Getter
@Entity
@Table(name = "skills")
public class SkillModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    private int id_skill;
    
    private String nombre;
    
    private int porcentaje; 
    private int id_persona;
    
    public SkillModel(){}

    
    // public SkillModel(String nombre, int porcentaje, int id_persona)
    // {        
    //     this.nombre = nombre;
    //     this.porcentaje = porcentaje;
    //     this.id_persona = id_persona;
    // }

    // public SkillModel(int id_skill, String nombre, int porcentaje, int id_persona)
    // {
    //     this.id_skill = id_skill;
    //     this.nombre = nombre;
    //     this.porcentaje = porcentaje;
    //     this.id_persona = id_persona;
    // }

    // public int getid_skill() {
    //     return id_skill;
    // }

    // public void setid_skill(int id_skill) {
    //     this.id_skill = id_skill;
    // }

    // public String getnombre() {
    //     return nombre;
    // }

    // public void setnombre(String nombre) {
    //     this.nombre = nombre;
    // }

    // public int getporcentaje() {
    //     return porcentaje;
    // }

    // public void setporcentaje(int porcentaje) {
    //     this.porcentaje = porcentaje;
    // }

    // public int getid_persona() {
    //     return id_persona;
    // }

    // public void setid_persona(int id_persona) {
    //     this.id_persona = id_persona;
    // }

    
    
    
    // @Override
    // public String toString() {
    //     return "SkillModel{" + "id_skill=" + id_skill + ", nombre=" + nombre + ", porcentaje=" + porcentaje + ", id_persona=" + id_persona + '}';
    // }


}
