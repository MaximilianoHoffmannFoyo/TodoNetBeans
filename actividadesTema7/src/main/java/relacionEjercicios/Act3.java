package relacionEjercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*3.- Implementa un programa que guarde exactamente 75 líneas de texto en un fichero, 
cuyo nombre se deja a tu elección. En cada línea se irán generando letras aleatorias 
(entre la ‘a’ y la ‘Z’) y se irán separando por punto y coma (;) hasta que la letra 
que se vaya a escribir sea ‘g’ o ‘G’. En este caso, se escribe y se saltará a la línea 
siguiente. Posibles ejemplos de líneas generadas:
 
    a;C;T;B;D;s;u;i;w;g
    Q;w;e;r;t;y;S;H;J;K;G
    ….
 */
public class Act3 {

    public static void main(String[] args) {

        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random random = new Random();
        String idfichero = "letrasAct3.txt";

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (int i = 0; i < 75; i++) {
                String letraRandom = letras[random.nextInt(27)];
                
                do{
                // Usamos metodo write() para escribir en el buffer
                if (letraRandom.equals("g")) {
                    flujo.write("g");
                } else if (letraRandom.equals("G")) {
                    flujo.write("G");
                } else {
                    if (random.nextBoolean()) {
                        flujo.write(letraRandom + ";");
                    } else {
                        flujo.write(letraRandom.toUpperCase() + ";");
                    }
                }
                }while();

                // Metodo newLine() añade línea en blanco
                flujo.newLine();
                // Metodo flush() guarda cambios en disco 
                flujo.flush();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
