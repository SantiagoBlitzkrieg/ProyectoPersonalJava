/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9poligonos;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio9Poligonos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float lado1;
        float lado2;
        int noFiguras;
        int numero=0;
        
        System.out.println("Hola, digite el numero de figuras que va a introducir: ");
        noFiguras= entrada.nextInt();
        Poligono figura[]= new Poligono [noFiguras]; 
        for (int i=0; i<noFiguras; i++){
            do{
                System.out.print("Si lo que va a digitar es un triangulo presione 1"
                        + "\nSi lo que va a digitar es un rectangulo presione 2\n");
                numero = entrada.nextInt();
                if (numero==1){
                    System.out.print("Digite la base del triangulo: ");
                    lado1 = entrada.nextFloat();
                    System.out.print("Digite la altura del triangulo: ");
                    lado2 = entrada.nextFloat();
                    
                    figura [i] = new Triángulo (lado1, lado2);
                } else if(numero==2){
                    System.out.print("Digite la base del rectangulo: ");
                    lado1 = entrada.nextFloat();
                    System.out.print("Digite la altura del rectangulo: ");
                    lado2 = entrada.nextFloat();
                    figura[i] = new Rectángulo (lado1, lado2);
                } else {
                    System.out.println("Opción inválida");
                } 
            }while (numero !=1 && numero !=2);
            System.out.println("Figura Registrada");
        }
        
        for (int i=0; i<noFiguras; i++){
            System.out.println((i+1)+". "+figura[i].toString()+"tiene un area de "+figura[i].area());
        }
        
    }
}
