/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8envios;

/**
 *
 * @author gomez
 */
public class Paquete {
    private int numeroReferencia;
    private int dni;
    private double peso, precio;
    private int prioridad;

    public Paquete(int numeroReferencia, int dni, double peso) {
        this.numeroReferencia = numeroReferencia;
        this.dni = dni;
        this.peso = peso;
    }

    public Paquete(int numeroReferencia, int dni, double peso, int prioridad) {
        this.numeroReferencia = numeroReferencia;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public int getDni() {
        return dni;
    }
    
    
    
    public 
    
    
}
