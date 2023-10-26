/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1simetrico;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio1Simetrico {

    public static void main(String[] args) {
        int matriz [][];
        int nFilas;
        int nColumnas;
        boolean simetrica =true;
        Scanner entrada= new Scanner(System.in);
        
        System.out.print("Digite el numero de filas del arreglo: ");
        nFilas=entrada.nextInt();
        System.out.print("Digite el numero de columnas del arreglo: ");
        nColumnas=entrada.nextInt();
        matriz = new int [nFilas][nColumnas];
        
        for (int i=0; i<nFilas; i++){
            for (int j=0; j<nColumnas; j++){
                System.out.print("Digite el dato ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        } 
        
        if (nFilas==nColumnas){
            int i=0;     
            int j;
            while(i<nFilas && simetrica == true){
                j=0;
                while (j<nColumnas){
                    if (matriz[i][j]!=matriz[j][i]){
                        simetrica = false;
                        break;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica==true){
                System.out.println("La matriz es simetrica");
            }else{
                System.out.println("La matriz es asimetrica");
            }
                
        }else{
            System.out.println("La matriz es asimetrica");
        }
        
        System.out.println("La matriz es: ");
        
        for (int i=0; i<nFilas;i++){
            for (int j=0; j<nColumnas;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
