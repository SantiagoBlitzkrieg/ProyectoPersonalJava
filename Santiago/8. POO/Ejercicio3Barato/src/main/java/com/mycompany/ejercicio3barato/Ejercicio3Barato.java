/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3barato;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio3Barato {
    
    //Creamos el metodo para saber cual es el coche más barato
    //Tomar en cuenta que el metodo es estatico, osea, le pertenece a la clase, y no necesita de un objeto para ser instanciado
    public static int indiceCocheMBarato(Vehiculo coches[]){   //Le vamos a pasar como parametro un arreglo de objetos de la clase Vehiculo  
        float precio;
        int indice=0;
        
        precio =coches[0].getPrecio();  //Estoy encontrando el arreglo menor tal y como lo hacia con los arrays, con la unica particularidad de que en este caso el array contiene objetos
        for(int i=1; i< coches.length; i++){
            if (coches [i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        
        return indice;
    } 

    public static void main(String[] args) {
        String marca;
        int modelo;
        int precio;
        int noCarros;
        int indice;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Seleccione el numero de carros que va a digitar: ");
        noCarros=entrada.nextInt();
        
        Vehiculo coches[]= new Vehiculo [noCarros];   //Creamos los objetos para los carros por medio de un array 
        
        for (int i=0; i<noCarros;i++){   //en la parte de noCarros tambien puedo poner coches.length, lo cual significa que sea menor hasta la cantidad de elementos del arreglo.
            System.out.println("Digite la marca del Carro "+(i+1));
            marca = entrada.next();
            
            System.out.println("Digite el modelo del Carro "+(i+1));
            modelo = entrada.nextInt();
            
            System.out.println("Digite el precio del Carro "+(i+1));
            precio = entrada.nextInt();
            
            coches[i]= new Vehiculo (marca, modelo, precio);
        }
        
        indice = indiceCocheMBarato(coches);   //Aqui le asigno a mi variable indice lo que retorna la clase indiceCocheMBarato
        
        coches[indice].mostrarDatos();     //Vemos que el indice que queda es el del coche mas barato.
        
        
    }
}
