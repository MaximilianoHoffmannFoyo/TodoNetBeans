package relacionEjercicios;

/*      Maximiliano Hoffmann Foyo
1.- Implementa un programa que genere un fichero de texto en la carpeta raíz del 
proyecto, llamado “matriz.txt”, donde se escriba la siguiente tabla de valores 
numéricos. Utiliza el tabulador para ir separando cada número y el salto de 
línea para añadir nuevas líneas. Ten en cuenta que el programa debe ser escalable, 
de forma que se pueda generar cualquier matriz que siga el patrón.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Act1 {

    public static void rellenarMatriz(int[][] m) {
        int aux = 1;
        for (int i = 0; i < m.length; i++) {
            aux += 100;
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = aux;
                aux++;
            }
            aux -= m[i].length;
        }
    }

    public static void main(String args[]) {

        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "matrizAct1.txt";

        // Recoger el el tamaño de la matriz por teclado
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("¿De cuantas filas quieres la matriz?");
        int filas = entradaTeclado.nextInt();
        System.out.println("¿Y de cuantas columnas?");
        int columnas = entradaTeclado.nextInt();

        // Construccion de la matriz a escribir
        int[][] matriz = new int[filas][columnas];
        rellenarMatriz(matriz);

        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (int[] matriz1 : matriz) {
                for (int j = 0; j < matriz1.length; j++) {
                    // Usamos metodo write() para escribir en el buffer
                    flujo.write(matriz1[j] + "\t");
                }
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
