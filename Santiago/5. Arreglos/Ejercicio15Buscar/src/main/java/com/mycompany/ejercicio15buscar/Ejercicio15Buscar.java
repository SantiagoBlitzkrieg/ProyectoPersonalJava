/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15buscar;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio15Buscar {

    public static void main(String[] args) {
        int tabla[]= new int [10];
        int numeroBuscado;
        int posicion=0;
        boolean creciente=true;
        boolean existe= false;
        Scanner entrada= new Scanner(System.in);
        
        do{
            for (int i=0; i<10; i++){

                System.out.print((i+1)+ ". Digite un numero entero de forma creciente: ");
                tabla[i]=entrada.nextInt();
            }
            
            for (int i=0; i<9; i++){
                if(tabla[i]>=tabla[i+1]){
                    creciente=false;
                    System.out.println("Los numeros que digito no estan ordenados de forma ascendente");
                    break;
                }
            }
        }while (creciente==false);
        
        System. out.println("Escoja el numero que quiere buscar dentro del array: ");
        numeroBuscado=entrada.nextInt();
        
        for (int i=0; i<10; i++){
            if (tabla[i]==numeroBuscado){
                posicion=i;
                existe=true;
                break;
            }
        }
        
        for (int i=0; i<10; i++){
            System.out.println(tabla[i]);
        }
        
        if (existe == true){
            System.out.println("\nEl numero "+ numeroBuscado+ " se encuentra en la posicion "+posicion);
        }else{
            System.out.println("\nEl numero "+ numeroBuscado+ " no se encuentra en el arreglo");
        }
        
        /* //Había otra forma de hacerlo por medio del while:
            int i=0;
            while(tabla[i]!=numeroBuscado && i<10){
                i++;
            }
            
            if (i==10){
                System.out.println("\nEl numero "+ numeroBuscado+ " no se encuentra en el arreglo");
            }else{
                System.out.println("\nEl numero "+ numeroBuscado+ " se encuentra en la posicion "+i);    
            }
        
        */ //Siempre era más sencillo asi
    }
}
