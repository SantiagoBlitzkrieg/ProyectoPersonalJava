/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5obrero;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio5Obrero {

    public static void main(String[] args) {
        int horas;
        int salario1=16;
        int salario2=20;
        int salarioTotal;
        
        horas = Integer.parseInt(JOptionPane.showInputDialog("Inserte las horas trabajadas: "));
        
        if (horas <= 40){
            salarioTotal=horas*salario1;
        }
        else{
            salarioTotal=(40*salario1)+((horas-40)*salario2);
        }
        JOptionPane.showMessageDialog(null, "Su salario es de: "+ salarioTotal);
    
    }
}
