/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejericio15edades;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejericio15Edades {

    public static void main(String[] args) {
        int edad;
        float edadMedia=0;
        float altura;
        float alturaMedia=0;
        int cantidadMayores=0;
        int cantidadAltos=0;
        
        for (int i=1; i<=5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
            edadMedia+=edad;
            if (edad>18){
                cantidadMayores++;
            }
            
            altura= Float.parseFloat(JOptionPane.showInputDialog("Digite la estatura"));
            alturaMedia+=altura;
            if (altura>1.75){
                cantidadAltos++;
            }
        }
        
        edadMedia/=5;
        alturaMedia/=5;
        
        System.out.println("La edad promedio de los estudiantes es de: "+edadMedia);
        System.out.println("La cantidad de estudiantes mayores de 18 años es de: "+cantidadMayores);
        System.out.println("La altura promedio de los estudiantes es de: "+alturaMedia);
        System.out.println("La cantidad de estudiantes con una estatura mayor a 1.75 es de: "+cantidadAltos);
    }
}
