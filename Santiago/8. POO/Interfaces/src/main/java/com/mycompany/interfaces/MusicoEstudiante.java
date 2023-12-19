/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author gomez
 */
public class MusicoEstudiante implements Musico, Estudiante{
    
    
    @Override
    public void hablar(){
        System.out.println("Estoy hablado español");
    }
    
    @Override
    public void tocarMusica(){
        System.out.println("Estoy tocando la guitarra");
    }
    
    @Override
    public void estudiar(){
        System.out.println("Estoy estudiando programacion");
    }
}
