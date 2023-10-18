/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6mezclas;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio6Mezclas {

    public static void main(String[] args) {
        int numero1 [] = new int [12];
        int numero2 [] = new int [12];
        int tabla3 [] = new int [24];
        int a= 0;
//        int b= 0;
        int j=0;
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<12; i++){
            System.out.print((i+1)+". Inserte numero para la tabla 1: ");
            numero1[i]=entrada.nextInt();
        }
        System.out.println("\n");
        
        for (int i=0; i<12; i++){
            System.out.print((i+1)+". Inserte numero para la tabla 2: ");
            numero2[i]=entrada.nextInt();
        }
        
        while (a<12){

            for (int i=0; i<3; i++){
                tabla3[j]=numero1[a+i];
                j++;        
            }
            for (int i=0; i<3; i++){
                tabla3[j]=numero2[a+i];
                j++;        
            }
            a+=3;
        }
        
        System.out.println("El arreglo resultante es: ");
        
        for (int i=0; i<24; i++){
            System.out.print(tabla3[i]+". ");
        }
    }
}
