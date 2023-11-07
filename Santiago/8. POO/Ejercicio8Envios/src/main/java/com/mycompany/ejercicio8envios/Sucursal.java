/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8envios;

/**
 *
 * @author gomez
 */
public class Sucursal {
    private int noSucursal;
    private String direccion, ciudad;
    

    public Sucursal(int noSucursal, String direccion, String ciudad) {
        this.noSucursal = noSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNoSucursal() {
        return noSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    public String mostrarDatos(){
        return "Esta es la sucursal No. "+noSucursal+" ubicada en la ciudad de "+ciudad+ " en la direccion "+direccion;
    }
    
    public void calcularPrecios (Paquete k){
        double precio= k.getPeso();
        if (k.getPrioridad()==1){
            precio+=10;
        } else if (k.getPrioridad()==2){
            precio+=20;
        }
        k.setPrecio(precio);
    }
}   
