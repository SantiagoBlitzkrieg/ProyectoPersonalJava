/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7media;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio7Media {

    public static void main(String[] args) {
        int numero;
        int nVeces=0;
        float media=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero positivo"));
        
        while (numero >=0){
            media+=numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero positivo"));
            nVeces++;
        }
        if (nVeces!=0){
            media/=nVeces;
            JOptionPane.showMessageDialog(null, "La media de todos los numeros positivos ingresados es: "+media);
        }else{
            JOptionPane.showMessageDialog(null, "No se coloco ningun numero positivo");
        }
        
       
    }
}
