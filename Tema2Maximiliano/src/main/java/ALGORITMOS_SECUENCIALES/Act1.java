package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
public class Act1 {
    //Algoritmo que lea una cantidad de euros y los pase a rupias indias.

    public static void main(String[] args) {
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        //Preguntamos los euros a convertir y l aopcion de ponerlos
        System.out.println("¿Cuantos euros quieres pasar a rupias indias?");
        double euros = entradaTeclado.nextDouble();
        //Pasamos los euros a rupias indias
        final double CAMBIO = 86.6745;
        double rupias;
        rupias = euros * CAMBIO;
        //Mostramos el resultado
        System.out.println(euros+" euros son "+rupias+" rupias indias");
        
    }
    
}
