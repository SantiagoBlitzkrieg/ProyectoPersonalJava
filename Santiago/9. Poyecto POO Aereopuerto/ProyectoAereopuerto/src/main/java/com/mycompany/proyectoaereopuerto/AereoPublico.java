package com.mycompany.proyectoaereopuerto;

public class AereoPublico extends Aeropuerto{
    private double subvencionGob;

    public AereoPublico(String nombreAereo, String ciudad, String pais) {
        super(nombreAereo, ciudad, pais);
    }

    public AereoPublico(double subvencionGob, String nombreAereo, String ciudad, String pais, Companias[] n) {
        super(nombreAereo, ciudad, pais, n);
        this.subvencionGob = subvencionGob;
    }

    
    public AereoPublico(double subvencionGob, String nombreAereo, String ciudad, String pais) {
        super(nombreAereo, ciudad, pais);
        this.subvencionGob = subvencionGob;
    }

    public double getSubvencionGob() {
        return subvencionGob;
    }
    
}
