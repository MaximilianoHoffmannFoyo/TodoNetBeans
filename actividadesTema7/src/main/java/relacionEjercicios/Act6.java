package relacionEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Act6 {

    /*6.- Implementa un programa que lea el fichero del ejercicio 3 y muestre 
    el contenido del fichero. Además buscará la primera ocurrencia, en cada 
    línea, de las letras seguidas ‘w’, ‘e’, ‘b’, informando de la posición que 
    ocupan en la línea, si es que existe esa ocurrencia.
     */
    public static void main(String[] args) {

        // Fichero a leer con datos de ejemplo
        String idFichero = "letrasAct3.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        int contador = 0;
        int posicion = 0;
        String informe = "";

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {

            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                contador++;
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                System.out.println(linea);
                if (linea.contains("w;e;b")) {
                    if (linea.indexOf("w;e;b")>0) {
                        posicion = linea.indexOf("w;e;b")/2;
                    }else{
                        posicion = 0;
                    }
                    System.out.println("En la fila "+contador+" hay ocurrencia en la posición: " + posicion);
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
