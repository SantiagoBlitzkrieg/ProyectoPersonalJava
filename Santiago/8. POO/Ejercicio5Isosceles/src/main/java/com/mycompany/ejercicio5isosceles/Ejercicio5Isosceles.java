/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5isosceles;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio5Isosceles {
    
    public static int AreaMayor (Isosceles triangulo[]){
      
        double area;
        int indice=0;
        
        area = triangulo[0].obtenerArea();
        
        for (int i=1; i < triangulo.length; i++){
            if (triangulo[i].obtenerArea()>area){
                area = triangulo[i].obtenerArea();
                indice=i;
            }
        }
        
        return indice;
      
        
    }

    public static void main(String[] args) {

        Double base;
        Double lados2;
        int noTriangulos;
        int indice;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Seleccione el numero de triangulos que va a digitar: ");
        noTriangulos=entrada.nextInt();
        
        Isosceles triangulo[]= new Isosceles [noTriangulos]; 
        
        for (int i=0; i<noTriangulos;i++){  
            System.out.println("A continuacion colocara las propiedades del triangulo "+(i+1));
            System.out.print("Digite los lados del triangulo "+(i+1)+": ");
            lados2 = entrada.nextDouble();
            System.out.print("Digite la base del triangulo "+(i+1)+": ");
            base = entrada.nextDouble();
            triangulo[i]= new Isosceles(base, lados2);
        }
 

        for (int i=0; i<triangulo.length; i++){
             System.out.println("El triangulo "+(i+1)+ triangulo[i].mostrarDatos()); 
        }
        
        indice = AreaMayor(triangulo);      
        System.out.println("El triangulo con mayor area es el triangulo "+ indice + " con un area de " + triangulo[indice].obtenerArea());

    }
}
