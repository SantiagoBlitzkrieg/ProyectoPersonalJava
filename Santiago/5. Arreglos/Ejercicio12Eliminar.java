/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12eliminar;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio12Eliminar {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        int eliminar;
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<10; i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextInt();
            
        }
        
        do{
            System.out.println("Digite el espacio del arreglo en el que quiere eliminar un numero: ");
            eliminar = entrada.nextInt();
    
        } while (eliminar >9 || eliminar<0); //EN VEZ DE PONER EL IF, PONGO LA CONDICION EN EL WHILE
         
        for (int i=eliminar; i<9;i++){
            numeros[i]=numeros[i+1];
        }
        
        for(int i= 0; i<9; i++){
            System.out.println(numeros[i]);
        }
    }
}
