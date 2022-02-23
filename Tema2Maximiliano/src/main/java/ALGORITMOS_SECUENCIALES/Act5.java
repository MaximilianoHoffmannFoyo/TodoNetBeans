package ALGORITMOS_SECUENCIALES;
//importamos la clase Scanner para poder usarla
import java.util.Scanner;
public class Act5 {
    //Una empresa de autocares cobra 150 euros fijos por servicio y además 15.3 céntimos por Km recorrido. 
    //Elabora un programa que lea el número de km a recorrer y proporcione el presupuesto.

    public static void main(String[] args) {
        //Declaramos e nicializamos las constantes 
        //el precio fijo y el varible según los kilometros
        final double PRECIOF = 150;
        final double PRECIOV = 0.153;
        
        //Declaramos una instancia de la clase Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        //Pedir el numero de Kilometros a recorrer
        System.out.println("¿Cuantos kilometros vas a recorrer?");
        double km = entradaTeclado.nextDouble();
        //Elaborar el presupuesto multiplicando los Km por su valor y sumando el precio fijo
        double presupuesto = (km*PRECIOV)+PRECIOF;
        //Mostrar el presupuesto en €
        System.out.println("El presupuesto del viaje es de: "+presupuesto+"€");
        
    }
}
