/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_figuras;

/**
 *
 * @author gomez
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura , String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }  
    
}
