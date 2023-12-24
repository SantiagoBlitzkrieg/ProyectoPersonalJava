/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Excepciones {

    public static void main(String[] args) throws FileNotFoundException, IOException {
    /*    //Excepciones Verificadas (IOExcepcion)
            //Lectura de archivo txt
            BufferedReader bf = new BufferedReader (new FileReader("C:\\Users\\gomez\\Documents\\Santiago Gómez Camargo\\Programacion\\ProyectoPersonalJava\\Santiago\\Notas\\Prueba.txt"));
            //Elimino el prueva.txt :D
            String linea;
            while ((linea=bf.readLine())!=null){
                System.out.println(linea);
            }
    */
    /*    //Excepciones NO Verificadas (RunTimeExcepcion)
            //Divisiones entre cero
            int num1=5, num2=0, resultado;
            
            resultado = num1/num2;
            System.out.println(resultado);
    */
  
    } 
    
        
    /*    //Excepciones Personalizadas
            //Primero necesitamos una clase Excepcion
            public class Excepcion0 extends Exception(){
                public Exception0(){
                    super ("Se ha introducido un 0"); 
                }
            }
            
            //Luego, en la clase principal:
            
            public class PruebaExcepciones {
                private int numero;
                private Scanner entrada;
                
                public void introducirNumero() throws Excepcion0{
                    entrada = new Scanner (System.in);
                    
                    do {
                        System.out.println("Digite un numero");
                        numero = entrada.nextInt();
                        
                        if (numero==0){ //Quiero que se produzca una excepcion personalizada
                            throw new Excepcion0(); //Lanzo un obeto de tipo Exception0 //Me daria error porque... es una excepcion! Para eso pongo el throws
                        }
                    } while (numero!=0);
                }
                
                public static void main(String[]args){
                    PruebaExcepciones prueba = new PruebaExcepciones();
                    
                    try{    
                        prueba.introducirNumero();
                    }catch (Excepcion0 e){
                        System.out.println("Ha introducido el numero 0");
                    }
                    
                    System.out.println("Programa terminado");
                }
            }
    */
}
