/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2positivo;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio2Positivo {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero"));
        
        while (numero!=0){
            if (numero>0){
                JOptionPane.showMessageDialog(null,"El numero "+numero+ " es positivo");
            }else{
                 JOptionPane.showMessageDialog(null,"El numero "+numero+ " es negativo");              
            }
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero"));
        }
    }
}
