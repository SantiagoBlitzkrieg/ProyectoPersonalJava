/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2movimiento;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio2Movimiento {

    public static void main(String[] args) {
        
        int decision;
        int incremento=0;
                
        Tablero objeto1 = new Tablero(0, 0);
        
        do{
            decision=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la accion que desea aplicar: "+ "\n1. Moverse a la derecha" + "\n2. Moverse a la izquierda"+"\n3. Moverse arriba"+ "\n4. Moverse abajo" + "\n5. Cancelar"));
            
            
            if (decision>=1 && decision<5){
                incremento=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos metros desea moverse?"));    
                
            }

            switch (decision) {

                case 1:
                    objeto1.moverDerecha(incremento);
                    break;
                case 2:
                    objeto1.moverIzquierda(incremento);
                    break;

                case 3: 
                    objeto1.moverArriba(incremento);
                    break;

                case 4:
                    objeto1.moverAbajo(incremento);
                    break;
                    
                case 5:
                        
                    break;
                        
                default:
                    JOptionPane.showMessageDialog(null, "Opcion inexistente");
                    break;
            } 
            
            if (decision>=1 && decision<5){
                JOptionPane.showMessageDialog(null, "El objeto se encuentra actalmente en la posicion ("+objeto1.getX()+","+objeto1.getY()+") del plano cartesiano");
  
            }

            
        } while (decision !=5);
                        
        System.out.println("El objeto se encuentra finalmente en la posicion ("+objeto1.getX()+","+objeto1.getY()+") del plano cartesiano");    
    }
}
