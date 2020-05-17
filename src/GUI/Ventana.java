/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import modelo.*; 

/**
 *
 * @author EDWIN ACER
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    Tablero tablero = new Tablero();
    Preguntas preguntas = new Preguntas(); 
    Respuestas respuestas = new Respuestas();
    GestionArchivos archivo = new GestionArchivos();
    
    public Ventana() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setTitle("Editor de crusigramas");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(d.width, d.height);
        
        panelEditor.setBackground(Color.darkGray);
        panelTablero.setBackground(Color.darkGray);
        jScrollPane5.getViewport().setBackground(Color.darkGray); 
        
        int fila = (int)inFila.getValue();
        int columna = (int)inColumna.getValue();
        tablero.crearTablero(fila, columna, panelTablero);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelEditor = new javax.swing.JPanel();
        botonAbrirArchivo = new javax.swing.JButton();
        botonGuardarArchivo = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonAutores = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inPregunta = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inRespuesta = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        inOrientacion = new javax.swing.JComboBox<>();
        botonAdicionar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        inFila = new javax.swing.JSpinner();
        inColumna = new javax.swing.JSpinner();
        botonArchivoNuevo = new javax.swing.JButton();
        botonCerrarArchivo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        panelTablero = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        panelPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1399, 768));

        panelEditor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEditor.setAutoscrolls(true);
        panelEditor.setPreferredSize(new java.awt.Dimension(1366, 768));

        botonAbrirArchivo.setBackground(new java.awt.Color(51, 51, 51));
        botonAbrirArchivo.setText("Abrir");
        botonAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirArchivoActionPerformed(evt);
            }
        });

        botonGuardarArchivo.setBackground(new java.awt.Color(51, 51, 51));
        botonGuardarArchivo.setText("Guardar");
        botonGuardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarArchivoActionPerformed(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(51, 51, 51));
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonAutores.setBackground(new java.awt.Color(51, 51, 51));
        botonAutores.setText("Autores");
        botonAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAutoresActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(51, 51, 51));
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Fila: ");

        jLabel2.setText("Columna:");

        jLabel3.setText("Pregunta:");

        inPregunta.setBackground(new java.awt.Color(102, 102, 102));
        inPregunta.setColumns(20);
        inPregunta.setRows(5);
        jScrollPane1.setViewportView(inPregunta);

        jLabel4.setText("Respuesta:");

        inRespuesta.setBackground(new java.awt.Color(102, 102, 102));
        inRespuesta.setColumns(20);
        inRespuesta.setRows(5);
        jScrollPane2.setViewportView(inRespuesta);

        jLabel5.setText("Orientación:");

        inOrientacion.setBackground(new java.awt.Color(51, 51, 51));
        inOrientacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vertical", "Horizontal" }));

        botonAdicionar.setBackground(new java.awt.Color(51, 51, 51));
        botonAdicionar.setText("Adicionar");
        botonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdicionarActionPerformed(evt);
            }
        });

        jLabel7.setText("Tabla de datos:");

        tablaDatos.setBackground(new java.awt.Color(102, 102, 102));
        tablaDatos.setForeground(new java.awt.Color(0, 0, 0));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pregunta", "Respuesta", "Orientación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaDatos.setDragEnabled(true);
        tablaDatos.setGridColor(new java.awt.Color(102, 102, 102));
        tablaDatos.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tablaDatos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaDatos);

        inFila.setModel(new javax.swing.SpinnerNumberModel(20, 5, 26, 1));
        inFila.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                inFilaStateChanged(evt);
            }
        });

        inColumna.setModel(new javax.swing.SpinnerNumberModel(20, 5, 26, 1));
        inColumna.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                inColumnaStateChanged(evt);
            }
        });

        botonArchivoNuevo.setBackground(new java.awt.Color(51, 51, 51));
        botonArchivoNuevo.setText("Nuevo");
        botonArchivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArchivoNuevoActionPerformed(evt);
            }
        });

        botonCerrarArchivo.setBackground(new java.awt.Color(51, 51, 51));
        botonCerrarArchivo.setText("Cerrar");

        javax.swing.GroupLayout panelEditorLayout = new javax.swing.GroupLayout(panelEditor);
        panelEditor.setLayout(panelEditorLayout);
        panelEditorLayout.setHorizontalGroup(
            panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditorLayout.createSequentialGroup()
                .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEditorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonArchivoNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(botonAbrirArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardarArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(botonCerrarArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(botonAutores))
                    .addGroup(panelEditorLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEditorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(botonModificar)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminar))
                            .addGroup(panelEditorLayout.createSequentialGroup()
                                .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inOrientacion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                                    .addComponent(inFila)
                                    .addComponent(inColumna))))))
                .addGap(16, 16, 16))
        );
        panelEditorLayout.setVerticalGroup(
            panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAutores)
                    .addComponent(botonGuardarArchivo)
                    .addComponent(botonAbrirArchivo)
                    .addComponent(botonArchivoNuevo)
                    .addComponent(botonCerrarArchivo))
                .addGap(27, 27, 27)
                .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditorLayout.createSequentialGroup()
                        .addComponent(inFila, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(inColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(panelEditorLayout.createSequentialGroup()
                                .addComponent(inOrientacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botonAdicionar)
                                    .addComponent(botonModificar)
                                    .addComponent(botonEliminar))
                                .addGap(26, 26, 26))))
                    .addGroup(panelEditorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(303, 303, 303)))
                .addGroup(panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jScrollPane4.setForeground(new java.awt.Color(51, 51, 51));

        panelTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTablero.setForeground(new java.awt.Color(51, 51, 51));
        panelTablero.setPreferredSize(new java.awt.Dimension(800, 800));

        javax.swing.GroupLayout panelTableroLayout = new javax.swing.GroupLayout(panelTablero);
        panelTablero.setLayout(panelTableroLayout);
        panelTableroLayout.setHorizontalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        panelTableroLayout.setVerticalGroup(
            panelTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(panelTablero);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        int pos;
        pos = tablaDatos.getSelectedRow();
        if(pos < 0){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una pregunta para eliminar!");
        }
        else{
            archivo.borrarPregunta(pos);
            inPregunta.setText("");
            inRespuesta.setText("");
            archivo.verTabla(tablaDatos);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAutoresActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Sharon Zuleta\nWilliam Ballesteros\nEdwin Cuaran");
    }//GEN-LAST:event_botonAutoresActionPerformed

    private void botonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdicionarActionPerformed
        String pregunta = inPregunta.getText();
        String respuesta = inRespuesta.getText();
        String orientacion = (String)inOrientacion.getSelectedItem();
        
        if(pregunta.length() == 0 || respuesta.length() == 0){
            JOptionPane.showMessageDialog(this, "Debe ingresar una pregunta y una respuesta!");
        }
        else{
            preguntas.agregarPregunta(pregunta);
            respuestas.agregarRespuesta(respuesta);
            Editor editor = new Editor(pregunta, respuesta, orientacion);//objeto editor de (p, r y o)
            archivo.addEditor(editor); // agrega un objeto de tipo editor en clase Archivo.
            archivo.verTabla(tablaDatos); // agrega a la tabla pregunta y respuesta horizontal.

            inPregunta.setText(""); // limpia el area de entrada de la prgunta.
            inRespuesta.setText(""); // limpia el area de entrada de la respuesta.
        }
    }//GEN-LAST:event_botonAdicionarActionPerformed

    private void botonGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarArchivoActionPerformed
        int fila = (int)inFila.getValue(); // entero de entrada fila.
        int columna = (int)inColumna.getValue(); // entero de entrada columna.
        
        tablero.leerTablero(fila, columna); // metodo leer tablero de Clase Tablero. 
        String[][] tab = tablero.getMatriz(); // obtener la matriz de letras...
        
        JFileChooser fc = new JFileChooser();
        int selecccion = fc.showOpenDialog(this);
        
        if (selecccion == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile(); 
            archivo.guardarArchivo(fila, columna, tab, file);
            JOptionPane.showMessageDialog(this, "Archivo guardado!");
        }
    }//GEN-LAST:event_botonGuardarArchivoActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        int pos = tablaDatos.getSelectedRow();
        Editor e = archivo.getEditor(pos);
        
        if(!archivo.getEditor().isEmpty()){
            inPregunta.setText(e.getPregunta());
            inRespuesta.setText(e.getRespuesta());
            inOrientacion.setSelectedItem(e.getOrientacion());
        }
        else{
            JOptionPane.showMessageDialog(this, "No hay datos en la tabla!");
        }
    }//GEN-LAST:event_tablaDatosMouseClicked

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        int pos = tablaDatos.getSelectedRow(); 
        String pregunta = inPregunta.getText();
        String respuesta = inRespuesta.getText();
        String orientacion = (String)inOrientacion.getSelectedItem();
        
        if(pregunta.length() == 0 || respuesta.length() == 0){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una pregunta para modificar!");
        }
        else{
            archivo.modificarPregunta(pregunta, respuesta, orientacion, pos);  
            archivo.verTabla(tablaDatos);
            inPregunta.setText("");
            inRespuesta.setText("");
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirArchivoActionPerformed
        JFileChooser fc = new JFileChooser();
        int seleccion = fc.showOpenDialog(this);
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivo.borrarTabla(tablaDatos); // borra elementos de la tabla de datos y de la lista(clase editor)
            
            File file = fc.getSelectedFile();
            archivo.abrirArchivo(file, panelTablero, inFila, inColumna);  
            archivo.verTabla(tablaDatos); 
        }
    }//GEN-LAST:event_botonAbrirArchivoActionPerformed

    private void inFilaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_inFilaStateChanged
        int fila = (int)inFila.getValue();
        int columna = (int)inColumna.getValue();
        tablero.crearTablero(fila, columna, panelTablero);
    }//GEN-LAST:event_inFilaStateChanged

    private void inColumnaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_inColumnaStateChanged
        int fila = (int)inFila.getValue();
        int columna = (int)inColumna.getValue();
        tablero.crearTablero(fila, columna, panelTablero);
    }//GEN-LAST:event_inColumnaStateChanged

    private void botonArchivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArchivoNuevoActionPerformed
        // TODO add your handling code here:
        int fila = (int)inFila.getValue();
        int columna = (int)inColumna.getValue();
        tablero.crearTablero(fila, columna, panelTablero);
        archivo.borrarTabla(tablaDatos); 
    }//GEN-LAST:event_botonArchivoNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAbrirArchivo;
    private javax.swing.JButton botonAdicionar;
    private javax.swing.JButton botonArchivoNuevo;
    private javax.swing.JButton botonAutores;
    private javax.swing.JButton botonCerrarArchivo;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardarArchivo;
    private javax.swing.JButton botonModificar;
    private javax.swing.JSpinner inColumna;
    private javax.swing.JSpinner inFila;
    private javax.swing.JComboBox<String> inOrientacion;
    private javax.swing.JTextArea inPregunta;
    private javax.swing.JTextArea inRespuesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panelEditor;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTablero;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
