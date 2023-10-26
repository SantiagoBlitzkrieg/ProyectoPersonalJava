/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8cifras;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio8Cifras {

    public static void main(String[] args) {
        long numero;
        
        numero = Long.parseLong(JOptionPane.showInputDialog("Inserte numero entre 0 y 99999: "));
        
        if ((numero-10000)>0){   //HABIA UNA FORMA MAS FACIL AAJAJAJA... SOLO ERA PEDIR SI NUMERO ERA < 10 EMPEZANDO CON LOS DE UN DIGITO
            //TOCA PENSAR EL CODIGO DE LA FORMA MAS FACIL POSIBLE!!!!
            JOptionPane.showMessageDialog(null, "El numero "+ numero + " tiene 5 digitos");
        }
        else if((numero-1000)>0){
            JOptionPane.showMessageDialog(null, "El numero "+ numero + " tiene 4 digitos");
        }
        else if((numero-100)>0){
            JOptionPane.showMessageDialog(null, "El numero "+ numero + " tiene 3 digitos");
        }
        else if((numero-10)>0){
            JOptionPane.showMessageDialog(null, "El numero "+ numero + " tiene 2 digitos");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero "+ numero + " tiene 1 digito");
        }
        
    }
        
}
