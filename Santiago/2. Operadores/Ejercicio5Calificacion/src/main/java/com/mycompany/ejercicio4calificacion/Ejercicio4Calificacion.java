/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4calificacion;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio4Calificacion {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       float participacion;
       float primerParcial;
       float segundoParcial;
       float examenFinal;
       float calificacionFinal; // Es float porque va a estar condicionado solo a 2 decimales... si no seria double
       
       System.out.print("Nota paricipacion: ");
       participacion=entrada.nextFloat();
       System.out.print("Nota primer parcial: ");
       primerParcial=entrada.nextFloat();
       System.out.print("Nota segundo parcial: ");
       segundoParcial=entrada.nextFloat();
       System.out.print("Nota examen final: ");
       examenFinal=entrada.nextFloat();
    
       calificacionFinal = (participacion*0.1f)+(primerParcial*0.25f)+(segundoParcial*0.25f)+(examenFinal*0.4f); // MIREN ESAS f
       //ME CONDICIONA QUE SOLO VA A TRABAJAR CON DOS DECIMALES.
        System.out.println("Su calificación final es de "+calificacionFinal);
       
    }
}
