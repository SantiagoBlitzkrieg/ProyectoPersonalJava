/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8mostrarno;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio8MostrarNo {

    public static void main(String[] args) {
        int numero;
        int i=1;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while (i<=numero){
            System.out.println(i);
            i++;
        }
        





    //Tambien se podia resolver por for:
        /*for (int i=1; i<=numero; i++){
            System.out.println(i);
        }*/
    }
}
