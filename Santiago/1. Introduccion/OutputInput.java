/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.outputinput;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class OutputInput {

    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        String cadena;
        int numero;
        
        System.out.println("Digite su nombre: ");
        //cadena = entrada.next(); //guarda la cadena hasta \n lo cual puede generar errores
        cadena = entrada.nextLine();
        
        System.out.println ("El nombre es "+cadena);
        
        
        System.out.println("Digite un numero entero: " );
        
        numero = entrada.nextInt();
                
        System.out.println ("El numero es: " + numero); por consola*/
        
        String cadena; // El siguiente código es para un método más gráfico
        int entero; 
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero ")); //no se puede guardar un string en entero
        // ese Integer.parseInt trabsforma el texto en enteros
        letra = JOptionPane.showInputDialog("Digite un caracter").charAt(0);// ese charAt convierte texto a caracter
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El numero decimal es: "+decimal);
        
    
    }    
}
 