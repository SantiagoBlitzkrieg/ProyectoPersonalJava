/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2salario;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio2Salario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salarioHora;
        int horasTrabajadas;
        float salario;
        
        System.out.println("Digite su salario por hora");
        salarioHora=entrada.nextFloat();
        System.out.println("Digite las horas trabajadas durante la semana");
        horasTrabajadas= entrada.nextInt();
        
        salario= horasTrabajadas*salarioHora;
        System.out.println ("Su salario semanal es "+salario);
        
        
        
    }
}
