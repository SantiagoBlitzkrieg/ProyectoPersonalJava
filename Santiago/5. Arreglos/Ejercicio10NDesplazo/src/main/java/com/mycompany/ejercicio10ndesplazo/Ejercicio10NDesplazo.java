/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10ndesplazo;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio10NDesplazo {

    public static void main(String[] args) {
        
        int tabla []= new int[10];
        int posiciones;
        int guardando;

        Scanner entrada = new Scanner(System.in);
        
        for (int i= 0; i<10;i++){
            System.out.print((i+1)+". Digite un numero: ");
            tabla[i]= entrada.nextInt();    
        }
       
        System.out.print("Digite el numero de desplazaminetos de su arreglo: ");
        posiciones=entrada.nextInt();
        
        for (int i=1; i<=posiciones;i++){
            guardando=tabla[9];
            for (int j=9;j>0;j--){
                    tabla[j]=tabla[j-1];
            }
            tabla[0]=guardando;
        }
        
        System.out.println("\n Su nueva tabla es: ");
        for (int i=0;i<10;i++){
            System.out.println(tabla[i]);
        }
    }
}
