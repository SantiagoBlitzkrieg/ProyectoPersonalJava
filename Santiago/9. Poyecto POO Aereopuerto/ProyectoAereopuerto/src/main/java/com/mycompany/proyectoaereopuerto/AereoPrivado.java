package com.mycompany.proyectoaereopuerto;


public class AereoPrivado extends Aeropuerto{

    private String empresas[] = new String [10];
    private int numEmpresas;

    public AereoPrivado(String nombreAereo, String ciudad, String pais) {
        super(nombreAereo, ciudad, pais);
        numEmpresas=0;
    }

    public AereoPrivado(String[] empre, String nombreAereo, String ciudad, String pais, Companias n[]) {
        super(nombreAereo, ciudad, pais, n);
        empresas=empre;
        numEmpresas=empre.length;
    }
    
    public void meterEmpresa (String emp[]){
        this.empresas=emp;
        this.numEmpresas=emp.length;
    }
    
    public void meterEmpresa (String emp){
        empresas[numEmpresas]=emp;
        numEmpresas++;
    }

    public String[] getEmpresas() {
        return empresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }
    
    
}

