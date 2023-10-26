/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1multiplo10;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio1Multiplo10 {

    public static void main(String[] args) {
        int  numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
        
        if (numero%10==0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero " + numero + " NO es multiplo de 10");

        }
        
        
    }
}
