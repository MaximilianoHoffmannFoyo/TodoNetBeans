package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        //Declaraciones e inicialisaciones
        Scanner teclado = new Scanner(System.in);
        int opcionMenu = 0;
        boolean pararMenu = true;
        boolean pararProgrma = true;
        final int SALIR = 3;
        final int CUENTAATRAS = 1;
        String deseaSalir;

        do {
            do {
                try {
                    //menu de opciones
                    System.out.println("---Menú---");
                    System.out.println("1) Cuenta atrás");
                    System.out.println("2) Juego de dados");
                    System.out.println("3) Salir");
                    System.out.println("Introduce el número de la \n"
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
            if (opcionMenu == CUENTAATRAS) {
                for (int i = 1000; i >= 100; i = i - 5) {
                    System.out.print(i + " - ");
                }
                pararProgrma = false;
            }
        } while (pararProgrma);

    }

}
