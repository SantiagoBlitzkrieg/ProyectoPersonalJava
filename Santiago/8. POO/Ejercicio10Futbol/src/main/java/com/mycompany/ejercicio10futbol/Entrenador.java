/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10futbol;

/**
 *
 * @author gomez
 */
public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planifica entrenamiento");
    }
    @Override
    public void entrenamiento(){
        System.out.println("Dirige un entrenamiento");
    }
    
    @Override
    public void partido (){
        System.out.println("Dirige un partido de futbol");
    }
    
}
