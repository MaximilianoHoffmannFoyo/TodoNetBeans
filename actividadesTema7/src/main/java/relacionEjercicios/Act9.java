package relacionEjercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import vehiculo.*;

/*9.- Realiza una modificación sobre el programa del ejercicio 7 para que divida
la única lista de objetos Vehiculo en tres listas específicas de objetos Turismo, Deportivo y Furgoneta. 
Una vez generadas las tres listas, guarda en tres ficheros CSV (*.csv) 
los vehículos correspondientes a cada lista, separando cada campo usando 
el carácter delimitador punto y coma (;). Abre los ficheros CSV usando un 
programa de hoja de cálculo, indicando que la separación de campos se realiza 
usando ;, y comprueba que cada campo se encuentra en una columna diferente.
 */
public class Act9 {

    public static void main(String[] args) {

        // Fichero a leer con datos de ejemplo
        String idFichero = "vehiculosAct4.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Vehiculo> listaTurismo = new ArrayList<>();
        ArrayList<Vehiculo> listaDeportivo = new ArrayList<>();
        ArrayList<Vehiculo> listaFurgoneta = new ArrayList<>();

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
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
                switch (tokens[0]) {
                    case "0":
                        listaTurismo.add(new Turismo(tokens[1], tokens[2], tokens[3], tokens[4],
                                Integer.parseInt(tokens[6]), Boolean.valueOf(tokens[7])));
                        break;
                    case "1":
                        listaDeportivo.add(new Deportivo(tokens[1], tokens[2], tokens[3], tokens[4],
                                Integer.parseInt(tokens[6]), Boolean.valueOf(tokens[7]),
                                Boolean.valueOf(tokens[8])));
                        break;
                    case "2":
                        listaFurgoneta.add(new Furgoneta(tokens[1], tokens[2], tokens[3], tokens[4],
                                Integer.parseInt(tokens[6]), Boolean.valueOf(tokens[7]),
                                tokens[8]));
                        break;
                    default:
                        break;
                }
            }
//            for (Vehiculo v : listaTurismo) {
//                System.out.println(v.toString());
//            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        Act9.insertarEnCSV("act9/Turismos.csv", listaTurismo);
        Act9.insertarEnCSV("act9/Deportivos.csv", listaDeportivo);
        Act9.insertarEnCSV("act9/Furgoneta.csv", listaFurgoneta);

    }
    
    public static void insertarEnCSV(String idfichero , ArrayList<Vehiculo> lista){
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            
            for (Vehiculo v : lista) {
                
                String atributosCoche = v.toString();
                atributosCoche = atributosCoche.replace("0 - ", "");
                atributosCoche = atributosCoche.replace("1 - ", "");
                atributosCoche = atributosCoche.replace("2 - ", "");
                atributosCoche = atributosCoche.replace("2 - ", "");
                atributosCoche = atributosCoche.replace(":", ";");
                // Usamos metodo write() para escribir en el buffer
                flujo.write(atributosCoche);
                
                // Metodo newLine() añade línea en blanco
                flujo.newLine();
            }

            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
