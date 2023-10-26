/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3transponer;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio3Transponer {

    public static void main(String[] args) {
        int matriz [][] = new int [3][3];
        int matrizTranspuesta [][] = new int [3][3];
        Scanner entrada = new Scanner (System.in);

        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Digite el dato ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        
        
        for (int i=0; i<3; i++){
            for (int j=0; j<=i; j++){
                matrizTranspuesta[i][j]=matriz[j][i];
                matrizTranspuesta[j][i]=matriz[i][j];
            }
        }
         
        System.out.println("La matriz  es: ");
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("La matriz transpuesta es: ");
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matrizTranspuesta[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}
