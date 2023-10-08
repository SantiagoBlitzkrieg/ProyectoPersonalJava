/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13versatil;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio13Versatil {

    public static void main(String[] args) {
        int numero;
        int numerosPositivos=0;
        int numerosNegativos=0;
        float mediaPositiva=0;
        float mediaNegativa=0;
        int ceros=0;
        
        for (int i=1; i<=10; i++){
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            
            if (numero<0){
                mediaNegativa+=numero;
                numerosNegativos++;
            }else if(numero>0){
                mediaPositiva+=numero;
                numerosPositivos++;
            }else{
                ceros++;
            }   
        }
        
        if(numerosPositivos!=0){
            mediaPositiva/=numerosPositivos; 
            System.out.println("La media de los numeros positivos es: " +mediaPositiva);
        }else{
            System.out.println("No se colocaron numeros positivos");
        }
        
        if(numerosNegativos!=0){
            mediaNegativa/=numerosNegativos;
            System.out.println("La media de los numeros negativos es: " +mediaNegativa);
        }else{
            System.out.println("No se colocaron numeros negativos");
        }

        System.out.println("La cantidad de 0 ingresados es de: " +ceros);
    }
}
