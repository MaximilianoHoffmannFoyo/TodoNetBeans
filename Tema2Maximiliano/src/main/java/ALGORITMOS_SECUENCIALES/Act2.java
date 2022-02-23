package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
public class Act2 {
    //Algoritmo que lea el valor del radio y calcule el área del círculo.

    public static void main(String[] args) {
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        //Preguntamos el radio del circulo
        System.out.println("¿Cual es el radio del circulo?");
        double radio = entradaTeclado.nextDouble();
        //Calculamos el area del circulo
        double area;
        double radio2;
        radio2 = radio*radio;
        //Maht.pow devuelve un valor double por lo que 
        //los parametros tienen que ser double tambien
        area = Math.PI * Math.pow(radio, 2);
        //Mostramos el area del circulo
        System.out.println("El área del circulo es: "+ area);
        Math.pow(radio, 2);
    }
    
}
