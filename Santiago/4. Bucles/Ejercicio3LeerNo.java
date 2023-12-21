/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3leerno;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio3LeerNo {

    public static void main(String[] args) {
        int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (numero !=0){
            if (numero%2==0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+ " es par");
            }else{
                JOptionPane.showMessageDialog(null, "El numero "+numero+ " es impar");
            }
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
    }
}
