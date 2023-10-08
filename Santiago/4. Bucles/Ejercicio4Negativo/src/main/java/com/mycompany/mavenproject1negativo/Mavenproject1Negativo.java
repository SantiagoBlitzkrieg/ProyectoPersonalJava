/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1negativo;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Mavenproject1Negativo {

    public static void main(String[] args) {
        int numero;
        int numerosIntroducidos=0;
        
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero positivo"));
            if (numero>=0){
                numerosIntroducidos++;
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Fue capaz de introducir "+numerosIntroducidos+" numeros siguiendo la instruccion");
            }
        }while (numero>=0);
    }
}
