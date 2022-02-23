
package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
public class Act6 {
    //Leer dos números por teclado, a y b. 
    //Imprimir por pantalla el resultado de las siguientes operaciones:
        //a/b
        //a mod b (operación módulo o residuo) 

    public static void main(String[] args) {
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        //pedimos por teclado los 2 numeros (a y b)
        System.out.println("Ingresa el número a:");
        int a = entradaTeclado.nextInt();
        System.out.println("Ingresa el número a:");
        int b = entradaTeclado.nextInt();
        //Hacemos las operaciones pertinentes
        int op1 = a/b;
        int op2 = a % b;
        //Mostramos el resultado de las operaciones
        System.out.println("El resultado de a/b es: "+op1);
        System.out.println("El resultado de a mod b es: "+op2);
    }
    
}
