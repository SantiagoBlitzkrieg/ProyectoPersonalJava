/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8envios;

import java.util.Scanner;

/**
 *
 * @author gomez
 */
public class Ejercicio8Envios {
    
    public static int consultarSucursal(Sucursal [] t , int codigo, int i){
        int indice=0;
        boolean existe =false;
        for (int a=0; a<i; a++){
            if (t [a].getNoSucursal()==codigo){
                existe = true;
                indice = a;
                break;
            }
        }
        if (existe==false){
            indice =-1;
        }
        
        return indice;

    }
    public static int consultarPaquete(Paquete [] t , int codigo, int j){
        int indice=0;
        boolean existe =false;
        for (int a=0; a<j; a++){
            if (t [a].getNumeroReferencia()==codigo){
                existe = true;
                indice = a;
                break;
            }
        }
        if (existe==false){
            indice =-1;
        }
        
        return indice;

    }
    public static void main(String[] args) {
        int noSucur;
        String direccionSucur, ciudadSucur;
        int noPack, dniPack, prioridadPack;;
        double pesoPack, precioPack;
        int decisiones,i=0,j=0, indiceSucursal, indicePaquete;
        Sucursal sucursales[]= new Sucursal [30];
        Paquete paquetes[]= new Paquete[80];
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Menu");
            System.out.println("1. Registrar sucursal");
            System.out.println("2. Registrar producto");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar Paquete");
            System.out.println("5. Buscar todas las sucursales");
            System.out.println("6. Buscar todos los paquetes");
            System.out.println("7. Salir");
            System.out.println("");
            decisiones = entrada.nextInt();
            switch (decisiones) {

                case 1:

                    System.out.print("Ingrese la ciudad de la sucursal: ");
                    ciudadSucur = entrada.next();
                    System.out.print("Ingrese la direccion de la sucursal: ");
                    direccionSucur = entrada.next();
                    noSucur= (int) (Math.random()*1000);
                    sucursales[i]=new Sucursal(noSucur, direccionSucur, ciudadSucur);
                    System.out.println(sucursales[i].mostrarDatos());
                    i++;
                    System.out.print("Presione cualquier tecla para continuar");
                    entrada.next();
                    break;
                case 2:
                    System.out.print("Registre el numero de sucursal desde el que va a enviar el producto: ");
                    noSucur = entrada.nextInt();
                    indiceSucursal= consultarSucursal(sucursales, noSucur, i);  
                    if (indiceSucursal>=0){
                        System.out.print("Ingrese su CC: ");
                        dniPack= entrada.nextInt();
                        System.out.print("Ingrese el peso del paquete: ");
                        pesoPack = entrada.nextInt();
                        System.out.print("Ingrese la prioridad del paquete."+"\n0. Nula prioridad."+"\n1.Prioridad alta"+"\n2.Maxima prioridad");
                        prioridadPack = entrada.nextInt();
                        noPack=(int)(Math.random()*100);
                        paquetes [j]= new Paquete(noPack, dniPack, pesoPack, prioridadPack); 
                        sucursales[indiceSucursal].calcularPrecios(paquetes[j]);
                        System.out.println(paquetes[j].MostrarDatos());
                        j++;
                        System.out.print("Presione cualquier tecla para continuar");
                        entrada.next();                        
                    }else{
                        System.out.println("La sucursal no existe");
                    }  
                    
                    break;
                case 3:
                    System.out.print("Registre el numero de sucursal que quiere consultar: ");
                    noSucur = entrada.nextInt();
                    indiceSucursal= consultarSucursal(sucursales, noSucur, i);  
                    if (indiceSucursal>=0){
                        
                        System.out.println(sucursales[indiceSucursal].mostrarDatos());
                        System.out.print("Presione cualquier tecla para continuar");
                        entrada.next();                        
                    }else{
                        System.out.println("La sucursal no existe");
                    }  
                    
                    break;
                case 4:
                    System.out.print("Registre el numero del paquete que quiere consultar: ");
                    noPack = entrada.nextInt();
                    indicePaquete= consultarPaquete(paquetes, noPack, j);  
                    if (indicePaquete>=0){
                        
                        System.out.println(paquetes[indicePaquete].MostrarDatos());
                        System.out.print("Presione cualquier tecla para continuar");
                        entrada.next();                        
                    }else{
                        System.out.println("El paquete no existe");
                    }  
                    
                    break; 
                case 5:
                    for (int a=0; a<i; a++){
                        System.out.println((a+1)+". "+sucursales[a].mostrarDatos());               
                    }
                     System.out.print("Presione cualquier tecla para continuar");
                    entrada.next();
                    break;
                case 6:
                    for (int a=0; a<j; a++){
                        System.out.println((a+1)+". "+paquetes[a].MostrarDatos());
                    }
                    System.out.print("Presione cualquier tecla para continuar");
                    entrada.next();                    
                    break;
                    
                case 7:
                    break;
                    
                default:
                    System.out.println("Eleccion inexistente");
            }
        }while (decisiones !=7);
        
    }
}
