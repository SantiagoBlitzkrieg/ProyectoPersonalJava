/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6suma;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio6Suma {

    public static void main(String[] args) {
        int numeros;
        int suma=0;
        
        do {
            numeros=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            suma+= numeros;
            
        }while(numeros!=0);
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros introducidos es de: "+suma);
    }
}
