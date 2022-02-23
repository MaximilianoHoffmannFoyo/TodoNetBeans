
package Estructuras_De_Seleccion;
import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("escanear edad:");

                int edad = scanner.nextInt();

                //Para 10 saldria: "No es mayor de edad"
                //Para 18 y 67 saldria: "Es mayor de edad"
                if (edad >= 18) {
                        System.out.println("Es mayor de edad");
                } else {
                        System.out.println("No es mayor de edad");
                }

                System.out.print("mostrar la edad: ");
                System.out.println(edad);
    }
    
}
