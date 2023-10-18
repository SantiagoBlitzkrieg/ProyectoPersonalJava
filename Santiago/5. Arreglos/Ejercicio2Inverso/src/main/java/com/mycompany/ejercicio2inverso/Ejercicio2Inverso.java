/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2inverso;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio2Inverso {

    public static void main(String[] args) {
        float numeros[]=new float[5];
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<5; i++){  //No puedo usar el for each porque aun no tengo elementos en numeros
            System.out.print((i+1)+". Digite un numero: ");
            numeros [i] = entrada.nextFloat();
        }
        
        System.out.println("Los numeros que usted digito ordenados de maner inversa son: ");
        for (int i=4; i>=0; i--){
            System.out.println(numeros[i]);
        }
        
    }
}
