/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;
import Estados.Contexto;

/**
 *
 * @author STEBEN
 */
public class TareaImprimir extends Tarea {

    private String mensaje;
    
    public TareaImprimir(String nombre, String mensaje) {
        super(nombre);
        this.mensaje = mensaje;
    }

    @Override
    public void ejecutar(Contexto contexto) {
        System.out.println(mensaje);
        // A ser programada por el programador
    }
    
}
