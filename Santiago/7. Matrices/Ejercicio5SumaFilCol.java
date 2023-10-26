/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5sumafilcol;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio5SumaFilCol {

    public static void main(String[] args) {
        int matriz [][];
        int nFilas, sumaFilas;
        int nCol, sumaCol;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Escoja el numero de filas: ");
        nFilas=entrada.nextInt();
        
        System.out.println("Escoja el numero de columnas: ");
        nCol=entrada.nextInt();
        
        matriz= new int [nFilas][nCol];
        
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nCol; j++){
                System.out.print("Ingrese el valor del espacio["+i+"]["+j+"]: ");
                matriz [i][j]=entrada.nextInt();
            }
        }
        
        for (int i=0; i<nFilas; i++){
            sumaFilas=0;
            for (int j=0; j<nCol; j++){
                sumaFilas+=matriz[i][j];
            }
            System.out.println("La suma de la fila "+ (i+1) + " es: " + sumaFilas);
        }
        
        System.out.println("");
        
        for (int i=0; i<nCol; i++){
            sumaCol=0;
            for (int j=0; j<nFilas; j++){
                sumaCol+=matriz[j][i];
            }
            System.out.println("La suma de la columna "+ (i+1) + " es: " + sumaCol);
        }
    }
}   
