
package traductor;

import java.util.HashMap;
import java.util.Map;

/*
Aplica lo estudiado realizando un "Traductor" de idiomas, incluyendo un nuevo 
paquete llamado "traductor". Para ello, el traductor se crea usando dos objetos
de tipo String, de forma que la clave es una palabra inglesa y el valor es la 
traducción española. En realidad se puede usar para cualesquiera dos idiomas, 
aunque nosotros lo haremos entre inglés y castellano. Es indispensable que las 
palabras en inglés estén ordenadas alfabéticamente.

Inicialmente el traductor se crea vacío, sin registros. Existirá un método que 
servirá para guardar una entrada y recibirá dos palabras (palabraIngles, palabraEspañol) 
para ir guardando traducciones. Se deben poder borrar entradas y modificar entradas 
ya creadas, así como realizar la traducción de una palabra inglesa dada. También 
debe haber dos métodos: una para crear una lista con las palabras en inglés que 
hay en el traductor y otro para obtener las palabras en español.
 */
public class Traductor {
    
    private Map<String, String> traductor;

    public Traductor() {
        this.traductor = new HashMap<>();
    }
    
    public void guardarEntrada(String palabraIngles,String palabraEspañol){
        traductor.put(palabraIngles, palabraEspañol);
    }
    public void borrarEntrada(String palabraIngles,String palabraEspañol){
        traductor.remove(palabraIngles, palabraEspañol);
    }
    public void modificarEntrada(String palabraIngles ,String palabraEspañolAntigua ,String palabraEspañolNueva){
        traductor.replace(palabraIngles, palabraEspañolAntigua, palabraEspañolNueva);
    }
    
    public void mostrarContenido(){
        for (String key : traductor.keySet()) {
            System.out.printf("%s -- %s %n", key, traductor.get(key));
        }
    }
    public void mostrarPalabrasEspañol(){
        for (String key : traductor.keySet()) {
            System.out.println(traductor.get(key));
        }
    }
    public void mostrarPalabrasIngles(){
        for (String key : traductor.keySet()) {
            System.out.println(key);
        }
    }
    
}
