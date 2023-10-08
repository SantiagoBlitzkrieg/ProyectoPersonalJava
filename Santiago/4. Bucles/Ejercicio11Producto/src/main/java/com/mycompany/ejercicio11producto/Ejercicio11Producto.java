/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11producto;

/**
 *
 * @author gomez
 */
public class Ejercicio11Producto {

    public static void main(String[] args) {
        long multiplicacion=1;
        int numeroImpar=1;
        for(int i=1;i<=10;i++){
            multiplicacion*=numeroImpar;
            numeroImpar+=2;
        }
        System.out.println("El resultado de la multiplicacion es "+multiplicacion);
    }
}
