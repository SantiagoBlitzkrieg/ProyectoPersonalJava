/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5adivinanza;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio5Adivinanza {

    public static void main(String[] args) {
        int numeroJuego;
        int numero;
        int intentos=0;
        numeroJuego= (int) (Math.random()*100);  // genera un numero entrre 1-100
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero en el que estoy pensando"));
        
        do{
            if(numero<numeroJuego){
               numero = Integer.parseInt(JOptionPane.showInputDialog("El numero es mayor que "+numero));
            }else{
               numero = Integer.parseInt(JOptionPane.showInputDialog("El numero es menor que "+numero));   
            }
            intentos++;
        }while (numero!=numeroJuego);
        
        JOptionPane.showMessageDialog(null, "Despues de "+intentos+ " intentos, ha adivinado el numero :D");
    }
}
