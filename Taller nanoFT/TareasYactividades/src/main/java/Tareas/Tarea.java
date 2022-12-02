/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas;

import Estados.Contexto;

/**
 *
 * @author STEBEN   
 */
public abstract class Tarea implements Runnable, Ejecutable {

    private String nombre;
    private Contexto contexto;

    //Ejecutara para las clases de actividades paralelas 
    @Override
    public void run() {
        this.ejecutar(getContexto());
    }

    public Tarea(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Contexto getContexto() {
        return contexto;
    }
    
    public void setContexto(Contexto contexto) {
        this.contexto = contexto;
    }

}
