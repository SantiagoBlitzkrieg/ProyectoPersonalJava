/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3barato;

/**
 *
 * @author gomez
 */
public class Vehiculo {
    private String marca;
    private int modelo;
    private int precio;
    
    public Vehiculo (String marca, int modelo, int precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public int getPrecio(){
        return precio;
    }
    
    public void mostrarDatos(){
        System.out.println("El carro más barato es el de marca "+marca+", modelo "+modelo+" con un precio de "+precio);
    }
}
