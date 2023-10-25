/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6transponerla;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio6Transponerla {

    public static void main(String[] args) {
        int matriz[][]= new int [5][9];
        int matrizTranspuesta[][]= new int [9][5];
        Scanner entrada = new Scanner (System.in);
        
        for (int i =0; i < 5; i++){
            for (int j=0; j<9; j++){
                System.out.print("Digite el numero de ["+i+"]["+j+"]: ");
                matriz[i][j]= entrada.nextInt();
            }
        }
        
        for (int i =0; i < 9; i++){
            for (int j=0; j<5; j++){
                matrizTranspuesta[i][j]= matriz[j][i];
            }
        }
        
        System.out.println("La matriz 1 es: ");
        
        for (int i =0; i < 5; i++){
            for (int j=0; j<9; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("La matriz 2 es: ");
        
        for (int i =0; i < 9; i++){
            for (int j=0; j<5; j++){
                System.out.print(matrizTranspuesta[i][j]+" ");
            }
            System.out.println("");
        }        
    }
}
