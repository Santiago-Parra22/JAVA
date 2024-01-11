/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editor_de_texto;

import java.awt.*;
import static java.awt.Color.white;
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
    JMenu menu1,menu2,menu3,menu4,menu41;
    JMenuItem item1,item12,item13,item14,item2,item21,item22,item23,item24,item25,item3, item4, item41,item411;
    
    //inicializamos nuestro menu
    
    barra = new JMenuBar();
    setJMenuBar(barra);
    
    // creamos nuestro primer menu 
    menu1= new JMenu("Archivo");
    menu2= new JMenu("Editar");
    menu3= new JMenu("Seleccionar");
    menu4= new JMenu("Ver");
    
    barra.add(menu1);
    barra.add(menu2);
    barra.add(menu3);
    barra.add(menu4);
    
    //menu 1
    item1= new JMenuItem("Nuevo Archivo");
    item1.addActionListener(new gestorMenu() );
    menu1.add(item1);
    //menu 1
    item12= new JMenuItem("Abrir Archivo");
    item12.addActionListener(new gestorMenu());
    menu1.add(item12);
    menu1.add(new JSeparator());
    //menu 1
    item13= new JMenuItem("Guardar");
    item13.addActionListener(new gestorMenu() );
    menu1.add(item13);
    //menu 1
    item14= new JMenuItem("Guardar Como");
    item14.addActionListener(new gestorMenu());
    menu1.add(item14);
    
    //menu 2
    item2= new JMenuItem("Deshacer");
    item2.addActionListener(new gestorMenu() );
    menu2.add(item2);
      //menu 2
    item21= new JMenuItem("Rehacer");
    item21.addActionListener(new gestorMenu() );
    menu2.add(item21);
    menu2.add(new JSeparator());
    //menu 2
    item22= new JMenuItem("Cortar");
    item22.addActionListener(new gestorMenu() );
    menu2.add(item22);
      //menu 2
    item23= new JMenuItem("Copiar");
    item23.addActionListener(new gestorMenu());
    menu2.add(item23);
    menu2.add(new JSeparator());
    //menu 2
    item24= new JMenuItem("Pegar");
    item24.addActionListener(new gestorMenu() );
    menu2.add(item24);
      //menu 2
    item25= new JMenuItem("Buscar");
    item25.addActionListener(new gestorMenu() );
    menu2.add(item25);
    
    //Menu 3
    item3= new JMenuItem("Selecionar todo");
    item3.addActionListener(new gestorMenu());
    menu3.add(item3);
    
    //menu 4
    
    item4= new JMenuItem("Numeración");
    item4.addActionListener(new gestorMenu() );
    menu4.add(item4);
    
    //menu 4
    menu41= new JMenu ("Apariencia");
    menu4.add(menu41);   
    item411= new JMenuItem("Normal");
    item411.addActionListener(new gestorMenu());
    menu41.add(item411);
    item41= new JMenuItem("Dark");
    item41.addActionListener(new gestorMenu());
    menu41.add(item41);
        }
    } 
    
    public static void main(String[] args) {
       new Editor_De_Texto();
       
    }
    
    public class gestorMenu  implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
       if ("Nuevo Archivo".equals(e.getActionCommand())){
            crear_panel cp=new crear_panel();
            
           System.out.println("nueva ventana"); }
       
       if("Abrir Archivo".equals(e.getActionCommand())){
       
           System.out.println("Abrir Archivo");
       }
        if ("Guardar".equals(e.getActionCommand())){
            System.out.println("Guardado con exito");
             }
       
       if("Guardar Como".equals(e.getActionCommand())){
       
           System.out.println("Guardado en x");
       }
       if ("Deshacer".equals(e.getActionCommand())){
           
           System.out.println("Se ha deshecho con exito"); }
       
       if("Rehacer".equals(e.getActionCommand())){
       
           System.out.println("Se adelanto con exito");
       }
        if ("Cortar".equals(e.getActionCommand())){
            System.out.println("Cortado con exito");
             }
       
       if("Copiar".equals(e.getActionCommand())){
       
           System.out.println("Copiado con exito");
       }
       if ("Pegar".equals(e.getActionCommand())){
            System.out.println("Pegado con exito");
             }
       
       if("Buscar".equals(e.getActionCommand())){
       
           System.out.println("Buscado con exito");
       }
       if("Dark".equals(e.getActionCommand())){
       

            txt.setBackground(Color.black);
            txt.setForeground(Color.white);
           
       }
         if("Normal".equals(e.getActionCommand())){
       

            txt.setBackground(Color.white);
            txt.setForeground(Color.black);
         }
       
    }
    }
}
