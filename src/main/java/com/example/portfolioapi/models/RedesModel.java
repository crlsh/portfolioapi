package com.example.portfolioapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "redes")
public class RedesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_red;
    private String nombre;
    private String url_red;
    private String url_logo_red;
    private int id_persona;

    public RedesModel(int id_red, String nombre, String url_red, String url_logo_red, int id_persona) {
        this.id_red = id_red;
        this.nombre = nombre;
        this.url_red = url_red;
        this.url_logo_red = url_logo_red;
        this.id_persona = id_persona;
    }

    public RedesModel(String nombre, String url_red, String url_logo_red, int id_persona) {
        this.nombre = nombre;
        this.url_red = url_red;
        this.url_logo_red = url_logo_red;
        this.id_persona = id_persona;
    }

    public RedesModel() {
        
    }
    

    public int getIdred() {
        return this.id_red;
    }

    public void setIdred(int id_red) {
        this.id_red = id_red;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return this.url_red;
    }

    public void setUrl(String url_red) {
        this.url_red = url_red;
    }

    public String geturl_logo_red() {
        return this.url_logo_red;
    }

    public void seturl_logo_red(String url_logo_red) {
        this.url_logo_red = url_logo_red;
    }

    public int getid_persona() {
        return this.id_persona;
    }

    public void setid_persona(int id_persona) {
        this.id_persona = id_persona;
    }


    @Override
    public String toString() {
        return "{" +
            " id_red='" + getIdred() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", url_red='" + getUrl() + "'" +
            ", url_logo_red='" + geturl_logo_red() + "'" +
            ", id_persona='" + getid_persona() + "'" +
            "}";
    }


}