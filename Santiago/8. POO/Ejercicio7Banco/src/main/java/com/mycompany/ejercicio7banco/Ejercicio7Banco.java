/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7banco;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class Ejercicio7Banco {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        int dni;
        int decisiones = 0;
        int noCuenta;
        Double dinero;
        int i;
        
        JOptionPane.showMessageDialog(null,"Bienvenido al banco Santiago's"+"\nA continuacion podra registrarse");
        
        nombre = JOptionPane.showInputDialog("Por favor registre su nombre:");
        apellido = JOptionPane.showInputDialog("Por favor registre su apellido:");
        dni = Integer.parseInt(JOptionPane.showInputDialog("Por favor registre su DNI: "));
        
        Cliente persona1 = new Cliente (nombre, apellido, dni);
        
        do{
            decisiones = Integer.parseInt(JOptionPane.showInputDialog("Hola "+ nombre+ " ¿Que desea hacer hoy?"+ "\n1. Crear Cuenta" + "\n2. Consultar Saldo"+" \n3. Meter Dinero"+"\n4. Sacar Dinero"+"\n5. Salir"));
            switch (decisiones) {
                case 1:
                    noCuenta= (int) (Math.random()*10);
                    persona1.crearCuenta(noCuenta);
                    JOptionPane.showMessageDialog(null, "Su numero de cuenta es: "+noCuenta);
                    break;
                case 2:
                    noCuenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta al que desea consultar"));
                    i = persona1.buscarCuenta(noCuenta);
                    JOptionPane.showMessageDialog(null, persona1.consultarSaldo(persona1.cuePersonal[i]));
                    break;
                case 3:
                    noCuenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta al que le quiere depositar"));
                    i = persona1.buscarCuenta(noCuenta);
                    dinero= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dinero que va a depositar: "));
                    persona1.ingresarDinero(persona1.cuePersonal[i], dinero);
                    JOptionPane.showMessageDialog(null, persona1.consultarSaldo(persona1.cuePersonal[i]));
                    break;
                case 4:
                    noCuenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta al que quiere retirar"));
                    i = persona1.buscarCuenta(noCuenta);
                    dinero= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dinero que va a retirar: "));
                    JOptionPane.showMessageDialog(null, persona1.retirarDinero(persona1.cuePersonal[i], dinero));
                    JOptionPane.showMessageDialog(null, persona1.consultarSaldo(persona1.cuePersonal[i]));
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Eleccion inexistente");
            }
            
            
        }while (decisiones !=5);
        
    }
}
