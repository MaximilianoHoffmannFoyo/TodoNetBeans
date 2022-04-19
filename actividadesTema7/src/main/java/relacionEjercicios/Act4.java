package relacionEjercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import vehiculo.*;

public class Act4 {

    /* Usando la clase Vehículo, implementa un programa que realice lo siguiente:
Crea 30 vehículos (10 Turismos, 10 Deportivos y 10 Furgonetas) con valores de tu elección y guárdalos en una lista de objetos tipo Vehiculo.
Guarda los vehículos en un fichero de texto llamado “vehículos.txt”, haciendo uso del método polimórfico toString(), teniendo en cuenta que 
    el string devuelto lleve separados los campos del objeto por el carácter dos puntos (:).
Cada línea del fichero estará compuesta por un número, un espacio, un guión, un espacio y los datos del vehículo en cuestión. El número de 
    cada línea será 0, 1 o 2 si el objeto es un Turismo, un Deportivo o una Furgoneta, respectivamente. 
Cada vehículo irá en una línea distinta del fichero.
Ejemplos de líneas, los campos no tienen porqué coincidir con los de tus clases:
 
0 – 4534JTK:Seat:Ibiza:Blanco:… (Este vehículo sería un Turismo)
1 – 3322FFF:Ford:Kuga:Rojo:… (Este vehículo sería un Deportivo)
     */
    public static void main(String[] args) {

        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "vehiculosAct4.txt";
        int i = -1;
        
        Turismo T1 = new Turismo(4,false, "6574nb", "totota", "F3", "gris", 4.3);
        Turismo T2 = new Turismo(4,false, "4h567", "pecari", "R3", "rojo", 4.3);
        Turismo T3 = new Turismo(4,false, "4h6h675", "totota", "4G", "azul", 4.3);
        Turismo T4 = new Turismo(4,false, "4h657765", "totota", "7L", "naranja", 4.3);
        Turismo T5 = new Turismo(4,false, "46h577", "yamata", "J4", "gris claro", 4.3);
        Turismo T6 = new Turismo(4,false, "6h74567", "pecari", "F5", "celeste", 4.3);
        Turismo T7 = new Turismo(4,false, "h7465", "totota", "F3", "rosa", 4.3);
        Turismo T8 = new Turismo(4,false, "n6e57", "yamata", "F7", "negro", 4.3);
        Turismo T9 = new Turismo(4,false, "645n74", "pecari", "F12", "morado", 4.3);
        Turismo T10 = new Turismo(4,false, "v5364", "yamata", "00", "magenta", 4.3);
        Deportivo D1 = new Deportivo(3, true,  true, "6654yyy", "Panda", "Alt", "gris", 4.3 );
        Deportivo D2 = new Deportivo(3, true,  true, "1234jhi", "Pande", "Alt", "gris", 4.3 );
        Deportivo D3 = new Deportivo(3, true,  true, "3452gft", "Pandi", "Alt", "gris", 4.3 );
        Deportivo D4 = new Deportivo(3, true,  true, "1234wrt", "Pando", "Alt", "gris", 4.3 );
        Deportivo D5 = new Deportivo(3, true,  true, "7636eee", "Pandu", "Alt", "gris", 4.3 );
        Deportivo D6 = new Deportivo(3, true,  true, "8888rrr", "Pandas", "Alt", "gris", 4.3 );
        Deportivo D8 = new Deportivo(3, true,  true, "9087uyt", "Pandack", "Alt", "gris", 4.3 );
        Deportivo D7 = new Deportivo(3, true,  true, "3214bgf", "Pandfac", "Alt", "gris", 4.3 );
        Deportivo D9 = new Deportivo(3, true,  true, "1324sdd", "Pandag", "Alt", "gris", 4.3 );
        Deportivo D10 = new Deportivo(3, true,  true, "0243ljd", "Pandita", "Alt", "gris", 4.3 );
        Furgoneta F1 = new Furgoneta(5, false, "Grande");
        Furgoneta F2 = new Furgoneta(3, false, "Estandar");
        Furgoneta F3 = new Furgoneta(5, false, "Grande");
        Furgoneta F4 = new Furgoneta(3, false, "Estandar");
        Furgoneta F5 = new Furgoneta(3, false, "Grande");
        Furgoneta F6 = new Furgoneta(5, false, "Grande");
        Furgoneta F7 = new Furgoneta(5, false, "Estandar");
        Furgoneta F8 = new Furgoneta(2, false, "Pequeño");
        Furgoneta F9 = new Furgoneta(5, false, "Grande");
        Furgoneta F10 = new Furgoneta(7, false, "Enorme");
        
        ArrayList<Vehiculo> lista = new ArrayList<>();
        lista.add(T1);lista.add(T2);lista.add(T3);lista.add(T4);lista.add(T5);lista.add(T6);lista.add(T7);lista.add(T8);lista.add(T9);lista.add(T10);
        lista.add(D1);lista.add(D2);lista.add(D3);lista.add(D4);lista.add(D5);lista.add(D6);lista.add(D7);lista.add(D8);lista.add(D9);lista.add(D10);
        lista.add(F1);lista.add(F2);lista.add(F3);lista.add(F4);lista.add(F5);lista.add(F6);lista.add(F7);lista.add(F8);lista.add(F9);lista.add(F10);
        
        
        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            
            for (Vehiculo v : lista) {
                i++;
                
                // Usamos metodo write() para escribir en el buffer
                flujo.write(i+" – " + v.toString());
                
                // Metodo newLine() añade línea en blanco
                flujo.newLine();
            }

            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            
            
            
            
            
            
            
            // Usamos metodo write() para escribir en el buffer
            flujo.write("\t");

            // Metodo newLine() añade línea en blanco
            flujo.newLine();

            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
