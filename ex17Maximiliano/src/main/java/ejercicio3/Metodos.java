package ejercicio3;

import ejercicio2.*;
import ejercicio1.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Metodos {

    public static void guardarTXT(ArrayList<Carta> lista, String idfichero) {

        boolean unaEjecucion = true;
        boolean tieneEscalera = true;
        String aux = "";
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (Carta c : lista) {
                if (unaEjecucion) {
                    aux = c.getPalo();
                }
                unaEjecucion = false;
                if (!c.getPalo().equals(aux)) {
                    tieneEscalera = false;
                }
                aux = c.getPalo();

                if (tieneEscalera) {
                    flujo.write(c.toString());
                    flujo.newLine();
                } else {
                    flujo.write("NADA");
                    flujo.newLine();
                }
            }

            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ordenarRonda(Ronda r) {
        Collections.sort(r.getCartas(), (Carta c1, Carta c2) -> c1.getNumero().compareTo(c2.getNumero()));
    }

}
