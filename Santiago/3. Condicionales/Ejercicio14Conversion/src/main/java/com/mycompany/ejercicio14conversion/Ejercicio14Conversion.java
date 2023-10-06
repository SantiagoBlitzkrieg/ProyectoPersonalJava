/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14conversion;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio14Conversion {

    public static void main(String[] args) {
        int unidad;
        float cantidad;
        
        cantidad = Float.parseFloat(JOptionPane.showInputDialog("Inserte el valor de la masa del objeto en kg"));
        unidad = Integer.parseInt(JOptionPane.showInputDialog("Escoja la unidad de masa a la que desea convertir el resultado:" + 
        "\n 1. hectogramos (hg)"+
        "\n 2. decagramos (deg)"+        
        "\n 3. gramos (g)"+
        "\n 4. decigramo (dg)"+ 
        "\n 5. centigramo (cg)"+
        "\n 6. Miligramos (mg)"));
        
        switch (unidad){
        case 1: cantidad=cantidad*10; //Se puede hacer así... PERO ES MUCHO MÁS PRACTICO....
            JOptionPane.showMessageDialog(null, "El valor es de  "+ cantidad+" hg");
            break;
        case 2:cantidad*=100;  // ASI *=
            JOptionPane.showMessageDialog(null, "El valor es de  "+ cantidad+" deg");
            break;

        case 3:cantidad*= 1000; //ASI *=
            JOptionPane.showMessageDialog(null, "El valor es de  "+ cantidad+" g");
            break;

        case 4:cantidad*= 10000; //ASI *=
            JOptionPane.showMessageDialog(null, "El valor es de  "+ cantidad+" dg");
            break;

        case 5: cantidad*= 100000; //ASI *=
            JOptionPane.showMessageDialog(null, "El valor es de  "+ cantidad+" cg");
            break;

        case 6:cantidad*= 1000000; //ASI *=
            JOptionPane.showMessageDialog(null, "El valor es de  "+ cantidad+" mg");
            break;
 
        default:JOptionPane.showMessageDialog(null, "Ingreso una operacion invalida"); break;
        }
    }
}
