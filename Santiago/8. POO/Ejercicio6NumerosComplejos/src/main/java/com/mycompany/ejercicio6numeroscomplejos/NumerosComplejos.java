/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6numeroscomplejos;

import java.util.Objects;

/**
 *
 * @author gomez
 */
public class NumerosComplejos {
    private Double parteReal;
    private Double parteImaginaria;


    public NumerosComplejos(Double parteReal, Double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Double getParteReal() {
        return parteReal;
    }

    public Double getParteImaginaria() {
        return parteImaginaria;
    }
    
    public NumerosComplejos calculaSuma (NumerosComplejos c){  //Para poder sumarlo basta con mandarle un nuevo numero complejo además de el numero que es el objeto
        NumerosComplejos suma = new NumerosComplejos(parteReal+c.getParteReal(), parteImaginaria+c.getParteImaginaria());
        return suma;
    }
    
    public NumerosComplejos calculaMultiplicacion (NumerosComplejos c){  //Tomar en cuenta que el metodo es de tipo objeto..
        NumerosComplejos multiplicacion  = new NumerosComplejos((parteReal*c.getParteReal())-(parteImaginaria*c.getParteImaginaria()), ((parteReal*c.getParteImaginaria())+parteImaginaria*c.getParteReal()));
        return multiplicacion;
    }
    public String comparando (NumerosComplejos c){  //Tomar en cuenta que el metodo es de tipo objeto..
        if (Objects.equals(parteReal, c.getParteReal()) && Objects.equals(parteImaginaria, c.getParteImaginaria())){
            return "Los numeros introducidos son iguales";
        }else{
            return "Los numeros introducidos no son iguales";
        }
    }
    public String mostrarDatos(){
        return parteReal+" + "+ parteImaginaria + "j";
    }

}
