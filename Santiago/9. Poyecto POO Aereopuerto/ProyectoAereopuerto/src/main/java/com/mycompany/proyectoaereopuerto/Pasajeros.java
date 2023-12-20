package com.mycompany.proyectoaereopuerto;

public class Pasajeros {
    private String nombre;
    private String Pasaporte;
    private String nacionalidad;

    public Pasajeros(String nombre, String Pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.Pasaporte = Pasaporte;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return Pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
}
