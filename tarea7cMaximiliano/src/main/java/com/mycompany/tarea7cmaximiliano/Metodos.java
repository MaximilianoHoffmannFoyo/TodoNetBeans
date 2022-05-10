package com.mycompany.tarea7cmaximiliano;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Metodos {

    public static void guardarCSV(ArrayList<HoraDeClase> lista) throws IOException {

        Scanner entrada = new Scanner(System.in);
        String id = entrada.nextLine();
        String idfichero = id + ".csv";

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (HoraDeClase horaDeClase : lista) {

                if (horaDeClase.getCurso().equalsIgnoreCase(id)) {

                    // Usamos metodo write() para escribir en el buffer
                    flujo.write(horaDeClase.toString());

                    // Metodo newLine() añade línea en blanco
                    flujo.newLine();
                }
            }

            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void guardarJSON(ArrayList<HoraDeClase> lista) throws IOException {        
        
        Scanner entrada = new Scanner(System.in);
        String id = entrada.nextLine();
        String idfichero = id + ".json";
        
        
        ArrayList<HoraDeClase> l = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getProfesor().equalsIgnoreCase(id)){
                l.add(lista.get(i));
                System.out.println("se agrego un dato");
            }
//            System.out.println("r");
        }

        
        
        ObjectMapper mapeador = new ObjectMapper();

//        ArrayList<HoraDeClase> listaNueva = lista;
//        for (HoraDeClase horaDeClase : lista) {
//            if (horaDeClase.getProfesor().equalsIgnoreCase(id)) {
//                listaNueva.remove(horaDeClase);
//            }
//        }

        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        mapeador.writeValue(new File(idfichero), l);
    }

    public static Set<String> setCurso(ArrayList<HoraDeClase> l) {
        Set<String> set = new TreeSet<>();
        for (HoraDeClase e : l) {
            set.add(e.getCurso());
        }
        return set;
    }

    public static Set<String> setProfesor(ArrayList<HoraDeClase> l) {
        Set<String> set = new TreeSet<>();
        for (HoraDeClase e : l) {
            set.add(e.getProfesor());
        }
        return set;
    }

    public static ArrayList<HoraDeClase> crearListaDeFicheroCSV(String idFichero) {

        String[] tokens;
        String linea;

        ArrayList<HoraDeClase> lista = new ArrayList<>();

        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();
                System.out.println(linea);
                linea = linea.replace("\"", "");
                linea = linea.replace("\t", "");
//                linea = linea.replace(" ", "");
                System.out.println(linea);

                tokens = linea.split(";");
                tokens[0] = tokens[0].substring(1);
                for (int i = 1; i < 5; i++) {
                    tokens[i] = tokens[i].substring(2);
                    tokens[i] = tokens[i].substring(0, tokens[i].length() - 2);
                }
                tokens[6] = tokens[6].substring(0, tokens[6].length() - 1);

                System.out.println(linea);
                
                lista.add(new HoraDeClase(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3],
                        tokens[4], Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6])));

//                for (String token : tokens) {
//                    System.out.println(token);
//                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
