
package com.mycompany.emparejandocalcetinesmaxi;

import java.util.Random;

public class Calcetin {
    
    private Colores color;
    private int talla;

    public Calcetin(){
        Random aleatorio = new Random();
        Colores[] listaColores = Colores.values();
        this.color = listaColores[aleatorio.nextInt(listaColores.length)];
        this.talla = aleatorio.nextInt(4)+40;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Calcetin{" + "color=" + color + ", talla=" + talla + '}';
    }
    
    public static Calcetin[] generarNCalcetinesAleatorios(int n){
        Calcetin[] array = new Calcetin[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Calcetin();
        }
        return array;
    }
    
    public static void mostrarArrayCalcetines(Calcetin[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }
    
}
