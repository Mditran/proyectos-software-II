/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

import Estados.Contexto;
import Tareas.Tarea;
import Estados.Condicion;

/**
 *
 * @author STEBEN
 */
public class ActividadCondicional extends Actividad {

    private Condicion condicion;

    public ActividadCondicional() {
    }

    public void addPrevia(Tarea tarea) {
        misTareas.add(tarea);
    }

    public void addCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public void addSi(Tarea tarea) {
        misTareas.add(tarea);
    }

    public void addSino(Tarea tarea) {
        misTareas.add(tarea);
    }

    @Override
    public void ejecutar(Contexto contexto) {
        misTareas.get(0).ejecutar(contexto);
        condicion.setMiCondicion(contexto.isResultado());
        if (condicion.isMiCondicion()) {
            misTareas.get(1).ejecutar(contexto);
        } else {
            misTareas.get(2).ejecutar(contexto);
        }
    }
}
