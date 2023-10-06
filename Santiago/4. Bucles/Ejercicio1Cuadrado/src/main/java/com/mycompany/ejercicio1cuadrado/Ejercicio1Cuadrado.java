/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1cuadrado;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio1Cuadrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero;
        do{
            System.out.print("Digite un numero positivo al que quiera saber su cuadrado: ");
            numero=entrada.nextFloat();
            if (numero>=0){
            System.out.println("El cuadrado del numero " +numero + " es "+ Math.pow(numero,2));  //Recordar usar Math.pow()
            }else{
            System.out.println("Ese numero no es positivo");
            }
        }while(numero>=0);
    }
}
