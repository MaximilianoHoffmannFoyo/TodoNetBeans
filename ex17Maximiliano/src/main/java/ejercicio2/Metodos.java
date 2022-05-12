package ejercicio2;

import ejercicio1.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    public static ArrayList<Ronda> lecturaFicheroTXT() {

        // Fichero a leer con datos de ejemplo
        String idFichero = "escaleraColor.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Carta> listaC;
        ArrayList<Ronda> listaR = new ArrayList<>();
        Ronda ronda;

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "us-ascii")) {

            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                listaC = new ArrayList<>();
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
//                System.out.println(linea);
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(" ");
//                for (String token : tokens) {
//                    System.out.print(token + ";");
//                }
                int contAux = 0;
                for (int i = 0; i < 4; i++) {
                    listaC.add(new Carta(tokens[contAux], cambiarLetraAPalabra(tokens[contAux + 1])));
                    contAux += 2;
                }
                ronda = new Ronda(listaC);
                listaR.add(ronda);
//                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaR;
    }

    public static String cambiarLetraAPalabra(String letra) {
        String palo = "";
        if (letra.equalsIgnoreCase(Baraja.getPalos()[0].substring(0, 1))) {
            palo = "picas";
        } else if (letra.equalsIgnoreCase(Baraja.getPalos()[1].substring(0, 1))) {
            palo = "diamantes";
        } else if (letra.equalsIgnoreCase(Baraja.getPalos()[2].substring(0, 1))) {
            palo = "tréboles";
        } else if (letra.equalsIgnoreCase(Baraja.getPalos()[3].substring(0, 1))) {
            palo = "corazones";
        }

        return palo;
    }

}
