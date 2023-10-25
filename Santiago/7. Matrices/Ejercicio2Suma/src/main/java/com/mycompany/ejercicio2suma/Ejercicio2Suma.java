/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2suma;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio2Suma {

    public static void main(String[] args) {
        int matriz1 [][]= new int [3][3];
        int matriz2 [][] = new int [3][3];
        int suma [][] = new int [3][3];
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Digite el numero correspondiente a la matriz 1 ["+i+"]["+j+"]: ");
                matriz1 [i][j]=entrada.nextInt();
            }
        }
        System.out.println("");
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Digite el numero correspondiente a la matriz 2 ["+i+"]["+j+"]: ");
                matriz2 [i][j]=entrada.nextInt();
            }
        }
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                suma [i][j]=matriz1[i][j]+matriz2[j][i];
            }
        }
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(suma[i][j]);
            }
            System.out.println("");
        }       
    }
}
