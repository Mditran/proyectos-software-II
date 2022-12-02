/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

import Estados.Contexto;
import Tareas.Tarea;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author STEBEN
 */
public class ActividadConcurrente extends Actividad {

    private ArrayList<Thread> hilos;

    public ActividadConcurrente() {
        super();
        //Asignando memoria a la lista de hilos
        hilos = new ArrayList<>();
    }

    @Override
    public void ejecutar(Contexto contexto) {
        for (Tarea cadaTarea : misTareas) {
            cadaTarea.setContexto(contexto);
            hilos.add(new Thread(cadaTarea));
        }

        for (Thread cadaHilo : hilos) {
            cadaHilo.start();
        }

        for (Thread cadaHilo : hilos) {
            contexto.setResultado(true);
            try {
                cadaHilo.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ActividadConcurrente.class.getName()).log(Level.SEVERE, null, ex);
                contexto.setResultado(false);
            }
        }

    }
}
