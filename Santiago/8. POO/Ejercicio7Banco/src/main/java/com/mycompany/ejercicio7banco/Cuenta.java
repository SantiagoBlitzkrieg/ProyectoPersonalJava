/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7banco;

/**
 *
 * @author gomez
 */
public class Cuenta {
    private int numeroCuenta;
    private Double saldo = 0.0;
     
    public Cuenta (int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    public void setSaldo (double saldo){
        this.saldo =saldo;
    }
    
    public Double getSaldo(){
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
        
}
