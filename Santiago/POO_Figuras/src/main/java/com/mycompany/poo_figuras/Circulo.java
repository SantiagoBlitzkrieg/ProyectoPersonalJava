/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_figuras;

/**
 *
 * @author gomez
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio , String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }  
     
}
