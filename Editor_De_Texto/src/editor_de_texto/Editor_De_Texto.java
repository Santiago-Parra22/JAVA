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
public class Editor_De_Texto extends JFrame {
    
    
    
    Editor_De_Texto(){
     // se crea el marco 
    setBounds(300,300,300,300);
    setTitle("Editor de texto");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // se agrega el metodo de los menus y se puede visualizar
     new menu();             
    Herramientas p = new Herramientas();
    add(p);
    }   

  
    
    public class Herramientas extends JPanel{ 
    Herramientas(){
    
        //area de texto
        panel=new JTabbedPane();
       
        //Cierre de area de texto
        //Los componentes son visibles
        crear_panel cp = new crear_panel(); 
        add(panel);
    }}
    
    //crea un panel con un area de texto
    public class crear_panel{
       public crear_panel(){
     ventana = new JPanel();
     txt= new JTextPane();
     ventana.add(txt);
     panel.addTab("untitled",ventana);
    }
    }
        private JTabbedPane panel; 
        private JPanel ventana;
        private JTextPane txt;
    
    
    // se crea la barra que contiene los menus
    public class menu {
        menu (){ 
    JMenuBar barra;
    JMenu menu1,menu2,menu3;
    JMenuItem item1,item2,item3;
    
    //inicializamos nuestro menu
    
    barra = new JMenuBar();
    setJMenuBar(barra);
    
    // creamos nuestro primer menu 
    menu1= new JMenu("opciones");
    menu2= new JMenu("archivo");
    
    barra.add(menu1);
    barra.add(menu2);
     
    item1= new JMenuItem("Nuevo Archivo");
    item1.addActionListener(new gestorMenu() );
    menu1.add(item1);
        }
    } 
    
    public static void main(String[] args) {
       new Editor_De_Texto();
       
    }
    
    public class gestorMenu  implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
       if ("Nuevo Archivo".equals(e.getActionCommand())){
            new crear_panel();
           System.out.println("nueva ventana"); 
           
                   
          
       }
    }
    }
}
