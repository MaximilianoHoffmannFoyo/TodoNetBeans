package act11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class Metodos {

    /*Guarda los datos de todas las App de la lista, en un fichero de texto llamado aplicacionestxt.txt, dentro del directorio “./appstxt”.*/
    public static void guardarTXT(ArrayList<App> lista, String idfichero, String carpeta) {
        crearDirectorios(carpeta);
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(carpeta + "/" + idfichero))) {

            for (App a : lista) {

                flujo.write(a.toString());
                flujo.newLine();
            }

            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /*Guarda los datos de todas las App de la lista, en un fichero XML llamado aplicacionesxml.xml, dentro del directorio “./appsxml”.*/
    public static void guardarXML(ArrayList<App> lista, String idfichero, String carpeta) throws PropertyException, JAXBException {
        crearDirectorios(carpeta);

        // Se preparan los objetos a utilizar, en esta caso un catálogo
        Apps apps = new Apps();
        apps.setLista(lista);

        // Crea el contexto JAXB. Se encarga de definir los objetos 
        // que vamos a guardar. En nuestro caso sólo el tipo CatalogoMuebles
        JAXBContext contexto = JAXBContext.newInstance(Apps.class);

        // El contexto JAXB permite crear un objeto Marshaller, que sirve para
        // generar la estructura del fichero XML 
        // El proceso de pasar objetos Java (CatalogoMuebles) a ficheros XML 
        // se conoce como "marshalling" o "serialización"
        Marshaller serializador = contexto.createMarshaller();

        // Especificamos que la propiedad del formato de salida
        // del serializador sea true, lo que implica que el formato se 
        // realiza con indentación y saltos de línea
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Llamando al método de serialización marshal (sobrecargado) se pueden
        // serializar objetos java en formato XML y volcarlos donde necesitemos:
        // consola, ficheros. El proceso consiste en que el contexto es el 
        // encargo de leer los objetos java, pasarlos al serializador y éste 
        // crear la salida de serialización
        // Serialización y salida por consola
//        serializador.marshal(apps, System.out);
        // Volcado al fichero xml
        serializador.marshal(apps, new File(carpeta + "/" + idfichero));
    }

    /*Guarda los datos de todas las App de la lista, en un fichero JSON llamado aplicacionesjson.json, dentro del directorio “./appsjson”.*/
    public static void guardarJSON(ArrayList<App> lista, String idfichero, String carpeta) throws IOException {
        crearDirectorios(carpeta);
        ObjectMapper mapeador = new ObjectMapper();

        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        mapeador.writeValue(new File(carpeta + "/" + idfichero), lista);
    }

    /*En una carpeta “./aplicaciones” crea un archivo de texto por cada aplicación que haya en la lista. El archivo se llamará igual que 
    la app y contendrá los datos de la aplicación, separando los campos por el carácter (;).*/
    public static void guardarAppsSeparadas(ArrayList<App> lista, String carpeta) {
        crearDirectorios(carpeta);

        for (App a : lista) {
            try (BufferedWriter flujo = new BufferedWriter(new FileWriter(carpeta + "/" + a.getNombre() + ".txt"))) {
                flujo.write(a.toString());
                flujo.flush();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
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
}
