/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

import Estados.Contexto;
import Tareas.Tarea;

/**
 *
 * @author STEBEN
 */
public class ActividadSecuencial extends Actividad {

    public ActividadSecuencial() {
    }

    @Override
    public void ejecutar(Contexto contexto) {
        for (Tarea cadaTarea : misTareas) {
            cadaTarea.ejecutar(contexto);
        }
    }
}
