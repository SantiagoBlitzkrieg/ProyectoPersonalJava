/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14copiar;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio14Copiar {

    public static void main(String[] args) {
        int tabla1[]= new int[10];
        int tabla2[]= new int[10];
        int tabla3[]=new int[20];
        int a=0;
        int b=0;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite los valores de la Tabla 1: ");
        for (int i=0; i<10; i++){
            System.out.print((i+1) +". Digite un numero: ");
            tabla1[i]=entrada.nextInt();
        }
        System.out.println("Digite los valores de la Tabla 2: ");

        for (int i=0; i<10; i++){
            System.out.print((i+1) +". Digite un numero: ");
            tabla2[i]=entrada.nextInt();
        }

        for(int i=0; i<20;i++){
            
            if(a==10){
                tabla3[i]=tabla2[b];
                b++;
            }else if(b==10){
                tabla3[i]=tabla1[a];
                a++;
            }else if (tabla1[a]<tabla2[b]){
                tabla3[i]=tabla1[a];
                a++;    
            }else if (tabla1[a]>=tabla2[b]){
                tabla3[i]=tabla2[b];
                b++;
            }
        } 
        
        for(int i=0; i<20; i++){
            System.out.println(tabla3[i]);
        }
        
    }
}
