/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11orden;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio11Orden {

    public static void main(String[] args) {
        int numeros[]= new int[10];
        int numeroNuevo;
        Scanner entrada= new Scanner(System.in);
        
        for (int i=0;i<5; i++){
            System.out.print((i+1)+". Digite un numero entero: ");
            numeros[i]= entrada.nextInt();         
        }
        for (int i=0; i<3; i++){
            System.out.println("Seleccione un nuevo numero: ");
            numeroNuevo=entrada.nextInt();
            int j=0;        
            while (numeroNuevo>numeros[j] && j<=(4+i)){
                j++;
            }
            
            for (int a=9; a>j; a--){
                numeros[a]=numeros[a-1];
            }
            
            numeros[j]=numeroNuevo; 
 
        }
                    
        for (int i=0;i<10; i++){
            System.out.println(numeros[i]); 
        }
    }    
}
