
package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
public class Act9 {
    //Una empresa de juguetes se dedica a realizar cometas como las que figuran 
    //en la imagen de la derecha. Necesitan saber el área de tela a emplear según 
    //las medidas de las diagonales que hay entre los puntos A y C, y entre B y D.

    public static void main(String[] args) {
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        //Pedimos la medida de las diagonales 
        System.out.println("¿Cuánto hay entre los puntos A y C?");
        double diagonalAC = entradaTeclado.nextDouble();
        System.out.println("¿Y entre los B y D?");
        double diagonalBD = entradaTeclado.nextDouble();
        //Calculamos el area 
        double area = (diagonalAC*diagonalBD)/2;
        //Mostramos el resultado
        System.out.printf("El área de la cometa es de: %.2f ",area);
    }
    
}
