/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9dezplazando;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio9Dezplazando {

    public static void main(String[] args) {
        int tabla []= new int[10];
        int guardando;

        Scanner entrada = new Scanner(System.in);
        
        for (int i= 0; i<10;i++){
            System.out.print((i+1)+". Digite un numero: ");
            tabla[i]= entrada.nextInt();    
        }

        guardando=tabla[9];
        for (int i=9;i>0;i--){
            tabla[i]=tabla[i-1];
        }
        tabla[0]=guardando;
        
        System.out.println("\n Su nueva tabla es: ");
        for (int i=0;i<10;i++){
            System.out.println(tabla[i]);
        }
    }
}
