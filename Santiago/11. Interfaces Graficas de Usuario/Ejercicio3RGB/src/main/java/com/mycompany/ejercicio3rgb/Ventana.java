/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3rgb;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author gomez
 */
public class Ventana extends JFrame{
    
    JPanel panel;
    JLabel etiqueta;
    JButton red, green, blue;
    
    public Ventana (){
        setSize(500, 400);
        setTitle ("RGB");
        setLocationRelativeTo(null);
        setResizable(false);
        
        colocarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void colocarComponentes(){
        iniciarPanel();
        iniciarEtiqueta();
        iniciarBotones();
    }
    
    private void iniciarPanel(){
        panel = new JPanel ();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void iniciarEtiqueta(){
        etiqueta = new JLabel ("Color (Rojo, Verde, Azul)");
        etiqueta.setBounds(0, 40, 500, 30);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(etiqueta);
    }
    
    private void iniciarBotones(){
        red = new JButton("Rojo");
        red.setBounds(30, 200, 120, 50);
        red.setForeground(Color.red);
        red.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(red);
        
        
        green = new JButton("Verde");
        green.setBounds(183, 200, 120, 50);
        green.setForeground(Color.green);
        green.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(green);
        
        
        blue = new JButton("Azul");
        blue.setBounds(335, 200, 120, 50);
        blue.setForeground(Color.blue);
        blue.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(blue);
        
    }

}
