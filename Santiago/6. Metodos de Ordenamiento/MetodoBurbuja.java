/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodoburbuja;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class MetodoBurbuja {

    public static void main(String[] args) {
        int numeros [];
        int nElementos;
        int aux;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el numero de espacios que tendra el arreglo: ");
        nElementos= entrada.nextInt();
        
        numeros= new int[nElementos];
        

        System.out.println("\n");
        
        for (int i=0; i<nElementos;i++){
            System.out.print((i+1)+". Digite numero: ");
            numeros[i]=entrada.nextInt();
        }
        
        for (int i=0; i<(nElementos-1);i++){
            for (int j=0; j<(nElementos-1);j++){
                if (numeros[j]>numeros[j+1]){
                    aux = numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros [j+1]=aux;
                }
            }
        }
        
        for (int i=0; i<nElementos; i++){
            System.out.println(numeros[i]);
        }
    }
}
