package relacionEjercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*2.- Implementa un programa que vaya escribiendo líneas de texto en un archivo. 
El archivo se llamará “teclado.txt” y se creará en la raíz del proyecto. El programa 
irá solicitando líneas de texto al usuario (cada línea termina con un salto de 
línea , ‘\n’) y las irá escribiendo en el fichero. Cuando en una nueva línea el 
usuario introduzca el texto “EOF”, el programa terminará y esa línea no se escribirá 
en el fichero. Controla las posibles excepciones que pudieran ocurrir.
 */
public class Act2 {

    public static void main(String[] args) {

        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "tecladoAct2.txt";
        final String EOF = "EOF";

        // Recoger el el tamaño de la matriz por teclado
        Scanner entradaTeclado = new Scanner(System.in);

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            String textoEntrada = "";
            do {
                textoEntrada = entradaTeclado.nextLine();
                if(!textoEntrada.contains(EOF)){
//                if(!textoEntrada.equals(EOF)){
                    // Usamos metodo write() para escribir en el buffer
                    flujo.write(textoEntrada + "\n");

                    // Metodo flush() guarda cambios en disco 
                    flujo.flush();
                }
            } while (!textoEntrada.contains(EOF));
//            } while (!textoEntrada.equals(EOF));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
