package com.example.portfolioapi.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
@Table(name = "experiencia")
public class ExperienciaModel {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    public int id_experiencia;
    private String empresa; 
    
    private String ingreso;
    private String egreso;
    private String puesto;
    private String descripcion; 
   
     private String url_logo_empresa;        
    private int id_persona;

    // public ExperienciaModel() {
        
    // }

    // public ExperienciaModel(int id_experiencia, String puesto, String descripcion, String empresa, String ingreso, String egreso, String url_logo_empresa, int id_persona ) {
    //     this.id_experiencia = id_experiencia;
    //     this.puesto = puesto;
    //     this.descripcion = descripcion;
    //     this.empresa = empresa;
    //     this.ingreso = ingreso;
    //     this.egreso = egreso;
    //     this.url_logo_empresa = url_logo_empresa;
    //     this.id_persona = id_persona;
    // }

    // public ExperienciaModel(String puesto, String descripcion, String empresa, String ingreso, String egreso, String url_logo_empresa, int id_persona ) {
        
    //     this.puesto = puesto;
    //     this.descripcion = descripcion;
    //     this.empresa = empresa;
    //     this.ingreso = ingreso;
    //     this.egreso = egreso;
    //     this.url_logo_empresa = url_logo_empresa;
    //     this.id_persona = id_persona;
    // }
    
    // @Override
    // public String toString() {
    //     return "ExperienciaModel{" + "id_experiencia=" + id_experiencia + ", puesto=" + puesto + ", descripcion=" + descripcion + ", empresa=" + empresa + ", ingreso=" + ingreso + ", egreso=" + egreso + ", url_logo_empresa=" + url_logo_empresa + ", id_persona=" + id_persona + '}';
    // }


    // public int getId_experiencia() {
    //     return this.id_experiencia;
    // }

    // public void setId_experiencia(int id_experiencia) {
    //     this.id_experiencia = id_experiencia;
    // }

    // public String getPuesto() {
    //     return this.puesto;
    // }

    // public void setPuesto(String puesto) {
    //     this.puesto = puesto;
    // }

    // public String getDescripcion() {
    //     return this.descripcion;
    // }

    // public void setDescripcion(String descripcion) {
    //     this.descripcion = descripcion;
    // }

    // public String getEmpresa() {
    //     return this.empresa;
    // }

    // public void setEmpresa(String empresa) {
    //     this.empresa = empresa;
    // }

    // public String getFecha_ingreso() {
    //     return this.ingreso;
    // }

    // public void setFecha_ingreso(String ingreso) {
    //     this.ingreso = ingreso;
    // }

    // public String getFecha_egreso() {
    //     return this.egreso;
    // }

    // public void setFecha_egreso(String egreso) {
    //     this.egreso = egreso;
    // }

    // public String getUrl_logo_empresa() {
    //     return this.url_logo_empresa;
    // }

    // public void setUrl_logo_empresa(String url_logo_empresa) {
    //     this.url_logo_empresa = url_logo_empresa;
    // }

    // public int getId_persona() {
    //     return this.id_persona;
    // }

    // public void setId_persona(int id_persona) {
    //     this.id_persona = id_persona;
    // }

}






