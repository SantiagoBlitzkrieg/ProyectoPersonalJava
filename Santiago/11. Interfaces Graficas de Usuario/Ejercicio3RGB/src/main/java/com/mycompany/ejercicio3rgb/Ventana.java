/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3rgb;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
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
    int r=0,g=0,b=0,d=0;
    
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
        
        scrollEvent();
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
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d=1;
            }
        });
                
        green = new JButton("Verde");
        green.setBounds(183, 200, 120, 50);
        green.setForeground(Color.green);
        green.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(green);
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d=3;
            }
        });
        
        blue = new JButton("Azul");
        blue.setBounds(335, 200, 120, 50);
        blue.setForeground(Color.blue);
        blue.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(blue);
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d=2;
            }
        });
        
    }

    private void scrollEvent(){
       

        MouseWheelListener ruedaRaton = new MouseWheelListener() {
                @Override
                public void mouseWheelMoved(MouseWheelEvent a) {
                    
                    if (d!=0){
                        if (d ==1){
                        r -=a.getWheelRotation();
                        if (r<0){
                            r=0;
                        }else if (r>250){
                            r=250;
                            }
                        }else if (d==2){
                            b -=a.getWheelRotation();  
                            if (b<0){
                                b=0;
                            }else if (b>250){
                                b=250;
                            }
                        }else {
                            g -= a.getWheelRotation();
                            if (g<0){
                                g=0;
                            }else if (g>250){
                                g=250;
                            }
                        } 
                        panel.setBackground(new Color (r,g,b));                       
                    }
                    etiqueta.setText("Color (Rojo = "+r+", Verde = "+g+", Azul = "+b+")");
                }
            }; 
            
            panel.addMouseWheelListener(ruedaRaton);
    }

}
