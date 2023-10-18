/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3media;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio3Media {

    public static void main(String[] args) {
        int numeros[]=new int[5];
        float mediaPositivos = 0;
        int cantidadPositivos=0;
        int cantidadNegativos=0;
        float mediaNegativos =0;
        int cantidadCeros=0;
        
        
        Scanner entrada= new Scanner(System.in);
        
        for (int i=0; i<5; i++){
            System.out.print("Digite numero: ");
            numeros[i]= entrada.nextInt();
            
             if (numeros[i]==0){
               cantidadCeros++; 
            }else if(numeros[i]<0){
                cantidadNegativos++;
                mediaNegativos+=numeros[i];
            }else{
                cantidadPositivos++;
                mediaPositivos+=numeros[i];
            }
             
        }
        mediaNegativos/=cantidadNegativos;
        mediaPositivos/=cantidadPositivos;
        
        System.out.println("La media de los numeros positivos es de: "+mediaPositivos);
        System.out.println("La media de los numeros negativos es de: "+mediaNegativos);
        System.out.println("La cantidad de ceros es de: "+cantidadCeros);
        
    }
}
