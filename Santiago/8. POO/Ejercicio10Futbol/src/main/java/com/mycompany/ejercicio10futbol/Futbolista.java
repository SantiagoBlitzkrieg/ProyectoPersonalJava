/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10futbol;

/**
 *
 * @author gomez
 */
public class Futbolista extends Persona{
    private String posicion;
    private int dorsal;

    public Futbolista(String posicion, int dorsal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
    }
       

    public String getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }
    
    public void entrevistas(){
        System.out.println("El jugador dio una magnifica entrevista");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Entrena");
    }
    
    @Override
    public void partido (){
        System.out.println("Juega el partido de Futbol");
    }
    
}