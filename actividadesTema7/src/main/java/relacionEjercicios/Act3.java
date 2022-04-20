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
            int j = 0;

            for (int i = 0; i < 75; i++) {
                boolean fraseDePaso = true;
                do {
                    String letra = letras[random.nextInt(26)];

                    if (letra.equals("g")) {
                        fraseDePaso = false;
                        if (random.nextBoolean()) {
                            flujo.write(letra);
                        } else {
                            flujo.write(letra.toUpperCase());
                        }
                        flujo.newLine();
                    } else {
                        if (random.nextBoolean()) {
                            flujo.write(letra + ";");
                        } else {
                            flujo.write(letra.toUpperCase() + ";");
                        }
                    }
                    flujo.flush();
                } while (fraseDePaso);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

}
