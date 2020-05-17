/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EDWIN ACER
 */
public class Respuestas {
    
    ArrayList <String> respuestas;
    String respuesta = "";
    
    public Respuestas(){
        respuestas = new ArrayList<>();
    }
    
    public void agregarRespuesta(String respuesta){
        respuestas.add(respuesta);
        //mostrarRespuestas();
    }
    
    public void mostrarRespuestas(){
        System.out.println();
        for (int i = 0; i < respuestas.size(); i++) {
            //System.out.print("Respuesta "+ (i+1)+": " + respuestas.get(i));
        }
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
