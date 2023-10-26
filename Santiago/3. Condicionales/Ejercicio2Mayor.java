/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2mayor;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio2Mayor {

    public static void main(String[] args) {
        float numero1;
        float numero2;
        
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero:" ));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero:" ));
        
        if (numero1>numero2){
            JOptionPane.showMessageDialog(null, "El numero "+numero1+" es mayor que "+ numero2);
        }
        else if (numero1<numero2){
            JOptionPane.showMessageDialog(null, "El numero "+numero2+" es mayor que "+ numero1);
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero "+numero1+" es igual que "+ numero2);
        }

    }
}
