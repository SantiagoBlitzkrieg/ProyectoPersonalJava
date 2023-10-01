/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadores;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Operadores {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float calificacion1;
        float calificacion2;
        float calificacion3;
        float suma=0;
        
        System.out.println("Digite su primera calificacion ");
        calificacion1=entrada.nextFloat(); //DEBE PONERSE , YA QUE AL PONER . SE DAÑA EL PROGRAMA
        System.out.println("Digite su segunda calificacion ");
        calificacion2=entrada.nextFloat();
        System.out.println("Digite su tercera calificacion ");
        calificacion3=entrada.nextFloat();
        
        suma=calificacion1+calificacion2+calificacion3;
        System.out.println("La suma es "+suma);
    }
}
