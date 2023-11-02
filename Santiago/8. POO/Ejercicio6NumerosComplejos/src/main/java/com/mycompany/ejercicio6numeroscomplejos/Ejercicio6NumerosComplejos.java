/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6numeroscomplejos;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio6NumerosComplejos {
    
//    static String multiplicar (NumerosComplejos numero[]){     //Hay una forma de hacerlo desde la clase NumerosComplejos que al parecer es mas eficiente.
//        Double multReal;                                       //Sin embargo... que linda manera de resolver el problema.
//        Double multIma;
//        multReal = ((numero[0].getParteReal()*numero[1].getParteReal())-(numero[0].getParteImaginaria()*numero[1].getParteImaginaria()));
//        multIma = ((numero[0].getParteReal()*numero[1].getParteImaginaria())+(numero[0].getParteImaginaria()*numero[1].getParteReal()));
//        
//        NumerosComplejos numeroMultiplicado = new NumerosComplejos(multReal, multIma);
//        return "La multiplicacion de los numeros introducidos es "+ numeroMultiplicado.mostrarDatos();
//    }
//    static String sumar (NumerosComplejos numero[]){
//        Double sumReal;
//        Double sumImag;
//        
//        sumReal=numero[0].getParteReal()+numero[1].getParteReal();
//        sumImag= numero[0].getParteImaginaria()+numero[1].getParteImaginaria();
//        
//        NumerosComplejos numeroSumado = new NumerosComplejos(sumReal, sumImag);
//        return "La suma de los numeros introducidos es "+ numeroSumado.mostrarDatos();
//    }
//    
//    static String comparar (NumerosComplejos numero[]){
//        
//        if (numero[0].getParteReal()==numero[1].getParteReal() && numero[0].getParteImaginaria()== numero[1].getParteImaginaria()){
//            return "Los numeros introducidos son iguales";
//        }else{
//            return "Los numeros introducidos no son iguales";
//        }
//        
//    }
    
    public static void main(String[] args) {
        Double real;
        Double imaginario;
        NumerosComplejos numero[] = new NumerosComplejos[2];
        Scanner entrada = new Scanner (System.in);
        
        for (int i=0; i<2; i++){

            System.out.println("Digite la parte real del numero " +(i+1)+ ": ");
            real = entrada.nextDouble();
            System.out.println("Digite la parte imaginaria: ");
            imaginario = entrada.nextDouble();
            
            numero[i]= new NumerosComplejos(real, imaginario);
            System.out.println("El numero introducido es "+ numero[i].mostrarDatos());                    
        }
        
        System.out.println(numero[0].comparando(numero[1]));
        System.out.println("La suma de los numeros introducidos es "+numero[0].calculaSuma(numero[1]).mostrarDatos());
        System.out.println("La multiplpicacion de los numeros introducidos es "+numero[0].calculaMultiplicacion(numero[1]).mostrarDatos());
    }    
}
