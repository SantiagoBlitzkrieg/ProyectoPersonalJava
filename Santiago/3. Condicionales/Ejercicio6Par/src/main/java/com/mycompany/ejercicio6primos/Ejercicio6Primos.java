/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6primos;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio6Primos {

    public static void main(String[] args) {
        int numero1;
        int numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte numero entero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte numero entero 2: "));

        if ( numero1%2==0 && numero2%2==0){  //Ese && es para poner DOS condicioes... es un and... Es un condicional compuesto.
           JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        }
        else if(numero1%2==0 && numero2%2!=0){
           JOptionPane.showMessageDialog(null, "El numero "+numero1+" es par, y el numero "+numero2+" es impar.");
 
        }
        else if(numero1%2!=0 && numero2%2==0){
           JOptionPane.showMessageDialog(null, "El numero "+numero1+" es impar, y el numero "+numero2+" es par.");

        }
        else{
        JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
        }
     
    
    }
}


