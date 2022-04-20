package relacionEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
        int suma = 0;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split("\t");
                for (String string : tokens) {
                    suma += Integer.parseInt(string);
                }
            }
            System.out.println("La suma de todos los numeros es: "+ suma);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
