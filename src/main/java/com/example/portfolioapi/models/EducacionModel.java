package com.example.portfolioapi.models;

import javax.persistence.*;



@Entity
@Table(name = "educacion")
public class EducacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    public int id_educacion;
    
    private String institucion; 
    private String titulo;
    private String ingreso;
    private String egreso;
    
    private String url_institucion;
    private String url_logo_inst;
    private int id_persona;
  

    public EducacionModel( int id_educacion, String titulo, String egreso,  String ingreso,String institucion, String url_institucion, String url_logo_inst, int id_persona)
     {
        this.id_educacion = id_educacion;
        this.titulo = titulo;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.institucion = institucion;
        this.url_institucion = url_institucion;
        this.url_logo_inst = url_logo_inst;
        this.id_persona = id_persona;
    }
        
    public EducacionModel() {
               
    }

    public EducacionModel( String titulo, String ingreso,  String egreso,String institucion, String url_institucion, String url_logo_inst, int id_persona)
    {
       this.titulo = titulo;
       this.ingreso = ingreso;
       this.egreso = egreso;
       this.institucion = institucion;
       this.url_institucion = url_institucion;
       this.url_logo_inst = url_logo_inst;
       this.id_persona = id_persona;
   }

    public int getIdeducacion() {
        return id_educacion;
    }

    public void setIdeducacion(int id_educacion) {
        this.id_educacion = id_educacion;
    }

    public String getTitulo() {
        return titulo;        
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;      
    }

    public String getEgreso() {
        return egreso;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setEgreso(String egreso) {
        this.egreso = egreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getInstitucionurl() {
        return url_institucion;
    }

    public void setInstitucionurl(String url_institucion) {
        this.url_institucion = url_institucion;
    }

    public String getFotourl() {
        return url_logo_inst;
    }

    public void setFotourl(String url_logo_inst) {
        this.url_logo_inst = url_logo_inst;
    }


    public int getPersona() {
        return id_persona;
    }

    public void setPersona(int id_persona) {
        this.id_persona = id_persona;
    }

    @Override
    public String toString() {
        return "EducacionModel{" + "id_educacion=" + id_educacion + ", titulo=" + titulo + ",ingreso=" + ingreso + ", egreso=" + egreso + ", institucion=" + institucion + ", url_institucion=" + url_institucion + ", url_logo_inst=" + url_logo_inst  + '}';
    }

}
