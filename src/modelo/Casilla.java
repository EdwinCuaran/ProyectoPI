
package modelo;

import Atxy2k.CustomTextField.RestrictedTextField; 
import javax.swing.*;
import java.awt.*;

public class Casilla extends JFrame {
    
    int alto, ancho; // tamaño de la casilla.
    int posx, posy; // posicion (x,y) de la casilla en el tablero.
    int numCaracter;
    boolean editable;
    
    Color color = Color.LIGHT_GRAY;
    JTextField casilla; 
    Font texto;
    JPanel jpanel = (JPanel) this.getContentPane();
    JTextField[][] matriz = new JTextField[10][10];  
    
    public Casilla() {
        super();
        alto = ancho = 33; // tamaño de cada casilla.
        numCaracter = 2; // cantidad de caracteres permitidos en cada casilla.
        editable = true; // casilla editable.
        texto = new Font("Arial", 1, 18); // tipo de letra de entrada.
    }
    
    // metodo que crea la casilla modelo.
    public JTextField crearCasilla(){
        casilla = new JTextField(); // se crea una nueva etiqueta.
        RestrictedTextField restricted = new RestrictedTextField(casilla); // restringe la cantidad de caracteres.
        restricted.setLimit(numCaracter); 
        casilla.setBounds(new Rectangle(ancho, alto)); // se dibuja como un rectangulo.
        casilla.setFont(texto);
        casilla.setHorizontalAlignment(JTextField.CENTER); // alineacion en el centro de la etiqueta.
        casilla.setBackground(color); 
        casilla.setEditable(editable); 
        return casilla;
    }
}
