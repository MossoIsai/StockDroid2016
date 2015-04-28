package com.mossin.org.invetary_app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mossin on 31/03/15.
 */
public class FuenteDatos {

    static List TAREAS = new ArrayList<Titulo>();

    static {

        TAREAS.add(new Titulo("Trotar 30 minutos", "08:00", "2015-Ene-06"));
        TAREAS.add(new Titulo("Estudiar análisis técnico", "10:00", "2015-Feb-14"));
        TAREAS.add(new Titulo("Comer 4 rebanadas de manzana", "10:30", "2015-Dic-31"));
        TAREAS.add(new Titulo("Asistir al taller de programación gráfica", "15:45","2015-Mar-01"));
        TAREAS.add(new Titulo("Consignarle a Marta", "18:00", "2015-May-10"));

    }
}
