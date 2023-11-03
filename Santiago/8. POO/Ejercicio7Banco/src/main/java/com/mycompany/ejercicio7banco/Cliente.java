/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7banco;

/**
 *
 * @author gomez
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private int nCuentas=0;
    
    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    Cuenta cuePersonal[]= new Cuenta [10];

    public void crearCuenta (int nCuenta){
       cuePersonal[nCuentas] = new Cuenta(nCuenta);
       nCuentas++;
    }
    
    public String consultarSaldo (Cuenta k){
        return "Su saldo actual en la cuenta numero "+ k.getNumeroCuenta()+" es de: "+k.getSaldo();
    }
    
    public void ingresarDinero(Cuenta k, Double dinero){
        dinero+=k.getSaldo();
        k.setSaldo(dinero);
    }
    
    public String retirarDinero (Cuenta k, Double dinero){
            if (dinero<k.getSaldo()){
                dinero=k.getSaldo()-dinero;
                k.setSaldo(dinero);
                return "Transacción Realizada";                
            }else{
                return "No cuenta con suficientes fondos para realizar la operacion";
            }
    }
    
    public int buscarCuenta (int cuenta){
        int i=0;
        
            while (i<=cuePersonal.length){
                if (cuenta != cuePersonal[i].getNumeroCuenta()){
                i++;
                }else {
                    break;
                }
            }
        
        return i;       
    }
    
}
