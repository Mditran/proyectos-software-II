/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

import Tareas.Tarea;
import java.util.ArrayList;

/**
 *
 * @author STEBEN
 */
public abstract class Actividad extends Tarea {

    protected ArrayList<Tarea> misTareas;

    public Actividad() {
        super("");
        misTareas = new ArrayList<>();
    }

    public void addTarea(Tarea tarea) {
        misTareas.add(tarea);
    }
}
