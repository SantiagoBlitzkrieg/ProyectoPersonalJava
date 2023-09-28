/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_figuras;
import java.util.ArrayList;

/**
 *
 * @author gomez
 */
public class POO_Figuras {

     public static void main(String[] args) {
        
        ArrayList<Object> figuras = new ArrayList();
        figuras.add(new Cubo (5,"rojo"));
        figuras.add(new Triangulo (7,8,"verde"));
        figuras.add(new Circulo (36,"naranja"));
        figuras.add(new Cilindro (4,3,"rojo"));       
        figuras.add(new Rectangulo (5,7,"azul"));
        figuras.add(new Cilindro (3,6,"dorado"));
        figuras.add(new Cubo (1,"negro"));
        figuras.add(new Rectangulo (5,8, "amarillo"));
        figuras.add(new Triangulo (10, 2, "blanco"));   
        figuras.add(new Circulo (4,"gris"));
        
        for (Object objeto: figuras){
            if (objeto instanceof Cubo){
                Cubo cubo = (Cubo) objeto;
                System.out.println("El cubo de color "+cubo.getColor()+" tiene un área de "+String.format("%.2f",cubo.area())+" metros cuadrados");
            } else if (objeto instanceof Cilindro){
                Cilindro cilindro = (Cilindro) objeto;
                System.out.println("El cilindro de color "+cilindro.getColor()+" tiene un área de "+String.format("%.2f",cilindro.area())+ " metros cuadrados");
            } else if (objeto instanceof Triangulo){
                Triangulo triangulo= (Triangulo) objeto;
                System.out.println("El triángulo de color "+triangulo.getColor()+" tiene un área de "+String.format("%.2f",triangulo.area())+ " metros cuadrados");
            } else if (objeto instanceof Circulo){
                Circulo circulo= (Circulo) objeto;
                System.out.println("El círculo de color "+circulo.getColor()+" tiene un área de "+String.format("%.2f",circulo.area())+ " metros cuadrados");
            } else if (objeto instanceof Rectangulo){
                Rectangulo rectangulo= (Rectangulo) objeto;
                System.out.println("El rectángulo de color "+rectangulo.getColor()+" tiene un área de "+String.format("%.2f",rectangulo.area())+ " metros cuadrados");
            }
        }
         
    }
}    

