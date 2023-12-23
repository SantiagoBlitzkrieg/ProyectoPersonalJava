 package com.mycompany.proyectoaereopuerto;

public class Companias {
    private String nombre;
    private int numVuelos=0;  
    private Vuelos vuelo[]= new Vuelos [10];

    public Companias(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Companias(String nombre, Vuelos vuelos[]) {  //Mejor que el vuelos sea un arreglo, no un objeto
        this.nombre = nombre;
        vuelo= vuelos;
        numVuelos=vuelo.length;
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
    public Vuelos getVuelo(String id){
        boolean encontrado = false; 
        int i=0;
        Vuelos vue= null;
        while (encontrado !=true && i<vuelo.length){
            if (id.equals(vuelo[i].getId())){
                encontrado = true;
                vue = vuelo[i];
            }
            i++;
        }
        return vue;
    }
            
}
