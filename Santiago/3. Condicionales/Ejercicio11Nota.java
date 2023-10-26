/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12nota;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio12Nota {

    public static void main(String[] args) {
        int saldo=1000;  //En este problema el saldo era constante... por lo que pude poner la variable como constante y poner otra que si variara.
        int operacion;
        
        operacion = Integer.parseInt(JOptionPane.showInputDialog("Su saldo es de " + saldo + " escoja la operación que requiere: "
                + "\n1 para meter plata. \n2 para sacar plata. \n3 para salir."));
        
        
        //Usemos switch:
        
        switch (operacion){
            case 1: saldo = saldo + Integer.parseInt(JOptionPane.showInputDialog("Cuanto va a meter")); 
            JOptionPane.showMessageDialog(null, "su saldo es "+ saldo); break;
            case 2: saldo= saldo - Integer.parseInt(JOptionPane.showInputDialog("Cuanto va a sacar")); 
                if (saldo>0){
                    JOptionPane.showMessageDialog(null, "su saldo es "+ saldo);     
            }   else{
                    JOptionPane.showMessageDialog(null, "No cuenta con suficiente saldo para lograr la transaccion");  
                }  break;
            case 3: JOptionPane.showMessageDialog(null, "Vuelva pronto"); break;
            default:JOptionPane.showMessageDialog(null, "Ingreso una operacion invalida"); break;
        }
        
        /*if (nota <=5) {
            JOptionPane.showMessageDialog(null, nota+ " es insuficiente");
        } else if(nota == 6 || nota ==7){
            
            JOptionPane.showMessageDialog(null, nota+ " es suficiente");
        }
        else if(nota == 8){

            JOptionPane.showMessageDialog(null, nota+ " esta bien");
        }
        else if(nota == 9){

            JOptionPane.showMessageDialog(null, nota+ " es notable");
        }
        else if(nota == 10){

            JOptionPane.showMessageDialog(null, nota+ " es sobresaliente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingreso una nota invalida");
        }*/
    }
}
