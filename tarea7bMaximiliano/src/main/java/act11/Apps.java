package act11;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Apps {

    // XmLElementWrapper define un contenedor para la lista 
    @XmlElementWrapper(name = "apps")

    // XmlElement establece el nombre de los elementos
    // Cada elemento de la lista llevará esta etiqueta en el fichero xml
    @XmlElement(name = "app")
    private ArrayList<App> lista;

    public ArrayList<App> getLista() {
        return lista;
    }

    public void setLista(ArrayList<App> lista) {
        this.lista = lista;
    }


}