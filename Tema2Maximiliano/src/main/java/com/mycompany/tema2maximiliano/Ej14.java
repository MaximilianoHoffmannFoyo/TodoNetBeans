
package com.mycompany.tema2maximiliano;
import java.util.Scanner;

public class Ej14 {
        //14.- Crea una nueva clase llamada Ej14, que contenga una llamada al 
        //método public static void main(String[] args). El programa tendrá una 
        //variable entera tiempo inicializada con un valor leído por teclado, 
        //en segundos, y queremos conocer este tiempo pero expresado en horas, 
        //minutos y segundos, mostrando los resultados por pantalla.

    public static void main(String[] args) {
        //Delaramos e inicializamos las constantes
        int conversor = 60;
        
        //Declaramos la variable Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Pedimos por teclado la variable tiempo, en segundos
        System.out.println("Inserta el tiemipo en Segundos: ");
        int tiempo = entradaTeclado.nextInt() ;
        
        //Calculamos los minutos y las horas
        double tiempoMinutos = tiempo  / (double)conversor;
        double tiempoSegundos = tiempo % (double)conversor;
        
        double tiempoHoras = tiempoMinutos  / (double)conversor;
        tiempoMinutos = tiempoMinutos  % (double)conversor;
        
        //Cuidado que el printf redondea
        System.out.printf("Los segundos dados son: %.0f horas, %.0f minutos y %.0f segundos ", tiempoHoras, tiempoMinutos, tiempoSegundos);
    }
}

