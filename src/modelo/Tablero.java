/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.*;

/**
 *
 * @author EDWIN ACER
 */
public class Tablero extends JFrame{
    
    Casilla casilla = new Casilla(); // objeto de la clase Casilla.
    
    int fila;
    int columna;
    JPanel panelT;
    JTextField[][] matrizCasillas; 
    String[][] matriz; 
    
    // metodo constructor.
    public Tablero(){ 
    }
    
    // crea el tablero y lo agrega al panel de la clase Ventana.
    public void crearTablero(int fil, int col, JPanel panel){ 
        panel.removeAll(); // elimina todos los componentes del tablero.
        panel.repaint(); // re-dibuja el tamaño del tablero m*n
        matrizCasillas = new JTextField[fil][col];  
        for(int i=0; i < fil; i++){
            for (int j = 0; j < col; j++) { 
                matrizCasillas[i][j] = casilla.crearCasilla();
                matrizCasillas[i][j].setLocation(j*30, i*30); 
                panel.add(matrizCasillas[i][j]); 
            }
        } 
    }
    
    // lee el tablero para construir la matriz de letras.
    public void leerTablero(int fil, int col){ 
        matriz = new String[fil][col];
        for(int i=0; i < fil; i++){
            for (int j=0; j<col; j++) {  
                String caracter = matrizCasillas[i][j].getText();
                matriz[i][j] = caracter;   
            }
        }
    }
    
    // retorna la matriz de letras...
    public String[][] getMatriz(){
        return matriz;
    }
    
    // dibuja un nuevo tablero cargado desde un archivo.
    public void escribirEnTablero(int fil, int col, String[][] _matriz, JPanel panel){
        crearTablero(fil, col, panel);
        
        for(int i=0; i<fil; i++){
            for (int j=0; j<col; j++) {    
                String caracter = _matriz[i][j];
                if("-".equals(caracter)){
                    matrizCasillas[i][j].setText("");
                }
                else{
                   matrizCasillas[i][j].setText(caracter);  
                }
            }
        }
    }
    
    // permite ver la matriz de letras...(metodo de prueba)
    public void verMatriz(){
        for(int i=0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {  
                if("".equals(matriz[i][j])){ 
                    System.out.print("*");
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
}
