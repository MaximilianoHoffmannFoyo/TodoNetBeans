package act11;

import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;

public class Prueba {

    public static void main(String[] args) throws JAXBException, IOException {
        
        /*Crea 50 aplicaciones usando el constructor por defecto, guárdalas en una lista y muéstralas por pantalla.*/
        ArrayList<App> lista = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            lista.add(new App());
            System.out.println(lista.get(i));
        }
        /*Guarda los datos de todas las App de la lista, en un fichero de texto llamado aplicacionestxt.txt, dentro del directorio “./appstxt”.*/
        Metodos.guardarTXT(lista, "aplicacionestxt.txt", "./appstxt");
        /*Guarda los datos de todas las App de la lista, en un fichero XML llamado aplicacionesxml.xml, dentro del directorio “./appsxml”.*/
        Metodos.guardarXML(lista, "aplicacionesxml.xml", "./appsxml");
        /*Guarda los datos de todas las App de la lista, en un fichero JSON llamado aplicacionesjson.json, dentro del directorio “./appsjson”.*/
        Metodos.guardarJSON(lista, "aplicacionesjson.json", "./appsjson");
        /*Crea una carpeta “./copias” y realiza una copia de los ficheros anteriores dentro de ella.*/
        Metodos.crearDirectorios("./copiasAct11");
        Metodos.copiarFicheros("./appstxt/aplicacionestxt.txt", "./copiasAct11/aplicacionestxt.txt");
        Metodos.copiarFicheros("./appsxml/aplicacionesxml.xml", "./copiasAct11/aplicacionesxml.xml");
        Metodos.copiarFicheros("./appsjson/aplicacionesjson.json", "./copiasAct11/aplicacionesjson.json");
        /*En una carpeta “./aplicaciones” crea un archivo de texto por cada aplicación que haya en la lista. El archivo se llamará igual que 
        la app y contendrá los datos de la aplicación, separando los campos por el carácter (;).*/
        Metodos.guardarAppsSeparadas(lista, "./aplicaciones");
    }
    
}
