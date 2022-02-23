package com.mycompany.loteria;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        System.out.println("GANADOR");
        int [] boletoGanador = crearBoleto();
        mostrarBoletoString(boletoGanador);
        int [] boletoCliente = pedirBoleto();
        System.out.println("TU BOLETO");
        mostrarBoletoString(boletoCliente);
        jokerBueno(boletoGanador,boletoCliente);
        jokerMalo(boletoGanador, boletoCliente);
    }

    public static int[] crearBoleto() {
        Random aleatorio = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(10);
        }
        return array;
    }
    public static void mostrarBoletoString(int[] array) {
        String boleto = "";
        for (int i = 0; i < array.length; i++) {
            boleto += " "+array[i];
        }
        System.out.println("Boleto:"+boleto);
    }

    public static int[] pedirBoleto() {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[7];
        boolean parar = true;
        System.out.println("Introduce tu boleto");
        for (int i = 0; i < array.length; i++) {
            do {
                try {
                    System.out.println("Introduce un numero entero");
                    array[i] = teclado.nextInt();
                    parar = false;
                } catch (InputMismatchException ime) {
                    System.out.println("No introduzcas texto, solo numeros enteros");
                    teclado.nextLine();
                }
            } while (parar);
        }
        return array;
    }

    public static void jokerBueno(int[] a, int[] b) {
        if(a.equals(b)){
            System.out.println("Has ganado el premio gordo: JOKER BUENO");
        }
    }

    public static void jokerMalo(int[] a, int[] b) {
        int [] auxA = new int[7];
        auxA = a;
        int [] auxB = new int[7];
        auxB = b;
        Arrays.sort(auxA);
        Arrays.sort(auxB);
        if(a.equals(b)){
            System.out.println("Has ganado el otro premio: JOKER MALO");
        }
    }

}
