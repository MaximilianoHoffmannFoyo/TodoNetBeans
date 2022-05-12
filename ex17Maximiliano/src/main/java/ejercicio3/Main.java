package ejercicio3;

import ejercicio2.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ronda> listaRondas = ejercicio2.Metodos.lecturaFicheroTXT();

        for (Ronda listaRonda : listaRondas) {
            listaRonda.imprimirRonda();
            Metodos.ordenarRonda(listaRonda);
            listaRonda.imprimirRonda();
            System.out.println("");
        }
    }
}
