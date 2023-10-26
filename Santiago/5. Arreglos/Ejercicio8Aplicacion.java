/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8aplicacion;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio8Aplicacion {

    public static void main(String[] args) {
        int tabla []= new int[10];
        int nuevoNumero;
        int orden;
        Scanner entrada = new Scanner(System.in);
        
        for (int i= 0; i<8;i++){
            System.out.print("Digite un numero: ");
            tabla[i]= entrada.nextInt();    
        }
        

        System.out.println("Inserte un nuevo numero para la tabla: ");
        nuevoNumero=entrada.nextInt();
        
        System.out.println("Inserte la posicion de la tabla en la que quiera insertar un nuevo numero: ");
        orden= (entrada.nextInt()-1);
        
        if (orden<8){
            for (int i=8;i>orden;i--){
                tabla[i]=tabla[i-1];
            }
        }
        tabla[orden]=nuevoNumero;
        
        System.out.println("\n Su nueva tabla es: ");
        for (int i=0;i<10;i++){
            System.out.println(tabla[i]);
        }
   }
}
