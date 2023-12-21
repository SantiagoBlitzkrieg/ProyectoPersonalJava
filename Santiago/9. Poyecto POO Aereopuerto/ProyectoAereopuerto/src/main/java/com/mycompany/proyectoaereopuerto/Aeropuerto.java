package com.mycompany.proyectoaereopuerto;

public class Aeropuerto {
    
    private String nombreAereo;
    private String ciudad;
    private String pais;
    private int numCompanias;
    private Companias companias[]= new Companias[10];
    
    public Aeropuerto(String nombreAereo, String ciudad, String pais) {
        this.nombreAereo = nombreAereo;
        this.ciudad = ciudad;
        this.pais = pais;
        numCompanias=0;
    }
    public Aeropuerto(String nombreAereo, String ciudad, String pais, Companias n[]) {
        this.nombreAereo = nombreAereo;
        this.ciudad = ciudad;
        this.pais = pais;
        companias = n;
        numCompanias=n.length;
    }
    
    public void meterCompanias(Companias c){
        companias[numCompanias]=c;
        numCompanias++;
    }

    public String getNombreAereo() {
        return nombreAereo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public int getNumCompanias() {
        return numCompanias;
    }
    
    public Companias getCompanias (int i){
        return companias[i];
    }
    
    public Companias getCompanias (String nombre){
        boolean encontrado = false;
        int i=0;
        Companias com= null;
        
        while ((!encontrado) && i<companias.length){   //Fijarse que ese !encontrado ==> encontrado == false
            if (nombre.equals(companias[i].getNombre())){
                encontrado = true;
                com = companias[i];
            }
            i++;
        }
        return com;
    }
    
}


