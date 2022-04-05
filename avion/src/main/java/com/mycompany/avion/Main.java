package com.mycompany.avion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    
    public static void main(String[] args) {
        
        Pasajero p1 = new Pasajero("Ela", "Kidner", "5346342D");
        Pasajero p2 = new Pasajero("Fer", "Hernis", "5222242G");
        Pasajero p3 = new Pasajero("Dani", "Robber", "765723M");
        Pasajero p4 = new Pasajero("Middle", "Kidner", "5355662D");
        Pasajero p5 = new Pasajero("Tyer", "Top", "124132W");
        Pasajero p6 = new Pasajero("Rock", "Bottom", "546756H");
        ArrayList<Pasajero> lp1 = new ArrayList<>();
        lp1.add(p1);
        lp1.add(p2);
        ArrayList<Pasajero> lp2 = new ArrayList<>();
        lp2.add(p3);
        lp2.add(p4);        
        ArrayList<Pasajero> lp3 = new ArrayList<>();
        lp3.add(p5);
        lp3.add(p6);

        ArrayList<Vuelo> listaVuelos = new ArrayList<>();
        listaVuelos.add(new Vuelo("1", "Madrid", "Zimbawe", 4, lp1));
        listaVuelos.add(new Vuelo("2", "Madrid", "Andorra", 5, lp2));
        listaVuelos.add(new Vuelo("3", "Madrid", "Roma", 10, lp3));
        listaVuelos.add(new Vuelo("4", "Madrid", "Roma", 10, lp3));
       
        System.out.println("No ordenado");
        Map<String, ArrayList> pasajeros = numeroPasajerosLleganDestino(listaVuelos);
        for (String key : pasajeros.keySet()) {
            System.out.println("Clave: "+key+" Pasajeros: "+pasajeros.get(key).size());
        }
        System.out.println("\nOrdenado");
        SortedMap<String, ArrayList> pasajerosOrdenados = numeroPasajerosLleganDestinoOrdenado(listaVuelos);
        for (String key : pasajerosOrdenados.keySet()) {
            System.out.println("Clave: "+key+" Pasajeros: "+pasajerosOrdenados.get(key).size());
        }
        
    }
    
    static Map numeroPasajerosLleganDestino(ArrayList<Vuelo> listaVuelos){
        Map<String, ArrayList> pasajeros = new HashMap<>();
        for (Vuelo vuelo : listaVuelos) {
//            if (pasajeros.containsKey(vuelo.getCiudadDestino())){
//                
//                for (int i = 0; i < vuelo.getListaPasajeros().size(); i++) {
//                    pasajeros.get(vuelo.getCiudadDestino()).add(
//                            (vuelo.getListaPasajeros().get(i)));
//                }
//    
//                                
//            }else{
                pasajeros.put(vuelo.getCiudadDestino(),vuelo.getListaPasajeros());                
//            }
        }
        return pasajeros;
    }
    //no he sido capaz de añadir mas pasajeros si los vuelos se repiten 
    
    static SortedMap numeroPasajerosLleganDestinoOrdenado(ArrayList<Vuelo> listaVuelos){
        SortedMap<String, ArrayList> pasajeros = new TreeMap<>();
        for (Vuelo listaVuelo : listaVuelos) {
            pasajeros.put(listaVuelo.getCiudadDestino(),listaVuelo.getListaPasajeros());
        }
        return pasajeros;
    }
    
}
