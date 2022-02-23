package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
public class Act3 {
    //Algoritmo que lea tres notas numéricas de tipo double y calcule la nota media.

    public static void main(String[] args) {
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        //Pedimos las 3 notas double
        System.out.println("Escribe la primera nota: ");
        double nota1 = entradaTeclado.nextDouble();
        System.out.println("Escribe la segunda nota: ");
        double nota2 = entradaTeclado.nextDouble();
        System.out.println("Escribe la tercera y ultima nota: ");
        double nota3 = entradaTeclado.nextDouble();
        //Calculamos la nota media
        double media = (nota1+nota2+nota3)/3;
        //Mostramos la nota media 
        System.out.println("La nota media es: "+media);
        
    }
}
