package com.mossin.org.invetary_app;

import java.lang.ref.SoftReference;

/**
 * Created by mossin on 31/03/15.
 */
public class Titulo {

    private String nombre;
    private String subtitle;
    private String fecha;

   //Constructor para metrizado
    /*
    Titulo(String nombre, String subtitle){
      this.nombre =  nombre;
      this.subtitle = subtitle;
    }
    //Constructor de Inicializazion de valores
    Titulo(){
        this.nombre = "";
        this.subtitle = "";
    }*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setFecha(String fecha){
        this.fecha =  fecha;
    }
    public String getFecha(){
        return this.fecha;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}

