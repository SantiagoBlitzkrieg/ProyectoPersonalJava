/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7mayormenor;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio7MayorMenor {

    public static void main(String[] args) {
        float numero1;
        float numero2;
        float numero3;
        
        numero1= Float.parseFloat(JOptionPane.showInputDialog("Inserte el numero 1"));
        numero2= Float.parseFloat(JOptionPane.showInputDialog("Inserte el numero 2"));
        numero3= Float.parseFloat(JOptionPane.showInputDialog("Inserte el numero 3"));
        
        if (numero1 > numero2 && numero1 > numero3 && numero2>numero3){    //Era más facil :/ jajaja... toca pensar más simple.
            JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+ numero1+" "+numero2+" "+numero3);
        }
        else if(numero1 > numero2 && numero1 > numero3 && numero2<numero3){
            JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+ numero1+" "+numero3+" "+numero2);
        }
        else if(numero1 < numero2 && numero1 < numero3 && numero2<numero3){
            JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+ numero3+" "+numero2+" "+numero1);
        }
        else if(numero1 < numero2 && numero1 < numero3 && numero2<numero3){
            JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+ numero2+" "+numero3+" "+numero1);
        }
        else if(numero1 < numero2 && numero1 > numero3){
            JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+ numero2+" "+numero1+" "+numero3);
        }
        else{
            JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+ numero3+" "+numero1+" "+numero2);
            
        }
    }
}
