/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4atletas;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio4Atletas {
    
    public static int ganador (Atleta competidor[]){
        int indice=0;
        float tiempo;
        
        tiempo = competidor[0].getTiempoCarrera();
        for (int i=1;i<competidor.length;i++){
            if (tiempo>competidor[i].getTiempoCarrera()){
                indice=i;
                tiempo=competidor[i].getTiempoCarrera();
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
        int noAtletas;
        int numero;
        String nombre;
        float tiempoCarrera;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite el numero de atletas de la competencia:");
        noAtletas = entrada.nextInt();
        
        Atleta competidor[]= new Atleta [noAtletas];
        
        for (int i=0; i<noAtletas;i++){
            System.out.println("\nA continuacion digite la informacion del atleta "+(i+1)+":");

            System.out.print("Digite el numero del atleta: ");
            numero= entrada.nextInt();
            entrada.nextLine();
            
            System.out.print("Digite el nombre del atleta: ");
            nombre = entrada.nextLine();
            
            System.out.print("Digite el tiempo que tardo el atleta en terminar la carrera: ");
            tiempoCarrera = entrada.nextFloat();
            
            competidor[i]= new Atleta (numero, nombre,tiempoCarrera);    
        }
        
        competidor [ganador(competidor)].mostrarResultados();
    }
}
