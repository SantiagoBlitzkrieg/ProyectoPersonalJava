/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6cuadratica;
import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio6Cuadratica {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double a;
        double b;
        double cuadratica;
        
        System.out.println("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b: ");
        b = entrada.nextDouble();
        
        cuadratica=  Math.pow(a, 2)+Math.pow(b, 2)+2*a*b;
        //cuadratica=  Math.pow(a+b, 2);
        System.out.println("El cuadrado de la suma es: "+cuadratica);
        
    }
}
