/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio9poligonos;

/**
 *
 * @author gomez
 */
public class Rectángulo extends Poligono{
    private float base;
    private float altura;
    private double area;

    public Rectángulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area (){
        area = base*altura;
        return area;
    }

    @Override
    public String toString() {
        return "El rectangulo de base "+base+" y altura "+altura;
    }
    
}
