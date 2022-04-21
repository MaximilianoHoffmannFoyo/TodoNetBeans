package relacionEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import vehiculo.*;

public class Act7 {

    /*7.- Realiza un programa que lea los datos del ejercicio 4. Para ello 
    creará una lista de objetos de tipo Vehiculo. El programa irá almacenando 
    en la lista los objetos leídos desde el archivo de texto “vehículos.txt”. 
    Una vez cargados todos los datos en la lista, ordena los vehículos por Marca
    y muestra el resultado por consola.
     */
    public static void main(String[] args) {
        
        // Fichero a leer con datos de ejemplo
        String idFichero = "vehiculosAct4.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Vehiculo> lista = new ArrayList<>();

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                linea = linea.replace("0 - ", "0:");
                linea = linea.replace("1 - ", "1:");
                linea = linea.replace("2 - ", "2:");
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(":");
                    if (tokens[0].equals("0")) {
                        lista.add(new Turismo(tokens[1], tokens[2], tokens[3], tokens[4], 
                                Integer.parseInt(tokens[6]), Boolean.valueOf(tokens[7])));
                    }else if (tokens[0].equals("1")) {
                        lista.add(new Deportivo(tokens[1], tokens[2], tokens[3], tokens[4], 
                                Integer.parseInt(tokens[6]), Boolean.valueOf(tokens[7]),
                                Boolean.valueOf(tokens[8])));
                    }else if (tokens[0].equals("2")) {
                        lista.add(new Furgoneta(tokens[1], tokens[2], tokens[3], tokens[4], 
                                Integer.parseInt(tokens[6]), Boolean.valueOf(tokens[7]),
                                tokens[8]));
                    }
            }
            for (Vehiculo v : lista) {
            System.out.println(v.toString());
        } 
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
