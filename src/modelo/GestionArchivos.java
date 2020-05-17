/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import GUI.Ventana;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDWIN ACER
 */
public class GestionArchivos {
    
    Vector<Editor> lista; // vector de la clase Editor.
    String[][] tablero; // matriz de letras.
    
    // constructor para la clase Editor
    public GestionArchivos(){
        lista = new Vector<Editor>(); 
    }
    
    // Adiciona un objeto de la clase Editor.
    public void addEditor(Editor editor){
        lista.add(editor); 
    }
    
    // retorna un objeto de la lista de la Clase Editor.
    public Editor getEditor(int posicion){ 
        if(lista.size() == 0){
            return null; 
        }
        else{
            return lista.get(posicion);
        }
    }
    
    public Vector<Editor> getEditor(){
        return lista;
    }
    
    //Muestra las preguntas y respuestas horizontales en una tabla.
    public void verTabla(JTable tabla){
        DefaultTableModel modeloDatos = (DefaultTableModel)tabla.getModel();
        
        while (modeloDatos.getRowCount() > 0) {
            modeloDatos.removeRow(modeloDatos.getRowCount()-1);
        }
        
        for (int i = 0; i < lista.size(); i++) {
            Editor e = lista.get(i);
            Object[] fila = new Object[]{e.getPregunta(), e.getRespuesta(), e.getOrientacion()};
            modeloDatos.addRow(fila); 
        }
    }
    
    // metodo para guardar archivo completo.
    public void guardarArchivo(int fil, int col, String[][] tablero, File file){
        try{
            PrintWriter escritor = new PrintWriter(file);
            escritor.println("Fila:" + fil);
            escritor.println("Columna:" + col + "\n");
            
            for(int i=0; i < fil; i++){
                for (int j = 0; j < col; j++) {  
                    if("".equals(tablero[i][j])){ 
                        escritor.print("- ");
                    }
                    else{ 
                        escritor.print(tablero[i][j] + " "); 
                    }
                }escritor.println();  
            }escritor.println();
            
            for(int i=0; i<lista.size(); i++){
                Editor e = lista.get(i); 
                escritor.println(i+"-"+e.getPregunta()+"-"+e.getRespuesta()+"-"+e.getOrientacion());  
            }
            escritor.close(); 
        }
        catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    // metodo para abrir el archivo con los datos(fila, columna, tablero(matriz), objetos(Editor))
    public void abrirArchivo(File archivo, JPanel panel){
        try{
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea;
            linea = lector.readLine(); // lee la primera linea.
            String[] row = linea.split(":");
            int fila = Integer.parseInt(row[1]); // lee el tamaño de fila.
            
            linea = lector.readLine(); // lee la segunda linea.
            String[] col = linea.split(":");
            int columna = Integer.parseInt(col[1]); // lee el tamaño de la columna.
            lector.readLine(); // lee una linea en blanco (salto de linea).
            System.out.println("Fil: " + fila +" "+ "Col: " + columna+ "\n");
            
            String[][] matriz = new String[fila][columna]; // guarda la matriz
            //String linea; 
            int fil = 0;
            // solo lee la matriz.
            while(fil<fila){   
                linea = lector.readLine();
                String[] cols = linea.split(" "); 
                for (int i=0; i<cols.length; i++) { // crea la matriz(m*n) a partir del arreglo(n).
                    matriz[fil][i] = cols[i]; // asigna un String a cada posicion (i,j) de la matriz.
                } 
                fil++; // siguiente fila.
            }
            
            lector.readLine(); // lee una linea en blanco (salto de linea).
            
            // lee el arreglo de preguntas, respuestas y orientacion.
            int contador = 0;
            while((linea = lector.readLine()) != null){
                String[] datos = linea.split("-");
                Editor e = new Editor(datos[1], datos[2], datos[3]);
                System.out.println(contador +"-"+ e.getPregunta()+"-"+e.getRespuesta()+"-"+e.getOrientacion());
                lista.add(e);
                contador++;
            }
            System.out.println();
            lector.close();
            
            Tablero t = new Tablero();
            t.escribirEnTablero(fila, columna, matriz, panel);  // revisar, esta pendiente... 
            
            // muestra la matriz cargada.
            for (int i=0; i<fila; i++) {
                for (int j=0; j<columna; j++){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
    
    //modifica un objeto de la clase Editor(pregunta) en tiempo de ejecucion.
    public void modificarPregunta(String p, String r, String  o, int pos){
        lista.get(pos).setPregunta(p);
        lista.get(pos).setRespuesta(r);
        lista.get(pos).setOrientacion(o); 
    }
    
    //metodo para borrar un objeto de la clase Editor (pregunta).
    public void borrarPregunta(int pos){
        lista.remove(pos);  
    }
    
    // borra todos los elemtos de la tabla, de la lista...
    public void borrarTabla(JTable tabla){
        tabla.removeAll();
        lista.removeAllElements();
        verTabla(tabla); 
    }
}
