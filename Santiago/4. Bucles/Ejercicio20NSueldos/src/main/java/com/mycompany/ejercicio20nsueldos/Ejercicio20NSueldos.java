/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20nsueldos;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio20NSueldos {

    public static void main(String[] args) {
        int nSueldos;
        float sueldo;
        float sueldoMayor=0;
        
        nSueldos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos sueldos va a digitar"));
        for (int i=1;i<=nSueldos;i++){
            do{
                sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el "+i+" sueldo"));
            }while (sueldo<0);    
            
            if (sueldo > sueldoMayor){
                sueldoMayor=sueldo; 
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo mayor es: "+ sueldoMayor);
    }
}
