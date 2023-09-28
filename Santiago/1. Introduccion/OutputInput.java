/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.outputinput;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class OutputInput {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        int numero;
        
        System.out.println("Digite su nombre: ");
        //cadena = entrada.next(); //guarda la cadena hasta \n lo cual puede generar errores
        cadena = entrada.nextLine();
        
        System.out.println ("El nombre es "+cadena);
        
        
        System.out.println("Digite un numero entero: " );
        
        numero = entrada.nextInt();
                
        System.out.println ("El numero es: " + numero);
    }    
}
