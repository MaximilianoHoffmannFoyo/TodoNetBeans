
package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
public class Act8 {
    //Programa que pida el precio de un artículo y calcule su valor aplicando un 16% de IVA. 
    //Realiza un programa para calcular el valor de cualquier artículo aplicando cualquier IVA.
    
    public static void main(String[] args) {
        //Declaracion de las constantes
        //Ponemos el iva dividido entre 100 listo para aplicarlo sobre el precio
        final double IVAC = 0.16;
        
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        //Pedimos el precio de un articulo 
        System.out.println("Dime el precio del articulo al que aplicar el 16% de IVA");
        double precio1 = entradaTeclado.nextDouble();
        //Calculamos el 16% del precio que es el IVA y se lo aplicamos al precio
        precio1 += precio1*IVAC;
        //Mostramos el resultado
        System.out.println("El precio final del producto es: "+precio1+"€");
        
        //Pedimos el precio de un articulo 
        System.out.println("Dime el precio del articulo al que aplicar el IVA");
        double precio2 = entradaTeclado.nextDouble();
        //Pedimos el IVA y lo dividimos entre 100 listo para aplicarlo sobre el precio
        System.out.println("Dime el IVA que aplicar");
        double ivaV = entradaTeclado.nextDouble();
        ivaV/=100;
        //Le aplicamos el IVA al precio
        precio2 += precio2*ivaV;
        //Mostramos el resultado
        System.out.println("El precio final del producto es: "+precio2+"€");
    }
    
}
