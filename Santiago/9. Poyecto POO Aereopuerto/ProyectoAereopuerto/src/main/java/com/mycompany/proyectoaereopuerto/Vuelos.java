package com.mycompany.proyectoaereopuerto;

public class Vuelos {
    private String id;
    private String ciudadOrigen;
    private String ciudadDestino;
    private Double  precio;
    private int maxPasajeros;
    private int realPasajeros;
    private Pasajeros listaPasajeros [];
    public Vuelos(String id, String ciudadOrigen, String ciudadDestino, Double precio, int maxPasajeros) {
        this.id = id;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.maxPasajeros = maxPasajeros;
        this.realPasajeros = 0;
        this.listaPasajeros = new Pasajeros [maxPasajeros];
    }
    
    public void añadirPasajero(String nombre, String pasaporte, String nacionalidad){
        if (realPasajeros<maxPasajeros){
            listaPasajeros [realPasajeros] = new Pasajeros (nombre, pasaporte, nacionalidad);
            realPasajeros++;
        }else{
            System.out.println("\fError"+"\nEl vuelo se lleno");
        }
    }    
    
    public String getId() {
        return id;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public int getRealPasajeros() {
        return realPasajeros;
    }

    public Pasajeros getPasajeros(int k) {
        return listaPasajeros[k];
    }
        
    public Pasajeros getPasajeros(String pasaporte){
        int i=0;
        boolean encontrado = false;
        Pasajeros pas=null;
        while (encontrado==false && i!=realPasajeros){
            if (pasaporte.equals(listaPasajeros[i].getPasaporte())){ // --> pasaporte == listaPasajeros[i].getPasaporte()){
                encontrado= true;
                pas = listaPasajeros[i];
            }
            i++;
        }
        
        return pas;
    }
    
}
