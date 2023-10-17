/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19alumnos;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio19Alumnos {

    public static void main(String[] args) {
        float notas;
        int aprobados=0;
        int condicionados=0;
        int suspensos=0;
        
        for (int i=1; i<=6; i++){
            do{
                notas=Float.parseFloat(JOptionPane.showInputDialog("Ingrese las notas del alumno"));
            }while (notas<0 || notas>10);
            if (notas>4){
                aprobados++;
            }else if(notas==4){
                condicionados++;
            }else{
                suspensos++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es de: "+aprobados);
        System.out.println("La cantidad de alumnos condicionados es de: "+condicionados);
        System.out.println("La cantidad de alumnos reprobados es de: "+suspensos);
    }
}
