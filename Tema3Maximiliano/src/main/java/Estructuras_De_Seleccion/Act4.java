package Estructuras_De_Seleccion;

import java.util.Scanner;

public class Act4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.println("escanear edad: ");

                int edad = scanner.nextInt();

                String resultado = (edad >= 18) ? 
                        "Es mayor de edad" : "No es mayor de edad" ;
                System.out.println(resultado);
                
                System.out.print("mostrar la edad: ");
                System.out.println(edad);

    }
    
}
