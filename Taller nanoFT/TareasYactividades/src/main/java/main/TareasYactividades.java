/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import Actividades.*;
import Estados.*;
import Tareas.Tarea;
import Tareas.TareaImprimir;

/**
 *
 * @author STEBEN
 */
public class TareasYactividades {
    //se ordena por tareas en un lado y actividades en el otro
    public static void main(String[] args) {
        /*  se crean las diferentes tareas en las cuales se recibe
        * el nombre de la tarea, con la clase Tarea imprimir que extiende de Tarea
        *se recibe el mensaje que va a ser ejecutada en la tarea
        */
        Tarea tarea1 = new TareaImprimir("tarea1", "Hola");
        Tarea tarea2 = new TareaImprimir("tarea2", "Principios");
        Tarea tarea3 = new TareaImprimir("tarea3", "SOLID");
        Tarea tarea4 = new TareaImprimir("tarea4", "BIEN");
        Tarea tarea5 = new TareaImprimir("tarea5", "ALGO FALLO");

        // Actividad repetitiva
        Actividad actividad1 = new ActividadRepetitiva(tarea1, 5);
        
        // Actividad paralela las cuales hacen uso de la clase hilos
        Actividad actividad2 = new ActividadConcurrente();
        actividad2.addTarea(tarea2);
        actividad2.addTarea(tarea3);

        // Actividad Condicional
        ActividadCondicional actividad3 = new ActividadCondicional();
        actividad3.addPrevia(actividad2);
        actividad3.addCondicion(new Condicion());
        actividad3.addSi(tarea4);
        actividad3.addSino(tarea5);

        // Actividad Secuencial
        Actividad actividad4 = new ActividadSecuencial();
        actividad4.addTarea(actividad1);
        actividad4.addTarea(actividad3);
        //Actividad final 
        actividad4.ejecutar(new Contexto());
    }

}

