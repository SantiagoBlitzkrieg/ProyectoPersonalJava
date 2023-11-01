/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4atletas;

/**
 *
 * @author gomez
 */
public class Atleta {
    private int numero;
    private String nombre;
    private float tiempoCarrera;
    
    public Atleta (int numero, String nombre, float tiempoCarrera){
        this.numero = numero;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }
    
    public float getTiempoCarrera (){
        return tiempoCarrera;
    }
    
    public void mostrarResultados(){
        System.out.println("El ganador de la carrera fue el atleta "+nombre+ " con el numero "+numero+ " completandola en un tiempo record de "+ tiempoCarrera+ " minutos");
    }
        
}
