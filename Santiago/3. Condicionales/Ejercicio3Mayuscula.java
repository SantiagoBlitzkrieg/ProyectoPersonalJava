/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3mayuscula;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gomez
 */
public class Ejercicio3Mayuscula {

    public static void main(String[] args) {
        char caracter;
        char caracterMayuscula;
        caracter = JOptionPane.showInputDialog("digite un caracter").charAt(0); //recordar que ese charAt me convierte String a char
        caracterMayuscula = Character.toUpperCase(caracter); //La convierte en mayuscula.
        
        if (caracter == caracterMayuscula) { //Tambien se podia hacer if(character.isUpperCase(caracter){};
            JOptionPane.showMessageDialog(null, "El caracter esta en mayuscula ");   
        }
        else{
            JOptionPane.showMessageDialog(null, "El caracter esta en minuscula ");
        }
    }
}
