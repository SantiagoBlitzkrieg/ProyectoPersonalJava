/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13paresimpares;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio13ParesImpares {

    public static void main(String[] args) {
        int numeros[]= new int [10];

        int a=0;
        int b=0;
        Scanner entrada = new Scanner(System.in);
        
        for (int i =0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextInt(); 
            if(numeros[i]%2==0){
                a++;
            }else{
                b++;
            }
        }
        
        int pares []= new int[a]; //Asi ya se cuantos espacios necesita mi arreglo
        int impares []= new int[b];
        a=0;
        b=0;
        
        for (int i=0; i<10; i++){
            if (numeros[i]%2==0){
                
                pares[a]=numeros[i];
                a++;
            }else{
                impares[b]=numeros[i];
                b++;
            }
        }
        
        System.out.println("Los numeros impares son: ");

        for (int i=0; i<b; i++){
            System.out.println(impares[i]);
        }
        
        System.out.println("Los numeros pares son: ");

        for (int i=0; i<a; i++){
            System.out.println(pares[i]);
        }
    }
}
