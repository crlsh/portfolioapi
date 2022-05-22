package com.example.portfolioapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos")
public class ProyectoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    public int id_proyecto;

    //@Basic
    private String nombre;
    private String descripcion;
    
    private String url_proyecto;
    private String url_imagen;
    private int id_persona;


    public ProyectoModel() {
    }


    public ProyectoModel(int id_proyecto, String nombre, String descripcion, String url_proyecto, String url_imagen,int id_persona) {
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_proyecto = url_proyecto;
        this.url_imagen = url_imagen;
        this.id_persona = id_persona;
    }


    public ProyectoModel(String nombre, String descripcion, String url_proyecto, String url_imagen,int id_persona) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url_proyecto = url_proyecto;
        this.url_imagen = url_imagen;
        this.id_persona = id_persona;
    }

    public int getIdproyecto() {
        return id_proyecto;
    }

    public void setIdproyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getTitulo() {
        return nombre;
    }

    public void setTitulo(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl_proyecto() {
        return url_proyecto;
    }

    public void setUrl_proyecto(String url_proyecto) {
        this.url_proyecto = url_proyecto;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public int getPersona() {
        return id_persona;
    }

    public void setPersona(int id_persona) {
        this.id_persona = id_persona;
    }

    @Override
    public String toString() {
        return "ProyectoModel{" + "id_proyecto=" + id_proyecto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", url_proyecto=" + url_proyecto + ", url_imagen=" + url_imagen + ", id_persona=" + id_persona + '}';
    }
    
}

