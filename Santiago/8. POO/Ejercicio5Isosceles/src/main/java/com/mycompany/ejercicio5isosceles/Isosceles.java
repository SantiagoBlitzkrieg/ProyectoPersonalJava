/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5isosceles;

/**
 *
 * @author gomez
 */
public class Isosceles {
    private Double base;
    private Double ladox2;
    private Double area;
    private Double perimetro;
    
    public Isosceles(Double lado1, Double ladox2) {
        this.base = lado1;
        this.ladox2 = ladox2;
    }
    
    public Double obtenerArea (){
        area = (base/2)*(Math.sqrt((Math.pow((base/2), 2)+Math.pow(ladox2, 2))));
        return area;
    }
    
    public Double obtenerPerimetro(){
        perimetro = (base+(2*ladox2));
        return perimetro;
    }
    
    public String mostrarDatos(){ // En esta funcion llamo a los metodos para que se ejecuten y asi no estar obligado a ejecutarlos en el main 
        return " de base "+base+" y dos lados iguales de "+ladox2+  " tiene un area de "+obtenerArea()+ " y un perimetro de "+obtenerPerimetro(); 
    }

}
