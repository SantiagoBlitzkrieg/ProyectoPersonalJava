/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4carros;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio4Carros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float salario=1000;
        int ventas;
        float valorCarros;
        
        System.out.print("Cuanto cuestan los autos este mes: ");
        valorCarros = entrada.nextFloat();
        System.out.print("Cuantos autos vendio el empleado: ");
        ventas = entrada.nextInt();
        
        salario = salario+(150*ventas)+(((valorCarros*5)/100)*ventas);
        System.out.println("El salario del empleado es "+salario);
    }
}
