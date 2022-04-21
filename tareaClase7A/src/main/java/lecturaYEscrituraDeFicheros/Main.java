package lecturaYEscrituraDeFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        // Fichero a leer con datos de ejemplo
        String idFichero = "RelPerCen.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Empleado> lista = new ArrayList<>();

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            datosFichero.nextLine();
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
//                System.out.println(linea);
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split("\",\"");
                tokens[0] = tokens[0].substring(1);
                tokens[7] = tokens[7].substring(0, tokens[7].length() - 1);
                for (String token : tokens) {
//                    System.out.print(token + ";");
                }
                lista.add(new Empleado(tokens[0], tokens[1], tokens[2],
                        Main.convertirEnLocalDate(tokens[3]), Main.convertirEnLocalDate((tokens[4])),
                        tokens[5], tokens[6], tokens[7]));
//                System.out.println("");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //MOSTRAR DATOS
            //Lista optenida del fichero
        for (Empleado v : lista) {
            System.out.println(v.toString());
        }
            //Total de profesores
        System.out.println("El total de profesores se de: "+lista.size());
        

    }

    public static LocalDate convertirEnLocalDate(String fechaString) {
        LocalDate fecha;
        if (!fechaString.isBlank()) {
            String[] fechaArray = fechaString.split("/");
            fecha = LocalDate.of(Integer.parseInt(fechaArray[2]),
                    Integer.parseInt(fechaArray[1]), Integer.parseInt(fechaArray[0]));
        } else {
            fecha = null;
        }
//        System.out.println(fecha);
        return fecha;
    }

    public static void map(ArrayList<Empleado> l){
        Map<String, Empleado> mapa = new TreeMap<>();
//        for (Empleado e : l) {
//            mapa.put(e.getPuesto(), value);            
//        }
    }
}
