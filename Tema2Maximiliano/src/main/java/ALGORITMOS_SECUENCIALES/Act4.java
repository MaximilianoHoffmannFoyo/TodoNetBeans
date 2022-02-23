package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
public class Act4 {
    //Realiza un programa que lea una cantidad de gramos y obtenga su equivalencia en libras.

    public static void main(String[] args) {
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        //Pedimos los gramos a convertir
        System.out.println("Inserta el numero de gramos a convertir:");
        double gramos = entradaTeclado.nextDouble();
        //Convertimos los gramos a libras
        final double CAMBIO = 0.00220462;
        double libras = gramos * CAMBIO;
        //Mostramos las libras convertidas de los gramos
        System.out.println(gramos+" gramos son: "+libras+" libras");
    }
}
