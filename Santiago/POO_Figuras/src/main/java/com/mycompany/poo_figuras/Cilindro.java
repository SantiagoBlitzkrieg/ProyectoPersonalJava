/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_figuras;

/**
 *
 * @author gomez
 */
public class Cilindro extends Figura {
    
    private double altura;
    private double radio;

    public Cilindro(double altura, double radio, String color) {
        super(color);
        this.altura = altura;
        this.radio = radio;
    }

    @Override
    public double area() {
        return (2*Math.PI*radio*altura)+(2*Math.PI*radio*radio);
    }  
     
}

