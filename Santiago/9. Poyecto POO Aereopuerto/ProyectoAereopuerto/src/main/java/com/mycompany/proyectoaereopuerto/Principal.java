package com.mycompany.proyectoaereopuerto;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    static Scanner entrada = new Scanner (System.in);
    final static int num = 4; //No. Aereopuertos
    static Aeropuerto aeropuertos[]= new Aeropuerto [4];
    
    public static void main(String[] args) {
        
        insertarDatosAereo(aeropuertos);
        menu();
    }
    
    public static void insertarDatosAereo(Aeropuerto aero[]){
        //Aeropuerto 1
        aero[0]= new AereoPublico(2000000, "ElDorado", "Bogota", "Colombia");
        aero[0].meterCompanias(new Companias("Avianca"));
        aero[0].meterCompanias(new Companias("LATAM"));
        aero[0].getCompanias("Avianca").insertarVuelos(new Vuelos ("5165","Bogota", "New York",5000.99,150));
        aero[0].getCompanias("Avianca").insertarVuelos(new Vuelos ("5178","Bogota", "Medellin",100.99,70));
        aero[0].getCompanias("LATAM").insertarVuelos(new Vuelos ("5277","Bogotá", "Rio de Janeiro",800.45,200));
        aero[0].getCompanias("Avianca").getVuelo("5165").añadirPasajero("Santiago", "84DF", "Colombiano");
        aero[0].getCompanias("Avianca").getVuelo("5165").añadirPasajero("Nicolas", "13NH", "Estadounidence");
        aero[0].getCompanias("LATAM").getVuelo("5277").añadirPasajero("Federico", "68FE", "Argentino");
        
        //Aeropuerto 2        
        aero[1]= new AereoPublico(1500000, "JorgeChavez", "Callao", "Peru");
        aero[1].meterCompanias(new Companias("Aviox"));
        aero[1].meterCompanias(new Companias("LATAM"));
        aero[1].meterCompanias(new Companias ("Avianca"));
        aero[1].getCompanias("Aviox").insertarVuelos(new Vuelos ("5532","Callao", "Madrid",5500.99,250));
        aero[1].getCompanias("LATAM").insertarVuelos(new Vuelos ("5291","Callao", "La Paz",80.99,150));
        aero[1].getCompanias("Avianca").insertarVuelos(new Vuelos ("5111","Callao", "Bogota",800.45,150));
        aero[1].getCompanias("Avianca").getVuelo("5111").añadirPasajero("Rosita", "34FE", "Peruana");
        aero[1].getCompanias("Aviox").getVuelo("5532").añadirPasajero("Alberto", "98DN", "Peruano");
        aero[1].getCompanias("LATAM").getVuelo("5291").añadirPasajero("Juan", "20FC", "Boliviano");
        
        //Aeropuerto 3
        aero[2]= new AereoPrivado("Makindox", "Bucaramanga", "Colombia");
        ((AereoPrivado)aero[2]).meterEmpresa("CocaCola");  //DownCasting
        ((AereoPrivado)aero[2]).meterEmpresa("Parmalat"); //DownCasting
        ((AereoPrivado)aero[2]).meterEmpresa("OneOdio"); //DownCasting
        aero[2].meterCompanias(new Companias("LATAM"));
        aero[2].meterCompanias(new Companias ("Avianca"));
        aero[2].getCompanias("LATAM").insertarVuelos(new Vuelos ("5291","Bucaramanga", "Bogota",40.79,250));
        aero[2].getCompanias("Avianca").insertarVuelos(new Vuelos ("5111","Bucaramanga", "Cali",60.45,75));
        aero[2].getCompanias("Avianca").getVuelo("5111").añadirPasajero("Patricia", "84DS", "Colombiana");
        aero[2].getCompanias("LATAM").getVuelo("5291").añadirPasajero("Nicolas", "11AS", "Colombiano");
        
        //Aeropuerto 4
        aero[3]= new AereoPrivado("Blitzkrieg", "Bogota", "Colombia");
        String comp [] = {"Liberty", "Alpina"}; //Añadiendo los Strings del array directamente con corchetes
        ((AereoPrivado)aero[3]).meterEmpresa(comp);  //DownCasting
        aero[3].meterCompanias(new Companias("LATAM"));
        aero[3].meterCompanias(new Companias ("Avianca"));
        aero[3].getCompanias("LATAM").insertarVuelos(new Vuelos ("5216","Bogota", "La Paz",100.79,250));
        aero[3].getCompanias("Avianca").insertarVuelos(new Vuelos ("5103","Bogota", "Medellin",50.45,100));
        aero[3].getCompanias("Avianca").getVuelo("5103").añadirPasajero("Teresa", "61FD", "Argentina");
        aero[3].getCompanias("LATAM").getVuelo("5216").añadirPasajero("Alejandra", "01DD", "Colombiana");

    }
    
    public static Aeropuerto buscarAeropuerto(String nombre){
        int i=0;
        boolean encontrado = false;
        Aeropuerto aero = null;
        
        while (i<aeropuertos.length && encontrado == false){
            if (nombre.equals(aeropuertos[i].getNombreAereo())){
                aero = aeropuertos[i];
                encontrado = true;
            }
            i++;
        }
        return aero;
    }
    
    public static void menu (){
        
        int opciones;  
        
        do{
            System.out.println("\n\fMenu");
            System.out.println("1. Consultar aeropuertos existentes");
            System.out.println("2. Consultar datos especificos aeropuerto");
            System.out.println("3. Consultar compañias de un aeropuerto");
            System.out.println("4. Consultar vuelos de una compañia");
            System.out.println("5. Buscar vuelos según su destino");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opciones= entrada.nextInt();
            
            switch (opciones) {

                case 1:
                    consultarAeropuertos(aeropuertos);
                    
                    break;
                case 2:
                    consultarEspecificos();
                    
                    break;                
                case 3:
                    consultarCompanias();
                    
                    break;                
                case 4:
                    consultarVuelos();
                    
                    break;            
                case 5:
                    buscarVuelos();
                    
                    break;  
                case 6:

                    break;

                default:

                    System.out.println("Error, opción inexistente");
            }
        } while (opciones != 6);
        
        
    }
    
    public static void consultarAeropuertos(Aeropuerto aeropuertos[]){
        for (int i=0; i<aeropuertos.length; i++){
            
            System.out.println("\n");
            if (aeropuertos[i] instanceof AereoPrivado){ //el instance of es para definir el tipo de aeropuerto
                System.out.println((i+1)+". Aeropuerto Privado: "+"\nNombre: "+aeropuertos[i].getNombreAereo()+
                        "\nCiudad: "+aeropuertos[i].getCiudad()+
                        "\nPais: "+aeropuertos[i].getPais());       
            }else{
                System.out.println((i+1)+". Aeropuerto Publico: "+"\nNombre: "+aeropuertos[i].getNombreAereo()+
                        "\nCiudad: "+aeropuertos[i].getCiudad()+
                        "\nPais: "+aeropuertos[i].getPais());   
            }
        }                
    }
    
    
    
    public static void consultarEspecificos (){
        for (int i=0; i<aeropuertos.length; i++){
            System.out.println("\n");
            if (aeropuertos[i] instanceof AereoPrivado){ //el instance of es para definir el tipo de aeropuerto
                String empresas[] = new String [aeropuertos[i].getNumCompanias()];
                System.out.println((i+1)+". Aeropuerto Privado: "+aeropuertos[i].getNombreAereo());       
                System.out.println("Las compañias que lo patrocinan son las siguientes: ");
                empresas = ((AereoPrivado)aeropuertos[i]).getEmpresas();
                for (int j=0; j<((AereoPrivado)aeropuertos[i]).getNumEmpresas(); j++){
                    System.out.println((j+1)+". "+empresas[j]);
                }
                
            }else{
                System.out.println((i+1)+". Aeropuerto Publico: "+aeropuertos[i].getNombreAereo());       
                System.out.println("Recibe del gobierno una subvención de: "+((AereoPublico) aeropuertos[i]).getSubvencionGob());  
            }
            
        }
    }
    
    public static void consultarCompanias(){
        
        String nombre;
        Aeropuerto n;
        
        System.out.println("");
        System.out.print("Ingrese el nombre de la aerolina a la que desea consultar: ");
        nombre = entrada.next();
        n = buscarAeropuerto(nombre);
        if (n!= null){
            System.out.println("El aeropuerto "+nombre+" tiene las siguientes compañias: \n");
            for (int i=0; i<n.getNumCompanias(); i++){
                System.out.println((i+1)+". "+n.getCompanias(i).getNombre());
            }
        }else{
            System.out.println("El aeropuerto "+nombre+" no existe");
        }
    }
    
    public static void consultarVuelos(){
        
        String nombre;
        String compan;
        Aeropuerto n;
        Companias c;
        Vuelos v;
        
        System.out.println("");
        System.out.println("Ingrese el nombre de la aerolina a la que desea consultar: ");
        nombre = entrada.next();
        n = buscarAeropuerto(nombre);
        if (n!= null){
            System.out.println("Ingrese el nombre de la compañia que quiere consultar: ");
            compan = entrada.next();
            c = n.getCompanias(compan);
            if (c!= null){   
                System.out.println("La compañia "+compan+" tiene los siguientes vuelos: \n");
                for (int i=0; i<c.getNumVuelos(); i++){
                    v=c.getVuelo(i);
                    System.out.println((i+1)+". "+v.getId()+" que parte de "+v.getCiudadOrigen()+" hasta la ciudad de "+v.getCiudadDestino());
                }  
            }else{
                System.out.println("La compañia "+compan+" no existe");
            }
              
            
        }else{
            System.out.println("El aeropuerto "+nombre+" no existe");
        }
    }
    
    public static void buscarVuelos(){
        
        String ciudadOrigen;
        String ciudadFinal;
        Aeropuerto ar= null;
        Companias com = null;
        Vuelos vue = null;
        ArrayList <Vuelos> vuelo = new ArrayList <> ();
        
        System.out.print("Digite la ciudad de origen de su vuelo: ");
        ciudadOrigen = entrada.next();
        System.out.print("Digite la ciudad de destino de su vuelo: ");
        ciudadFinal = entrada.next();
        
        for (int i=0; i<aeropuertos.length; i++){
            ar = aeropuertos[i];
            for (int j=0; j<ar.getNumCompanias(); j++){
                com = ar.getCompanias(j);
                for (int k=0; k<com.getNumVuelos(); k++){
                    vue = com.getVuelo(k);
                    if (vue.getCiudadOrigen().equals(ciudadOrigen) && vue.getCiudadDestino().equals(ciudadFinal)){
                        vuelo.add(vue);
                    }    
                }
            }
        }
                    
        if (vuelo.isEmpty()==false){
            System.out.println("\nLos vuelos que parten de "+ciudadOrigen+" hasta la ciudad de "+ciudadFinal+" son: ");
            for (Vuelos a: vuelo){

                System.out.println("* Id: "+a.getId()+"\n Precio:"+a.getPrecio());
            }
        }else {
            System.out.println("No existe ningún vuelo que parta de "+ciudadOrigen+" hasta la ciudad de "+ciudadFinal);
        }
        
        
    }
    
}
