/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17facturas;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio17Facturas {

    public static void main(String[] args) {
        
        
        int producto;
        int codigo = 0;
        float precioLitro=0;
        float litros;
        float precio;
        float totalVendido=0;
        float totalLitros1=0;
        int facturasGrandes=0;
        int seguir;
        
        

        do{
            seguir = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la operacion que desea realizar: "+"\n 1. Insertar Factura"+"\n 2. Salir"));
            
            switch (seguir){
                case 1:
                    
                    producto = Integer.parseInt(JOptionPane.showInputDialog("Digite el producto"));       
                    if (producto < 1 || producto > 3){
                        JOptionPane.showMessageDialog(null, "No tenemos ese producto");
                    }else{
                        litros = Float.parseFloat(JOptionPane.showInputDialog("Digite los litros comprados"));
                        switch (producto) {
                            case 1:
                                codigo=1010;
                                precioLitro = 0.6f;
                                totalLitros1+=litros;
                                break;
                            case 2:
                                codigo=1020;
                                precioLitro = 3;
                                break;
                            case 3:
                                codigo=1030;
                                precioLitro = (1.25f*1.05f);
                                break;
                        } 
                    
                        precio = precioLitro * litros;
                        JOptionPane.showMessageDialog(null, "El usuario hizo la siguiente compra:"+"\nArticulo codigo: "+codigo+"\nprecioLitro: "
                                +precioLitro+ "\nLitros vendidos: "+litros+ "\nVenta total: "+precio);
                        totalVendido+=precio;
                        if (precio >=600){
                            facturasGrandes++;
                        }
                    }
                        
                case 2:
                    break;
                default:
                JOptionPane.showMessageDialog(null, "Comando invalido");
            }

        } while (seguir != 2);
        System.out.println("Facturacion Total= "+totalVendido);
        System.out.println("Litros vendidos del articulo 1= "+totalLitros1);
        System.out.println("Facturas con ventas de mas de $600= "+facturasGrandes);
    }
}