/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14sueldos;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio14Sueldos {

    public static void main(String[] args) {
        int sueldo;
        int sumaSueldos=0;
        int sueldosMayores=0;
        for (int i=1; i<=10; i++){
            sueldo= Integer.parseInt(JOptionPane.showInputDialog("Inserte su sueldo"));
            sumaSueldos+=sueldo;
            if (sueldo>1000){
                sueldosMayores++;
            }
        }
        System.out.println("La suma de todos los sueldos es de: $"+sumaSueldos);
        System.out.println("Existen "+sueldosMayores+" MAYORES A $1000");    
    }
}
