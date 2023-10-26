/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio10Calculadora {

    public static void main(String[] args) {
        char operacion;
        int numero1;
        int numero2;
        int resultado;
        
        operacion = Character.toUpperCase(JOptionPane.showInputDialog("Inserte Operacion").charAt(0));
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte numero1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte numero2"));
        
        if (operacion=='S'){   
            resultado=numero1+numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es "+ resultado);
        }
        else if(operacion == 'R'){
            resultado=numero1-numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la resta es "+ resultado);
        }
        else if(operacion == 'P' || operacion == 'M'){
            resultado=numero1*numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es "+ resultado);
        }
        else if(operacion == 'D'){
            resultado=numero1/numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la division es "+ resultado);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingreso una operacion invalida");
        }
        
       //Es más sencillo con Switch:
        
        /*switch (operacion){
        case 'S': resultado=numero1+numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es "+ resultado);
            break;
        case 'R':resultado=numero1-numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la resta es "+ resultado);
            break;
        case 'P':
        case 'M':resultado=numero1*numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es "+ resultado);  
            break;
        case 'D':resultado=numero1/numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la division es "+ resultado);
            break;
        default:JOptionPane.showMessageDialog(null, "Ingreso una operacion invalida");
        }*/
        
    }
}
