
package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
public class Act7 {
    //Un productor de leche lleva el registro de lo que produce en litros, 
    //pero cuando entrega la leche en la distribuidora le pagan según 
    //los galones entregados (1 galón son 3,78 litros). 
    //Escribe un programa que ayude al productor a saber cuánto recibirá 
    //por la entrega de su producción de un día, sabiendo que el precio del galón es 1.20€.

    public static void main(String[] args) {
        //Declaracion de las constantes
        //Valor del Litro en Galones
        final double CAMBIO = 0.264172;
        //Valor del Galon en Euros
        final double PRECIO = 1.20;
        
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        //Pedimos los litros que ha producido
        System.out.println("¿Cuántos litros vas a entregar?");
        double litros = entradaTeclado.nextDouble();
        //Calculamos cuantos galones son los litros introducidos
        double galones = litros * CAMBIO;
        //Calculamos cuanto dinero ha ganado
        double pago = galones * PRECIO;
        //Mostramos las ganancias del productor de leche
        System.out.println("Has cobrado: "+pago+"€");
    }
    
}
