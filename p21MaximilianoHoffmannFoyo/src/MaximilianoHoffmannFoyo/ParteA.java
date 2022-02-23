
package MaximilianoHoffmannFoyo;
import java.util.Scanner;

public class ParteA {

    public static void main(String[] args) {
        //Declaración de las Constantes
        final double HORAS_MAXIMAS_CLASE_PROFESOR_ANO = 150;
        final double HORAS_MAXIMAS_CLASE_MASTERES_ANO = 975;
        
        //Declaramos la clase Scanner
        Scanner teclado = new Scanner(System.in);
        
        //Preguntamos el número de Masteres que se van a inpartir para veriguar 
        //el numero de profesores que necesitamos
        System.out.println("¿Cuantos másteres va a inpartir la universidad?");
        double masteresTotales = teclado.nextDouble();
        
        //Calculamos el número de profesores multiplicando el total de másteres
        // por el numero de horas de cada master y despues dividiendo eso entre 
        // las horas maximas de clase de cada profesor
        double profesoresTotales = (masteresTotales*HORAS_MAXIMAS_CLASE_MASTERES_ANO)
                /HORAS_MAXIMAS_CLASE_PROFESOR_ANO;
        
        //Redondeamos el resultado de la division anterior con Math.ceil para
        // que se redonde hacia arriba
        profesoresTotales = Math.ceil(profesoresTotales);
        
        //Mostramos por pantalla el resultado con Printf para no mostrar decimales
        System.out.printf("El total de profesores necesarios es: %.0f",profesoresTotales);
    }
    
}
