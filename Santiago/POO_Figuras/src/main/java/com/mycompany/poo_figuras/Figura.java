/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_figuras;

/**
 *
 * @author gomez
 */
public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double area();

    public String getColor() {
        return color;
    }
    
}
