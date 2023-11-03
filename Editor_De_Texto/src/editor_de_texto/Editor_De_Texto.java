/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editor_de_texto;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author Santiago
 */
public class Editor_De_Texto extends JFrame implements ActionListener {
    
    
   
    Editor_De_Texto(){
     
    setBounds(300,300,300,300);
    setTitle("Editor de texto");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Herramientas p = new Herramientas();
    add(p);
    }
    
    public class Herramientas extends JPanel{ 
    Herramientas(){
    
        //area de texto
        panel=new JTabbedPane();
       
        //Cierre de area de texto
        
        //Los componentes son visibles
        crear_panel(); 
        add(panel);
    }
    
    //crea un panel con un area de texto
    public void crear_panel(){
     ventana = new JPanel();
     txt= new JTextPane();
     ventana.add(txt);
     panel.addTab("untitled",ventana);
    }
        private JTabbedPane panel; 
        private JPanel ventana;
        private JTextPane txt;
    }
    
    
    
    public static void main(String[] args) {
       new Editor_De_Texto();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
