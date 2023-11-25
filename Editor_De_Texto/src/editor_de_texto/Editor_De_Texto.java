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
     // se crea el marco 
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
    
    // se crea la barra que contiene los menus
    public void menu(){
    JMenuBar barra;
    JMenu menu1,menu2,menu3;
    JMenuItem item1,item2,item3;
    
    //inicializamos nuestro menu
    
    barra = new JMenuBar();
    setJMenuBar(barra);
    
    // creamos nuestro primer menu y lo agregamos al jframe
    menu1= new JMenu("opciones");
    barra.add(menu1);
    
    Herramientas p = new Herramientas();
    p.panel.add(barra);
    } 
    
    public static void main(String[] args) {
       new Editor_De_Texto();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
