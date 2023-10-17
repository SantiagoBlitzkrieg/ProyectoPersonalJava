/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21mostrarnegativo;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio21MostrarNegativo {

    public static void main(String[] args) {
        int numero;
        boolean positivo = true;
        for (int i = 1; i<=10;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte algun numero positivo"));
            if (numero<0){
                positivo =false;
            }  
        }
        while(positivo ==false){
            JOptionPane.showMessageDialog(null, "Digitaste un numero negativo bro, mal hecho");
            positivo =true;
        }
    }
}
