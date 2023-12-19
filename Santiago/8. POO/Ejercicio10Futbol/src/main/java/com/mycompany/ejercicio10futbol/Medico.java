/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10futbol;

/**
 *
 * @author gomez
 */
public class Medico extends Persona{
    private String titulacion;
    private int añosExperiencia;

    public Medico(String titulacion, int añosExperiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    
    public void curarLesion(){
        System.out.println("Curando lesion");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia en un entrenamiento");
    }
    
    @Override
    public void partido (){
        System.out.println ("Da asistencia a un partido de futbol");
    }
    
    
    
}
