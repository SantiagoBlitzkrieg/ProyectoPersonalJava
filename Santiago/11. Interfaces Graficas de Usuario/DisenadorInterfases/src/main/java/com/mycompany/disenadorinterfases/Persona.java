/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.disenadorinterfases;

/**
 *
 * @author gomez
 */
public class Persona {
    String nombre, apellido, email, direccion, numero;

    public Persona(String nombre, String apellido, String email, String direccion, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumero() {
        return numero;
    }
    
    @Override
    public String toString(){
        return (this.nombre+" "+this.apellido);
    }
    
}
