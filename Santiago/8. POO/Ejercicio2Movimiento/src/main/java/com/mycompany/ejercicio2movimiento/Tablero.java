/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2movimiento;

/**
 *
 * @author gomez
 */
public class Tablero {
    private int x;
    private int y;
    
    public Tablero (int x, int y){
        this.x= x;
        this.y= y;   
    }
    
    public void moverArriba (int incremento){
        
        y+=incremento;
    }
    public void moverAbajo (int incremento){
       
        y-=incremento;
    }
    public void moverIzquierda(int incremento){
        x-=incremento;
        
    }
    public void moverDerecha(int incremento){
        
        x+=incremento;
    }
    
    public int getY(){
   
        return y;
    }
    
    public int getX(){
        
        return x;
        
    }

}
