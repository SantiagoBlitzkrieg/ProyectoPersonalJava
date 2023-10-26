/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4identidad;


/**
 *
 * @author gomez
 */
public class Ejercicio4Identidad {

    public static void main(String[] args) {
        int matriz[][]= new int [7][7];
        
        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
                if (j==i){
                    matriz [i][j]=1;
                }else{
                    matriz [i][j]=0;
                }
            }
        }
        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
            System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
