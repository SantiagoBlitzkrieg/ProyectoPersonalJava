/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5string;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio5String {

    public static void main(String[] args) {
        String numero1[] = new String[10];
        String numero2[]= new String[10];
        String combinacion[]=new String[10];
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.print("\nDigite un numero para el primer arreglo: ");
            numero1[i]=entrada.nextLine();
            
            System.out.print("\nDigite un numero para el segundo arreglo: ");
            numero2[i]=entrada.nextLine();
            
            combinacion[i]=numero1[i]+numero2[i];
        }
        
        System.out.print("La combinacion de ambos arreglos es: ");
        for (int i=0; i<10; i++){
            System.out.print(combinacion[i]+". ");
        }
        
        
    }
}
