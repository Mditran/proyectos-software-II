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
public class ActividadRepetitiva extends Actividad {

    private int numVeces;
  

    public ActividadRepetitiva(Tarea miTarea, int numVeces) {
        super();
        this.misTareas.add(miTarea);
        this.numVeces = numVeces;
    }
    
    public int getNumVeces() {
        return numVeces;
    }
    
    public void setNumVeces(int numVeces) {
        this.numVeces = numVeces;
    }

    @Override
    public void ejecutar(Contexto contexto) {
        for (int i = 0; i < numVeces; i++) {
            misTareas.get(0).ejecutar(contexto);
        }
    }
}
