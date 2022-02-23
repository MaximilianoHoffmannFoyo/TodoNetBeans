
package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Act10 {
    //Realiza un programa que calcule el espacio recorrido, en metros, 
    //por un cuerpo que se deplaza a 200 km/h si está en movimiento 20 minutos. 
    //Realiza otro programa para calcular el espacio recorrido del cuerpo en 
    //función de su velocidad y tiempo de movimiento.

    public static void main(String[] args) {
        //Declaramos las constantes
        final double VELOCIDADKILOMETROSHORA = 200;// En kilometros
        final double MOVIMIENTOMINUTOS = 20;// Minutos
        final double KILOMETROSAMETROS = 1000;
        
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        
        //Calculamos el espacio recorrido con los datos constantes
        //El resultado saldra en metros
        double movimientohora = MOVIMIENTOMINUTOS/60;
        double espacioRecorridoKM = VELOCIDADKILOMETROSHORA*movimientohora;
        double espacioRecorridoM = espacioRecorridoKM*KILOMETROSAMETROS;
        //Mostrar el resultado en metros
        System.out.printf("El espacio que recorre un cuerpo que se desplaza a 200Km/h "
                + "estando en movimiento 20 minutos es de: %2f metros %n",espacioRecorridoM);
        
        //Pedimos los nuevos datos al usuario
        System.out.println("Ingresa la velocidad en Km/h:");
        double velocidadkilometrosHora2 = entradaTeclado.nextDouble();
        System.out.println("Ingresa el tiempo en movimiento en minutos:");
        double movimientoMinutos2 = entradaTeclado.nextDouble();
        //Calculamos el espacio recorrido con los datos del usuario
        //El resultado saldra en metros
        double movimientohora2 = movimientoMinutos2/60;
        double espacioRecorridoKM2 = velocidadkilometrosHora2*movimientohora2;
        double espacioRecorridoM2 = espacioRecorridoKM2*KILOMETROSAMETROS;
        //Mostrar el resultado en metros
        System.out.println("El espacio que recorre un cuerpo que se desplaza a "+velocidadkilometrosHora2+" "
                + "kilometro, estando en movimiento "+movimientoMinutos2+" minutos es de: "+espacioRecorridoM2+" metros");
    
/*
        String texto = JOptionPane.showInputDialog (null,"Introduce los kiliometroshora");
        System.out.println(texto);
        
        double kilometrosHora = Double.parseDouble(texto);
        System.out.println(kilometrosHora);
    
        texto = JOptionPane.showInputDialog (null,"Introduce los minutos");
        System.out.println(texto);
        
        double minutos = Double.parseDouble(texto);
        System.out.println(minutos);
        
        double hora = minutos/60;
        double Kilometros = kilometrosHora*hora;
        double metros = Kilometros*1000;
        
        JOptionPane.showMessageDialog(null, "El resultado es "+metros+" metros");
        //System.out.printf("El resultado es %.2f metros",metros);
*/
    }
}
