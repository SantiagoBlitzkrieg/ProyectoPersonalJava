/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4gauss;

import java.util.Scanner;


/**
 *
 * @author gomez
 */
public class Ejercicio4Gauss {

    public static void main(String[] args) {
        float numero[]= new float [10];
        Scanner entrada = new Scanner (System.in);
        for (int i =0; i<10 ; i++){
            System.out.print((i+1)+". Inserte un numero: ");
            numero[i]=entrada.nextFloat();        
        }  
            System.out.println("\n");
        for (int i =0; i<5 ; i++){
            
            System.out.println((i+1)+ ". "+numero[i]);
            System.out.println((10-i)+ ". "+numero[(9-i)]);

        } 
       
    
    }
}
