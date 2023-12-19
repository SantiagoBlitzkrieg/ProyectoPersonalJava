/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10futbol;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio10Futbol {
    
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Persona> equipo = new ArrayList<>();  //No se tiene que poner otra vez la clase
    
    static Persona futbolista1 = new Futbolista("Medio Campista", 7, "Santiago", "Cervantes", 19);
    static Persona futbolista2 = new Futbolista("Delantero", 5, "Nicolas", "Cachetes", 20);
    static Persona entrenador = new Entrenador("Defensiva", "Juan", "Paez", 45);  //Upcasting
    static Persona doctor = new Medico("Fisioterapeuta", 20, "Edwin", "Sanchez", 60);   
   
    
    public static void main(String[] args) {
        equipo.add(futbolista1);
        equipo.add(futbolista2);
        equipo.add(entrenador);
        equipo.add(doctor);
        menu();
    }
    
    public static void menu(){
        int opcion;
        do{
            System.out.println("");
            System.out.println("\t.:MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4.Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                
                case 1: System.out.println("");//viaje de equipo 
                    viajarEquipo();
                    break;
                    
                case 2: System.out.println(""); //entrenamiento
                    entrenarEquipo();
                    break;
                    
                case 3: System.out.println(""); //partido de futbol
                    partidoEquipo();
                    break;
                    
                case 4: System.out.println("");//planificar entrenamineto
                    planificarEntrenamiento();
                    break;

                case 5: System.out.println("");//entrevista
                    entrevista();
                    break;
                    
                case 6: System.out.println("");//curar lesion
                    curarHerida();
                    break;
                    
                case 7: //salir
                    
                    break;

                default:
                    System.out.println("Opción inexistente");;
            }
            
        }while (opcion!=7);
        
    }
    
    public static void viajarEquipo(){
        for(Persona equipos: equipo){
            System.out.print (equipos.getNombre()+ " "+ equipos.getApellido()+" -> ");
            equipos.viajar();
        }
    }
    
    public static void entrenarEquipo(){
        for(Persona equipos: equipo){
            System.out.print(equipos.getNombre()+ " "+ equipos.getApellido()+" -> ");
            equipos.entrenamiento();
        }
    }

    public static void partidoEquipo(){
        for(Persona equipos: equipo){
            System.out.print(equipos.getNombre()+ " "+ equipos.getApellido()+" -> ");
            equipos.partido();
        }
    }    
    
    public static void planificarEntrenamiento(){
        System.out.print(entrenador.getNombre()+" "+ entrenador.getApellido()+ " -> ");
        Entrenador entrenador1 = (Entrenador) entrenador; //DownCasting
        
        entrenador1.planificarEntrenamiento();
    }
    
    public static void entrevista(){
        System.out.print(futbolista1.getNombre()+" "+ futbolista1.getApellido()+ " -> ");
        ((Futbolista) futbolista1).entrevistas(); //DownCasting
        System.out.print(futbolista2.getNombre()+" "+ futbolista2.getApellido()+ " -> ");
        ((Futbolista) futbolista2).entrevistas();
      
    }
    
    public static void curarHerida(){
        System.out.print(doctor.getNombre()+" "+ doctor.getApellido()+ " -> ");
        ((Medico)doctor).curarLesion();
    }
    

}
