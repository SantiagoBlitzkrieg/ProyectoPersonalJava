/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1cuadrilatero;

/**
 *
 * @author gomez
 */
public class Ejercicio1Cuadrilatero {

    public static void main(String[] args) {
        Cuadrilatero rectangulo = new Cuadrilatero(17,5);
        Cuadrilatero cuadrado = new Cuadrilatero(4);
        
        System.out.println("El area del rectangulo es: "+ rectangulo.getArea()+" y su perimetro es: "+ rectangulo.getPerimetro());
        System.out.println("El area del cuadrado es: "+ cuadrado.getArea()+" y su perimetro es: "+ cuadrado.getPerimetro());
    }
    
    
}
