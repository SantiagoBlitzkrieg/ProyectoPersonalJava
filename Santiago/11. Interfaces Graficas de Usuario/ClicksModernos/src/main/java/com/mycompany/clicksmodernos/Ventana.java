/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clicksmodernos;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
    JButton boton;    
    JLabel etiqueta;
    int i=0;
    
    public Ventana(){
        setSize(300,300);
        setTitle("Clicks Modernos");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        componentes();
    }

    
    private void componentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Pulsa el Botón");
        etiqueta.setBounds(0, 30, 300, 20); // no centrar la etiqueta.. mejor centrar el texto
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
              
        panel.add(etiqueta);
    }
    
    private void colocarBoton(){
        boton = new JButton("Pulsa Aquí");
        boton.setBounds(70, 120, 150, 40);
        boton.setFont (new Font ("Amasis MT Pro Medium",Font.BOLD,20));
        eventoAccion();
        panel.add(boton); //poner de ultimas...


    }
    
    private void eventoAccion(){
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                if (i == 1){
                    etiqueta.setText("Botón pulsado 1 vez");       
                }else{
                    etiqueta.setText("Botón pulsado "+i+ " veces");

                }
            }
        };
        
        boton.addActionListener(oyenteAccion);
    }
    
}
