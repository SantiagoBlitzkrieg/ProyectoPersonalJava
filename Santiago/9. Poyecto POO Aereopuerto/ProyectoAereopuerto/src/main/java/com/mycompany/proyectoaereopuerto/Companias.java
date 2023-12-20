package com.mycompany.proyectoaereopuerto;

public class Companias {
    private String nombre;
    private int numVuelos=0;  
    private Vuelos vuelo[]= new Vuelos [numVuelos];

    public Companias(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Companias(String nombre, Vuelos vuelos) {
        this.nombre = nombre;
        this.vuelo[numVuelos] = vuelos;
        numVuelos++;
    }
    
    public void insertarVuelos(Vuelos v){
        vuelo [numVuelos]= v;
        numVuelos++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelos() {
        return numVuelos;
    }
    
    public Vuelos getVuelo(int i){
        return vuelo[i];
    }
//    public Vuelos getVuelo(String id){
//        return vuelo[];
//    }
            
}
