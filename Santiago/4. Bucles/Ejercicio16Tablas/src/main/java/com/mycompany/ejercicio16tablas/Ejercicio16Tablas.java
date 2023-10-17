/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16tablas;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio16Tablas {

    public static void main(String[] args) {
        int numero;
        int multiplicar;
        
          
            
        do{
           numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero del 1 al 10 para saber sus tablas de multiplicar"));
           
        }while (numero > 10 || numero < 0 );
        
        
        System.out.println("La tabla de multiplicar de "+numero+" es:");
        for (int i=0; i<=10; i++){
            multiplicar = numero*i;
            System.out.println(numero+" * "+i+" = "+multiplicar);        
            }
        
    }
    
}
