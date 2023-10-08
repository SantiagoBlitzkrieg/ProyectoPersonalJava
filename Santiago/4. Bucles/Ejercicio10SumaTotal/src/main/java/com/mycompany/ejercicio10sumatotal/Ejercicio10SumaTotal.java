/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10sumatotal;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio10SumaTotal {

    public static void main(String[] args) {
        int suma=0;
        int numero;
        for (int i=1;i<=10;i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            suma+=numero;    
        }
        JOptionPane.showMessageDialog(null, "La suma de los numeros da como resultado: " + suma);
    }
}
