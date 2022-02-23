package ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        //Declaraciones e inicialisaciones
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int opcionMenu = 0;
        boolean pararMenu = true;
        boolean pararProgrma = true;
        final int SALIR = 3;
        final int DADOS = 2;
        String deseaSalir;

        do {
            do {
                try {
                    //menu de opciones
                    System.out.println("---Menú---");
                    System.out.println("1) Cuenta atrás");
                    System.out.println("2) Juego de dados");
                    System.out.println("3) Salir");
                    System.out.println("\nIntroduce el número de la \n"
                            + "opción del menú que quieras: ");

                    opcionMenu = teclado.nextInt();
                    pararMenu = false;
                } catch (InputMismatchException ime) {
                    System.out.println("No introduzcas texto, solo los numeros del menú\n");
                    //Se limpi la variable por que se introdujo string
                    teclado.nextLine();
                }
            } while (pararMenu);
            if (opcionMenu == SALIR) {
                System.out.println("¿Desea salir?");
                teclado.nextLine();
                deseaSalir = teclado.nextLine();
                switch (deseaSalir) {
                    case "si":
                    case "Si":
                    case "sI":
                    case "SI":
                        pararProgrma = false;
                }
            }
            if (opcionMenu == DADOS) {
                int jugadores = 20;
                int contadorJugador = 0;
                int moneda;
                int dado;
                do {
                    contadorJugador++;
                    System.out.println("-----Turno del jugador: " + contadorJugador);
                    moneda = aleatorio.nextInt(2);
                    if (moneda == 0) {
                        System.out.println("Salio cruz, lo siento.");
                    } else {
                        System.out.println("Salio cara, tiras el dado.");
                        dado = aleatorio.nextInt(6) + 1;
                        System.out.println("El dado salio: " + dado);
                        switch (dado) {
                            case 1:
                            case 3:
                                System.out.println("Has ganado: "
                                        + "Un viaje a la charca de la Nutria");
                                break;
                            case 2:
                            case 6:
                                System.out.println("Has ganado: "
                                        + "Un viaje a el parque de los Pedregales");
                                break;
                            case 4:
                            case 5:
                                System.out.println("Has ganado: "
                                        + "Un viaje a los dólmenes de Corominas");
                                break;
                        }
                    }
                } while (contadorJugador != jugadores);
                pararProgrma = false;
            }
        } while (pararProgrma);
    }

}
