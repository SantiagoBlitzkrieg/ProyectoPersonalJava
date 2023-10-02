/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7horas;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio7Horas {
    public static void main(String[] args) {
        
        Scanner entrada =new Scanner (System.in);
        double horas;
        int dias;
        int semanas;
        double horasRestantes;
    
        System.out.print("Digite las horas totales: ");
        horas = entrada.nextDouble();
        
        semanas = (int) Math.floor(horas/168);
        dias = (int) Math.floor((horas-semanas*168)/24);
        horasRestantes= horas-(semanas*168+dias*24);
        
        System.out.println("Dado un total de "+horas+" horas hay "+ semanas + " semanas, "+ dias+ " dias y "
                + horasRestantes + " horas.");
    
    }
}
