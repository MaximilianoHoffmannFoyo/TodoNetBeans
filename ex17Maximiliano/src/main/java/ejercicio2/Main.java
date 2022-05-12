package ejercicio2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ronda> listaRondas = Metodos.lecturaFicheroTXT();

        for (Ronda listaRonda : listaRondas) {
            System.out.println("Nueva Ronda:-------------------");
            listaRonda.imprimirRonda();
        }

    }

}
