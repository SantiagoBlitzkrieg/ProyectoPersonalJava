/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16appnotas;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio16AppNotas {

    public static void main(String[] args) {
        float notaGrupo1Semestre[]= new float [5];
        float notaGrupo2Semestre[]= new float [5];
        float notaGrupo3Semestre[]= new float [5];
        float notaMedia[]=new float[3];
        int alumno;
        float mediaAlumno;
        Scanner entrada= new Scanner(System.in);
        
        for (int i=0; i<5; i++){   
            System.out.print("Digite la nota del alumno "+(i+1)+" durante el primer trimestre: ");
            notaGrupo1Semestre[i]=entrada.nextFloat();
            notaMedia[0]+=notaGrupo1Semestre[i];
        }
        System.out.println("\n");
        
        for (int i=0; i<5; i++){   
            System.out.print("Digite la nota del alumno "+(i+1)+" durante el segundo trimestre: ");
            notaGrupo2Semestre[i]=entrada.nextFloat();
            notaMedia[1]+=notaGrupo2Semestre[i];
        } 
        System.out.println("\n");  
        
        for (int i=0; i<5; i++){   
            System.out.print("Digite la nota del alumno "+(i+1)+" durante el tercer trimestre: ");
            notaGrupo3Semestre[i]=entrada.nextFloat();
            notaMedia[2]+=notaGrupo3Semestre[i];
        }
        System.out.println("\n");
        
        for (int i =0; i<3; i++){
            notaMedia[i]/=5;
            System.out.println(notaMedia[i]);
        }
        do{
            System.out.println("Seleccione al alumno del que quiera saber el promedio durante todo el año: ");
            alumno= entrada.nextInt()-1;
            
        }while(alumno<0|| alumno>4);
        
        mediaAlumno=(notaGrupo1Semestre[alumno]+notaGrupo2Semestre[alumno]+notaGrupo3Semestre[alumno])/3;        
        System.out.println("La media del alumno es de "+mediaAlumno);

    }    
}
