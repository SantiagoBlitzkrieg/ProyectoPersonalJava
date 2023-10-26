/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3dolares;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio3Dolares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo;
        float luis;
        float juan;
        float total;
        
        System.out.print("Cuantos dolares tiene Guillermo: ");
        guillermo = entrada.nextFloat();
        luis = guillermo/2;
        juan = (luis+guillermo)/2;
        total = luis+juan+guillermo;
        System.out.println("El total de dolares que tiene Luis es de: "+luis);
        System.out.println("El total de dolares que tiene Juan es de: "+juan);
        System.out.println("El total de dolares que tienen entre los tres es de: "+total);
        
        
        
        
    }
}
