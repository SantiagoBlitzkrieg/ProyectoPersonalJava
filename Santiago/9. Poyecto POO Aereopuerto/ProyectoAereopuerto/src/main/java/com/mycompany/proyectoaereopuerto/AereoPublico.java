package com.mycompany.proyectoaereopuerto;

public class AereoPublico extends Aereopuertos{
    private double subvencionGob;

    public AereoPublico(double subvencionGob, String nombreAereo, String ciudad, String pais) {
        super(nombreAereo, ciudad, pais);
        this.subvencionGob = subvencionGob;
    }

    public double getSubvencionGob() {
        return subvencionGob;
    }
    
}
