/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10futbol;

/**
 *
 * @author gomez
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona (String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void viajar (){
        System.out.println("Viaja exitosamente");
    }
    
    public abstract void entrenamiento();
    
    public abstract void partido();

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
    
}
