/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7bancovideo;

/**
 *
 * @author gomez
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuePersonal[];

    public Cliente(String nombre, String apellido, String dni, Cuenta cuePersonal[]) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuePersonal = cuePersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    
    public double consultarSaldo (int n){ //int n es el indice del arreglo de objetos
        return  cuePersonal[n].getSaldo();
    }
    
    public void ingresarDinero (int n, double cantidad){
        cuePersonal[n].ingresaDinero(cantidad);
    }
    
    public void retirarDinero (int n, double cantidad){
        cuePersonal[n].retirarDinero(cantidad);
    }
}
