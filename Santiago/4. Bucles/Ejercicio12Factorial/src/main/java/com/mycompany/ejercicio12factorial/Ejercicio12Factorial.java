/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12factorial;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio12Factorial {

    public static void main(String[] args) {
        long factorial=1;
        int numeroN;
        numeroN= Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero"));
        
        for (int i=1; i<=numeroN;i++){
            factorial*=i;
        }
        System.out.println("El factorial del numero "+numeroN+ " es: " +factorial);      
    }
}
