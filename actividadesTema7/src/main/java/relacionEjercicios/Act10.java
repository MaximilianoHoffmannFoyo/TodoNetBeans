package relacionEjercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import vehiculo.*;

/*10.- Implementa un programa para leer los ficheros de texto del ejercicio anterior, 
de forma que se guarden en una única lista de Vehículos los objetos leídos de cada fichero. 
El programa debe realizar lo siguiente:
Copiar los tres ficheros *.csv a un directorio previamente creado en “./copias”.
Mostrar los ficheros contenidos en “copias”.
Leer los ficheros de la carpeta “copias” e ir guardando los objetos en una lista de vehículos.
Imprimir la lista por pantalla. 
Ordena la lista por bastidor.
Imprimir la lista ordenada.
Borrar los ficheros *.csv originales.
Mostrar el contenido de la carpeta donde estaban los *.csv originales.
Usando Streams, realiza las siguientes acciones sobre la lista de vehículos:
Imprime por pantalla todos los coches blancos, distintos, ordenador por matrícula.
Imprime por pantalla todas las marcas de coches distintas de aquellos coches que estén disponibles.
Saber la cantidad de vehículos Citroen.
Comprueba si hay algún Peugeot negro disponible en la lista.

 */
public class Act10 {

    public static void main(String[] args) {

        /*Copiar los tres ficheros *.csv a un directorio previamente creado en “./copias”.*/
        crearDirectorios("./copias");
        copiarFicheros("act9/Turismos.csv", "./copias/Turismos.csv");
        copiarFicheros("act9/Deportivos.csv", "./copias/Deportivos.csv");
        copiarFicheros("act9/Furgoneta.csv", "./copias/Furgoneta.csv");
        /*Mostrar los ficheros contenidos en “copias”.*/
        listarDirectorio("./copias");
        /*Leer los ficheros de la carpeta “copias” e ir guardando los objetos en una lista de vehículos.*/
        ArrayList<Vehiculo> listaCompleta = new ArrayList<>();
        listaCompleta.addAll(Act10.llenarArrayConCSVTurismo("copias/Turismos.csv"));
        listaCompleta.addAll(Act10.llenarArrayConCSVDeportivo("copias/Deportivos.csv"));
        listaCompleta.addAll(Act10.llenarArrayConCSVFurgoneta("copias/Furgoneta.csv"));
        /*Imprimir la lista por pantalla. */
        System.out.println("\n\nImprimir la lista por pantalla");
        for (Vehiculo vehiculo : listaCompleta) {
            System.out.println(vehiculo.toString());
        }
        /*Ordena la lista por bastidor.*/
        Collections.sort(listaCompleta,(Vehiculo v1, Vehiculo v2) -> v1.getMatricula().compareTo(v2.getMatricula()));
        /*Imprimir la lista ordenada.*/
        System.out.println("\n\nImprimir la lista ordenada");
        for (Vehiculo vehiculo : listaCompleta) {
            System.out.println(vehiculo.toString());
        }
        /*Borrar los ficheros *.csv originales.*/
        borrarElemento("act9/Turismos.csv");
        borrarElemento("act9/Deportivos.csv");
        borrarElemento("act9/Furgoneta.csv");
        /*Mostrar el contenido de la carpeta donde estaban los *.csv originales.*/
        listarDirectorio("act9");
    }

    public static ArrayList<Vehiculo> llenarArrayConCSVTurismo(String idFichero) {
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Vehiculo> lista = new ArrayList<>();

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {

            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
//                System.out.println(linea);
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");
//                for (String token : tokens) {
//                    System.out.print(token + "\t");
//                }
                lista.add(new Turismo(tokens[0], tokens[1], tokens[2],
                        tokens[3], Integer.parseInt(tokens[5]), Boolean.parseBoolean(tokens[6])));
//                System.out.println("");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        for (Vehiculo vehiculo : lista) {
//            System.out.println(vehiculo.toString());
//        }
        return lista;
    }

    public static ArrayList<Vehiculo> llenarArrayConCSVDeportivo(String idFichero) {
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Vehiculo> lista = new ArrayList<>();

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {

            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
//                System.out.println(linea);
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");
//                for (String token : tokens) {
//                    System.out.print(token + "\t");
//                }
                lista.add(new Deportivo(tokens[0], tokens[1], tokens[2],
                        tokens[3], Integer.parseInt(tokens[5]), Boolean.parseBoolean(tokens[6]),
                        Boolean.parseBoolean(tokens[7])));
//                System.out.println("");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        for (Vehiculo vehiculo : lista) {
//            System.out.println(vehiculo.toString());
//        }
        return lista;
    }

    public static ArrayList<Vehiculo> llenarArrayConCSVFurgoneta(String idFichero) {
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Vehiculo> lista = new ArrayList<>();

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {

            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
//                System.out.println(linea);
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(";");
//                for (String token : tokens) {
//                    System.out.print(token + "\t");
//                }
                lista.add(new Furgoneta(tokens[0], tokens[1], tokens[2], tokens[3],
                        Integer.parseInt(tokens[5]), Boolean.parseBoolean(tokens[6]), tokens[7]));
//                System.out.println("");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        for (Vehiculo vehiculo : lista) {
//            System.out.println(vehiculo.toString());
//        }
        return lista;
    }

    public static void crearDirectorios(String ruta) {

        Path directory = Paths.get(ruta);
        try {
            Files.createDirectories(directory);
        } catch (AccessDeniedException ade) {
            System.out.println("No tiene permisos para crear " + ruta);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio " + ruta);
            System.out.println("Seguramente la ruta está mal escrita o no existe");
        }

    }

    public static void listarDirectorio(String ruta) {

        File f = new File(ruta);
        if (f.exists()) {
            // Obtiene los ficheros y directorios dentro de f y los 
            // devuelve en un array
            File[] ficheros = f.listFiles();
            for (File file : ficheros) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }

    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);
        try {
            Files.copy(origen, destino);
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        }
    }
    
    public static void borrarElemento(String ruta) {
        Path file = Paths.get(ruta);
        try {
            Files.delete(file);
        } catch (NoSuchFileException nsfe) {
            System.out.println("No se puede borrar " + ruta + " porque no existe");
        } catch (DirectoryNotEmptyException dnee) {
            System.out.println("No se puede borrar el directorio porque no está vacío");
        } catch (IOException e) {
            System.out.println("Problema borrando el elemento " + ruta);
        }
    }
}
