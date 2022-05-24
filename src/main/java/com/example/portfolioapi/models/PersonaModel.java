package com.example.portfolioapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "persona")
public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    private int id_persona;
    
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String acercade;
    private String titulo;
    private String email;
    private String telefono;
    private String ubicacion;
    private String url_img_perfil;
    private String url_img_fondo;
   
    @Transient
    private String token;

    public PersonaModel(int id_persona, 
                        String nombre, 
                        String apellido, 
                        String username, 
                        String password,
                        String acercade, 
                        String titulo, 
                        String email, 
                        String telefono, 
                        String ubicacion, 
                        String url_img_perfil, 
                        String url_img_fondo
) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.acercade = acercade;
        this.titulo = titulo;
        this.email = email;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.url_img_perfil = url_img_perfil;
        this.url_img_fondo = url_img_fondo;

    }

    public PersonaModel(String nombre, 
                        String apellido, 
                        String username, 
                        String password,
                        String acercade,
                        String email, 
                        String titulo,
                        String telefono, 
                        String ubicacion, 
                        String url_img_perfil, 
                        String url_img_fondo
) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.acercade = acercade;
        this.email = email;
        this.titulo = titulo;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.url_img_perfil = url_img_perfil;
        this.url_img_fondo = url_img_fondo;

    }

    public PersonaModel() {
        
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getAcercade() {
        return acercade;
    }

    public void setAcercade(String acercade) {
        this.acercade = acercade;
    }

    public String getUrl_img_perfil() {
        return url_img_perfil;
    }

    public void setUrl_img_perfil(String url_img_perfil) {
        this.url_img_perfil = url_img_perfil;
    }


    public String getUrl_img_fondo() {
        return url_img_fondo;

    }

    public void setUrl_img_fondo(String url_img_fondo) {
        this.url_img_fondo = url_img_fondo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    // @Override
    // public String toString() {
    //     return "PersonaModel{" + "id_persona=" + id_persona 
    //                            + ", nombre=" + nombre
    //                            + ", apellido=" + apellido 
    //                            + ", email=" + email
    //                            + ", titulo=" + titulo 
    //                            + ", telefono=" + telefono 
    //                            + ", ubicacion=" + ubicacion 
    //                            + ", acercade=" + acercade 
    //                            + ", url_img_perfil=" + url_img_perfil 
    //                            + ", url_img_fondo =" + url_img_fondo
    //                            + ", username=" + username 
    //                            + ", password=" + password + '}';
    // }

    

}