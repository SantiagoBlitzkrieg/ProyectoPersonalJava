/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_figuras;

/**
 *
 * @author gomez
 */
public class Cubo extends Figura {
    private double lado;

    public Cubo(double lado , String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double area() {
        return (6 * (lado * lado));
    }  


      
}
