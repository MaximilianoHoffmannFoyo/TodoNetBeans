package relacionEjercicios;

import act11.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Act12 {
    public static void main(String[] args) throws JAXBException, 
            FileNotFoundException {

        // Crea el contexto JAXB 
        JAXBContext contexto = JAXBContext.newInstance(Apps.class);
        // Crea el objeto Unmarshaller
        Unmarshaller um = contexto.createUnmarshaller();

        // Llama al método de unmarshalling
        Apps catalogo = (Apps) um.unmarshal(new File("./appsxml/aplicacionesxml.xml"));

        ArrayList<App> listaMuebles = catalogo.getListaMuebles();

        listaMuebles.forEach(System.out::println);
    }
}
