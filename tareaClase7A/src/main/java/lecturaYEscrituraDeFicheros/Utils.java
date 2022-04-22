package lecturaYEscrituraDeFicheros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*    
    A partir de una lista de empleados y un nombre, indique si hay algún 
empleado con ese nombre.
    A partir de una lista de empleados y un nombre de departamento, 
indique el número de empleados Coordinadores de ese departamento.
    A partir de una lista de empleados y una letra del NIF (char), 
obtener una nueva lista ordenada alfabéticamente SOLO con los apellidos 
de los empleados cuyo NIF contenga esa letra.
    A partir de una lista de empleados y una fecha, obtener una nueva 
lista con los NIF (ordenados de forma inversa) de todos los empleados 
cuya toma de posesión coincida con esa fecha.
 */
public class Utils {

    public static boolean estaEmpleadoNombre(String nombre, ArrayList<Empleado> lista) {
        for (Empleado empleado : lista) {
            if (empleado.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static int numeroEmpleadosCordinadores(String departamento, ArrayList<Empleado> lista) {
        int contador = 0;
        for (Empleado empleado : lista) {
            if (empleado.getPuesto().equals(departamento)) {
                if (empleado.isCoordinador().equals("Sí")) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static ArrayList<String> optenerListaConLetraDNI(char letraDNI, ArrayList<Empleado> lista) {
        ArrayList<String> nuevaLista = new ArrayList<>();
        for (Empleado empleado : lista) {
            if (empleado.getDni().contains(letraDNI + "")) {
                nuevaLista.add(empleado.getNombre());
            }
        }
        Collections.sort(nuevaLista, (String e1, String e2) -> e1.compareTo(e2));
        return nuevaLista;
    }

    public static ArrayList<String> optenerListaDNIConFechaDeToma(LocalDate fecha, ArrayList<Empleado> lista) {
        ArrayList<String> nuevaLista = new ArrayList<>();
        for (Empleado empleado : lista) {
            if (empleado.getFechaDeToma().equals(fecha)) {
                nuevaLista.add(empleado.getDni());
            }
        }
        Collections.sort(nuevaLista, Collections.reverseOrder((String e1, String e2) -> e1.compareTo(e2)));
        return nuevaLista;
    }
}
