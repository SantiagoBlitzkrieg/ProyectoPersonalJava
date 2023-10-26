/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7orden;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio7Orden {

    public static void main(String[] args) {
        int numeros[]= new int [10];
        int orden=0;
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<10; i++){
            System.out.print((i+1)+". Ingrese un numero entero: ");;
            numeros[i]=entrada.nextInt();
        }
        
        for(int i=0; i<9; i++){
           if (numeros[i]<numeros[i+1]){
               orden++; 
           }else {
               orden--;
           }
        }
        
        if (orden==9){   //PODIA HACER EL CODIGO UN POCO MAS SIMPLE USANDO BOOLEANOS... 
            System.out.println("Los numeros están ordenados de forma creciente");
        }else if (orden ==-9){
            System.out.println("Los numeros están ordenados de forma decreciente");
        }else {
            System.out.println("Los numeros están desordenados");

        }
        
    }
}
