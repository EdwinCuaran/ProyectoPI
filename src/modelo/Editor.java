/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author EDWIN ACER
 */
public class Editor{
    
    String pregunta; // almacena la pregunta
    String respuesta; // almacena la respuesta
    String orientacion; // almacena la orientacion

    // metodo constructor.
    public Editor(String pregunta, String respuesta, String orientacion) { 
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.orientacion = orientacion;
    }
    
    public Editor(){
        
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String horientacion) {
        this.orientacion = horientacion;
    }
}
