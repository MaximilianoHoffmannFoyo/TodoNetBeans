package com.mycompany.avion;

import java.util.ArrayList;

/*clase vuelo con 5 atributos: cod vuelo, ciudad origen, ciudad destino, duracion vuelo, 
lista pasajeros. Main : generar una lista de vuelos. metodo static en el main que devuelve 
un map que contiene para cada destino el numero de pasajeros que llegan a ese destino de 
todos los vuelos . repetir el metodo pero ordenado por destino (alfabeticamente). 
3º metodo que permita saber por codigo de vuelo los pasajeros del vuelo (mostrar lista de pasajeros)
 */
public class Vuelo {

    private String codigo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double duracion;
    private ArrayList<Pasajero> listaPasajeros;

    public Vuelo() {
    }

    public Vuelo(String codigo, String ciudadOrigen, String ciudadDestino, double duracion, ArrayList<Pasajero> listaPasajeros) {
        this.codigo = codigo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.duracion = duracion;
        this.listaPasajeros = listaPasajeros;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Pasajero> getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(ArrayList<Pasajero> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codigo=" + codigo + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", duracion=" + duracion + ", listaPasajeros=" + listaPasajeros + '}';
    }

}
