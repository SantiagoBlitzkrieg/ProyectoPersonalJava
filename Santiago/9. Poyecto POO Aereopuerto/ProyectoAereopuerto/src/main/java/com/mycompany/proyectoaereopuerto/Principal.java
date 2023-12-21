package com.mycompany.proyectoaereopuerto;

import java.util.Scanner;


public class Principal {
    static Scanner entrada = new Scanner (System.in);
    final static int num = 4; //No. Aereopuertos
    static Aeropuerto aereopuertos[]= new Aeropuerto [num];
    
    public static void main(String[] args) {
        
    }
    
    public static void insertarDatosAereo(Aeropuerto aero[]){
        aero[0]= new AereoPublico(2000000, "El Dorado", "Bogotá", "Colombia");
        aero[0].meterCompanias(new Companias("Avianca"));
        aero[0].meterCompanias(new Companias("LATAM"));
        aero[0].getCompanias("Aviaca").insertarVuelos(new Vuelos (5165,"Bogotá", "New York",5000.99,150));
        aero[0].getCompanias("Avianca").insertarVuelos(new Vuelos (5178,"Bogotá", "medellín",100.99,70));
        aero[0].getCompanias("LATAM").insertarVuelos(new Vuelos (5277,"Bogotá", "Rio de Janeiro",800.45,200));
        aero[0].getCompanias("Avianca").getVuelo(5165).añadirPasajero("Santiago", "84DF", "Colombiana");
        aero[0].getCompanias("Avianca").getVuelo(5165).añadirPasajero("Nicolas", "13NH", "Estadounidence");
        aero[0].getCompanias("LATAM").getVuelo(5277).añadirPasajero("Federico", "68FE", "Argentina");
    }
}
