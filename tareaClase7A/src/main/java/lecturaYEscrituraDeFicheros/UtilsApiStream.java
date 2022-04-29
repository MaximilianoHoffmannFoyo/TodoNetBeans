package lecturaYEscrituraDeFicheros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
public class UtilsApiStream {

    public static boolean estaEmpleadoNombre(String nombre, ArrayList<Empleado> lista) {
        return lista.stream()
                .anyMatch(e -> e.getNombre().equalsIgnoreCase(nombre));
    }

    public static long numeroEmpleadosCordinadores(String departamento, ArrayList<Empleado> lista) {
        return lista.stream()
                .filter(e -> e.getPuesto().equals(departamento) && e.getCoordinador().equalsIgnoreCase("Sí"))
                .count();
    }

    public static List<String> optenerListaConLetraDNI(char letraDNI, ArrayList<Empleado> lista) {
        return lista.stream() 
                .filter((e) -> e.getDni().contains(letraDNI + ""))
                .map((e) -> e.getNombre())
                .sorted((v1, v2) -> v1.compareTo(v2))
                .collect(Collectors.toList());
         
    }

    public static List<String> optenerListaDNIConFechaDeToma(LocalDate fecha, ArrayList<Empleado> lista) {
        return lista.stream() 
                .filter((e) -> e.getFechaDeToma().equals(fecha))
                .map((e) -> e.getDni())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
/*A partir de una lista de empleados y una fecha, obtener una nueva 
lista con los NIF (ordenados de forma inversa) de todos los empleados 
cuya toma de posesión coincida con esa fecha.
 */
