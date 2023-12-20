package com.mycompany.proyectoaereopuerto;


public class AereoPrivado extends Aereopuertos{

    private String empresas[];

    public AereoPrivado(String[] empresas, String nombreAereo, String ciudad, String pais) {
        super(nombreAereo, ciudad, pais);
        this.empresas = empresas;
    }

    public AereoPrivado(String[] empresas, String nombreAereo, String ciudad, String pais, Companias n) {
        super(nombreAereo, ciudad, pais, n);
        this.empresas = empresas;
    }
    
    
}

