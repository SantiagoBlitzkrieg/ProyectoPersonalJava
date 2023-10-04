/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9meses;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio9Meses {

    public static void main(String[] args) {
        int dia;
        int mes;
        int annio;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Inserte Dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Inserte Mes: "));
        annio = Integer.parseInt(JOptionPane.showInputDialog("Inserte Año: "));
   
        if(annio<1) {
            JOptionPane.showMessageDialog(null, "La fecha esta mal: ");
        }
        else{
            if(mes<1 && mes>12){
            JOptionPane.showMessageDialog(null, "La fecha esta mal: ");
            }
            else if( mes==2){
                if (dia>1 && dia<29){
                    JOptionPane.showMessageDialog(null, "La fecha es correcta ");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La fecha esta mal");
                }
        
            }            
            else if(mes<8 && mes%2==0 || mes>7 && mes%2!=0){
                if (dia>1 && dia<31){
                    JOptionPane.showMessageDialog(null, "La fecha es correcta ");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La fecha esta mal ");
                }
            }
            else{
                if (dia>1 && dia<32){
                    JOptionPane.showMessageDialog(null, "La fecha es correcta ");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La fecha esta mal ");
                }
            }
        }
        
    }
}
