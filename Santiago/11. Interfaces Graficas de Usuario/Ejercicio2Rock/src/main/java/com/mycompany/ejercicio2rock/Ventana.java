/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2rock;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
    
    JPanel panel;
    JLabel imagen;
    JRadioButton boton1, boton2, boton3, boton4;

    
    
    public Ventana (){
        setSize(500, 350);
        setTitle("Rock");
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        inicializarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void inicializarComponentes(){
        inicializarPanel();
        inicializarEtiqueta();
        inicializarRadioButton();
        //activacion();
    }
    
    private void inicializarPanel(){
        panel= new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel); 
    }
    
    private void inicializarEtiqueta(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Escoja su grupo favorito de Rock Nacional: ");
        etiqueta.setBounds(20,20,500, 30);
        etiqueta.setFont(new Font ("Amasis MT Pro Medium",Font.BOLD,15));
        
        panel.add(etiqueta);
        
    }
    
    
    private void inicializarRadioButton(){
        boton1 = new JRadioButton();
        boton1.setText("Sui Generis");
        boton1.setBounds(20, 50, 150, 50);
        boton1.setFont(new Font("cooper black",0,20));
        panel.add(boton1);
        
        boton2 = new JRadioButton();
        boton2.setText("Intoxicados");
        boton2.setBounds(20, 100, 150, 50);
        boton2.setFont(new Font("cooper black",0,20));
        panel.add(boton2);
        
        boton3 = new JRadioButton();
        boton3.setText("Almendra");
        boton3.setBounds(20, 150, 150, 50);
        boton3.setFont(new Font("cooper black",0,20));
        panel.add(boton3);
        
        boton4 = new JRadioButton();
        boton4.setText("Serú Giran");
        boton4.setBounds(20, 200, 150, 50);
        boton4.setFont(new Font("cooper black",0,20));
        panel.add(boton4);
        
        ButtonGroup grupoRadioButtons = new ButtonGroup();
        grupoRadioButtons.add(boton1);
        grupoRadioButtons.add(boton2);
        grupoRadioButtons.add(boton3);
        grupoRadioButtons.add(boton4);
        
        activacion();
        
    }
    
    private void activacion(){

        imagen = new JLabel();
        imagen.setBounds(200, 60, 250, 200);
        panel.add(imagen);
        
        final ImageIcon suiGeneris = new ImageIcon(getClass().getResource("/images/suiGeneris.jpeg"));  //Asi se pone la imagen desde un paquete vinculado al proyexto (sirve para cuando se hace el ejecutable)
        final ImageIcon intoxicados = new ImageIcon(getClass().getResource("/images/intoxicados.jpeg"));  //Asi se pone la imagen desde un paquete vinculado al proyexto (sirve para cuando se hace el ejecutable)
        final ImageIcon almendra = new ImageIcon(getClass().getResource("/images/almendra.jpeg"));  //Asi se pone la imagen desde un paquete vinculado al proyexto (sirve para cuando se hace el ejecutable)
        final ImageIcon seruGiran = new ImageIcon(getClass().getResource("/images/seruGiran.jpeg"));  //Asi se pone la imagen desde un paquete vinculado al proyexto (sirve para cuando se hace el ejecutable)
        
        
        
        
        
        ActionListener activacion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {         
                imagen.setIcon(new ImageIcon(suiGeneris.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        ActionListener activacion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {         
                imagen.setIcon(new ImageIcon(intoxicados.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        ActionListener activacion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {         
                imagen.setIcon(new ImageIcon(almendra.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        ActionListener activacion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {         
                imagen.setIcon(new ImageIcon(seruGiran.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        
        
        boton1.addActionListener(activacion1);
        boton2.addActionListener(activacion2);
        boton3.addActionListener(activacion3);
        boton4.addActionListener(activacion4);
    }
}
