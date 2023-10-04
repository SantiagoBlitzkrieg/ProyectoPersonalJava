/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4descuento;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio4Descuento {

    public static void main(String[] args) {
        
        float compra;
        float valorTotal;
        
        compra = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de la compra: "));
        
        if (compra > 300){
            valorTotal = (compra-(compra*0.2f));
        }
        else {
            valorTotal = compra;
        }
        JOptionPane.showMessageDialog(null, "La cantidad que pagara por su compra es: "+valorTotal);
                
    }
}
