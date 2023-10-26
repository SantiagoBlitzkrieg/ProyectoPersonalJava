/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7marco;

/**
 *
 * @author gomez
 */
public class Ejercicio7Marco {

    public static void main(String[] args) {
        int marco [][]= new int [5][5];
        
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (j==0 || i==0 || j==4 || i==4){
                    marco [i][j]=1;
                }else{
                    marco [i][j]=0;
                }
            }
        }
        
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(marco[i][j]);
            }
            System.out.println("");
        }
    }
}
