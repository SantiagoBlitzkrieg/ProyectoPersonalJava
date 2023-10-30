/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1cuadrilatero;

/**
 *
 * @author gomez
 */
public class Cuadrilatero {
    private float lado1;
    private float lado2;
    
    public  Cuadrilatero (float lado1, float lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public Cuadrilatero (float lado1){
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro = (lado1*2)+(lado2*2);
        return perimetro;
    }
    
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
}
