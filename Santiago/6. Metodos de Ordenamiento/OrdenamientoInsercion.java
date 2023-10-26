/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoinsercion;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class OrdenamientoInsercion {

    public static void main(String[] args) {
        int numeros [];
        int nElementos;
        int aux;
        int j;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el numero de espacios que tendra el arreglo: ");
        nElementos= entrada.nextInt();
        
        numeros= new int[nElementos];
        

        System.out.println("\n");
        
        for (int i=0; i<nElementos;i++){
            System.out.print((i+1)+". Digite numero: ");
            numeros[i]=entrada.nextInt();
        }
        
        for (int i=0;i<nElementos;i++){
            j=i;
            aux=numeros[i];

            while((j>0) && numeros[j-1]<aux){

                numeros[j]=numeros[j-1];
                j--;
            }
            numeros[j]=aux;  
        }
        for(int i=0; i<nElementos;i++){   
            System.out.println(numeros[i]);
        }
   
    }
}
