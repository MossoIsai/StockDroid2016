package com.mossin.org.invetary_app;

/**
 * Created by mossin on 17/03/15.
 */
public class ItmObject {
    private String titulo;
    private int icono;

    public ItmObject(String titulo, int icono){
        this.titulo = titulo;
        this.icono = icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIcono() {
        return icono;
    }

    public String getTitulo() {
        return titulo;
    }
}
