/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8raices;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio8Raices {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        double a;
        double b;
        double c;
        double raiz1;
        double raiz2;
        
        System.out.print("Digite el valor de a: ");
        a= entrada.nextDouble();
        System.out.print("Digite el valor de b: ");
        b= entrada.nextDouble();
        System.out.print("Digite el valor de c: ");
        c= entrada.nextDouble();
        
        raiz1 = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a;
        raiz2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a;
        
        System.out.println("Las raices del polinomio son x: "+raiz1+", "+raiz2);
        
    }

}