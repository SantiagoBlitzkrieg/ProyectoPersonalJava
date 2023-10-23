/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoseleccion;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class OrdenamientoSeleccion {

    public static void main(String[] args) {
        int numeros [];
        int nElementos;
        int aux;
        int min;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el numero de espacios que tendra el arreglo: ");
        nElementos= entrada.nextInt();
        
        numeros= new int[nElementos];
        

        System.out.println("\n");
        
        for (int i=0; i<nElementos;i++){
            System.out.print((i+1)+". Digite numero: ");
            numeros[i]=entrada.nextInt();
        }
        
        for (int i=0; i<(nElementos);i++){
            min=i;
            for (int j=i+1;j<nElementos;j++){
                if (numeros [j]< numeros[min]){
                    min=j;
                }
            }
            aux=numeros[i];
            numeros[i]= numeros[min];
            numeros[min]=aux;
        }
        for (int i=0; i<nElementos;i++){
            System.out.println(numeros[i]);
        }
    }
}
