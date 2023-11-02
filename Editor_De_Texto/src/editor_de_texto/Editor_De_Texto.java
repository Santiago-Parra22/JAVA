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
    
    JTextArea word;
    JPanel p;
   
    Editor_De_Texto(){
        
    p = new JPanel();

    p.setLayout(null);
    p.setBackground(Color.gray);
   
    add (p);
    
      
    word= new JTextArea();
    
    word.setLineWrap(true);
    JScrollPane scroll = new JScrollPane(word);
    scroll.setBounds(200,30,900,650);
    p.add(scroll);
    
    
    
    
    
    
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
  
    
    
    
    }
    public static void main(String[] args) {
       new Editor_De_Texto();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
