/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1leer;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio1Leer {

    public static void main(String[] args) {
        int [] numeros = new int[5];
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.print("Inserte numero: ");
            numeros[i]=entrada.nextInt();  
        }
        System.out.println("Los numeros que introdujo son: ");
        for (int i=0; i<5; i++){
            
            System.out.println(numeros[i]);
        }
    }
}
