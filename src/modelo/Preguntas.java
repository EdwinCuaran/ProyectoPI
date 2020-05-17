/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

/**
 *
 * @author EDWIN ACER
 */
public class Preguntas {
    
    ArrayList <String> preguntas;
    String pregunta = "";
    String Respuesta = "";
    String horientacion;
    int tam;
    
    public Preguntas(){ 
        preguntas = new ArrayList<>();
    }
    
    public Preguntas(String p, String r, String h){
        this.pregunta = p;
        this.Respuesta = r;
        this.horientacion = h;
    }
    
    public void agregarPregunta(String pregunta){ 
        preguntas.add(pregunta); 
        //mostrarPreguntas();
    }
    
    public void mostrarPreguntas(){
        System.out.println();
        for (int i = 0; i < preguntas.size(); i++) {
            //System.out.println("Pregunta "+ (i+1)+": " + preguntas.get(i));
        }
    }
    
    // metodo que retorna una pregunta
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
