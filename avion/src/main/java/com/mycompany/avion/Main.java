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
        Map<String, Integer> pasajeros = numeroPasajerosLleganDestino(listaVuelos);
        for (String key : pasajeros.keySet()) {
            System.out.println("Clave: "+key+" Pasajeros: "+pasajeros.get(key));
        }
        System.out.println("\nOrdenado");
        SortedMap<String, Integer> pasajerosOrdenados = numeroPasajerosLleganDestinoOrdenado(listaVuelos);
        for (String key : pasajerosOrdenados.keySet()) {
            System.out.println("Clave: "+key+" Pasajeros: "+pasajerosOrdenados.get(key));
        }
        
        System.out.println("\nCodigo vuelo con Arrary de pasajeros");
        Map<String, ArrayList> pasajerosPorCodigoVuelo = PasajerosLleganDestino(listaVuelos);
        for (String key : pasajerosPorCodigoVuelo.keySet()) {
            System.out.println("Codigo: "+key+" Pasajeros: "+pasajerosPorCodigoVuelo.get(key));
        }
    }
//Método que devuelve un map donde para cada ciudad de destino se indique el 
//número de pasajeros que vuelan a ese destino, de entre todos los vuelos.
    
    static Map numeroPasajerosLleganDestino(ArrayList<Vuelo> listaVuelos){
        Map<String, Integer> pasajeros = new HashMap<>();
        for (Vuelo vuelo : listaVuelos) {
            if (pasajeros.containsKey(vuelo.getCiudadDestino())){
                pasajeros.put(vuelo.getCiudadDestino(),vuelo.getListaPasajeros().size()
                        +pasajeros.get(vuelo.getCiudadDestino()));
            }else{
                pasajeros.put(vuelo.getCiudadDestino(),vuelo.getListaPasajeros().size());                
            }
        }
        return pasajeros;
    }
    
//Método que devuelva la misma información que el anterior pero garantizando que 
//las ciudades contenidas en el map están ordenadas alfabéticamente.
    static SortedMap numeroPasajerosLleganDestinoOrdenado(ArrayList<Vuelo> listaVuelos){
        SortedMap<String, Integer> pasajeros = new TreeMap<>();
        for (Vuelo vuelo : listaVuelos) {
            if (pasajeros.containsKey(vuelo.getCiudadDestino())){
                pasajeros.put(vuelo.getCiudadDestino(),vuelo.getListaPasajeros().size()
                        +pasajeros.get(vuelo.getCiudadDestino()));
            }else{
                pasajeros.put(vuelo.getCiudadDestino(),vuelo.getListaPasajeros().size());                
            }
        }
        return pasajeros;
    }
    
//Método que genere un map donde a partir del código de vuelo se puedan 
//obtener todos los pasajeros de ese vuelo.
    
    static Map PasajerosLleganDestino(ArrayList<Vuelo> listaVuelos){
        Map<String, ArrayList> pasajeros = new HashMap<>();
        for (Vuelo listaVuelo : listaVuelos) {
            pasajeros.put(listaVuelo.getCodigo(),listaVuelo.getListaPasajeros());
        }
        return pasajeros;
    }
    
}
