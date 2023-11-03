/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7bancovideo;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio7BancoVideo {
    public static int buscarCuenta(int numeroCuenta, Cliente persona){
        int i=-1;
        for (int j=0; j<persona.cuePersonal.length;j++){
            if (numeroCuenta == persona.cuePersonal[j].getNumeroCuenta()){
                i=j;
                break;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre, apellido, dni;
        int numeroCuenta, nCuentas, decisiones, j;
        double saldo;
        Cuenta cuentaPersonal [];
        Cliente persona;
        
        System.out.print("Digite el nombre del cliente: ");
        nombre =entrada.nextLine();
        System.out.print("Digite el apellido del cliente: ");
        apellido =entrada.nextLine();
        System.out.print("Digite el dni del cliente: ");
        dni =entrada.nextLine();
        System.out.print("Digite cuantas cuentas tiene: ");
        nCuentas =entrada.nextInt();
        
        cuentaPersonal = new Cuenta [nCuentas];
        
        for (int i=0; i<cuentaPersonal.length; i++){
            System.out.println("Digite los datos para la cuenta "+(i+1));
            System.out.print("Digite el numero de la cuenta: ");
            numeroCuenta= entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo= entrada.nextDouble();
            
            cuentaPersonal[i] = new Cuenta(numeroCuenta, saldo);  
        }
        
        persona = new Cliente (nombre, apellido, dni, cuentaPersonal);
        
        do{
            System.out.println("Hola "+ nombre+ "¿Que desea hacer hoy?");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Ingresar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Salir");
            
            decisiones = entrada.nextInt();
            switch (decisiones) {

                case 1:
                    System.out.println("Ingrese el numero de cuenta al que desea consultar");
                    numeroCuenta= entrada.nextInt();
                    j = buscarCuenta(numeroCuenta,persona);
                    if (j!=-1){
                        System.out.println("Su saldo es de: "+persona.consultarSaldo(j));
                    }else {
                        System.out.println("El numero de cuenta ingresado no existe");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el numero de cuenta al que desea abonar");
                    numeroCuenta= entrada.nextInt();
                    j = buscarCuenta(numeroCuenta,persona);
                    if (j!=-1){
                        System.out.println("Ingrese la cantidad de dinero");
                        saldo= entrada.nextInt();  
                        persona.ingresarDinero(j, saldo);
                        System.out.println("Su saldo es de: "+persona.consultarSaldo(j));
                    }else {
                        System.out.println("El numero de cuenta ingresado no existe");
                    }
                    
                    break;
                case 3:
                    System.out.println("Ingrese el numero de cuenta al que desea retirar");
                    numeroCuenta= entrada.nextInt();  
                    j = buscarCuenta(numeroCuenta,persona);
                    if (j!=-1){
                        System.out.println("Ingrese la cantidad de dinero");
                        saldo= entrada.nextInt();  
                        if (saldo<=persona.cuePersonal[j].getSaldo()){
                            persona.retirarDinero( j, saldo);
                            System.out.println("Su saldo es de: "+persona.consultarSaldo(j));
                        }else{
                            System.out.println("Saldo insuficiente");
                        }
                    }else {
                        System.out.println("El numero de cuenta ingresado no existe");
                    }
                    
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Eleccion inexistente");
            }
            
        }while (decisiones !=4);
   
    }
}
