
package com.mycompany.proyectoejemplo;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class apuntesRepaso {

    public static void main(String[] args) {
        
        //Declaracion de variables
        int var1, var2;
        double estaturaPersona;
        
        //Inicialisación de variables
        var1 = 12;
        var2 = 14;
        
        //Declaracion e inicializacion
        float pesoPersona = 67.6f;
        long millonesQueMeVaisAPagar = 23_000_000_000l;
        
        //Constantes
        final boolean SIEMPRE_SI = true;
        final double SUPLEMENTO = 123.45;
        //Al ser constante no puede cambiar su valor 
        //SIEMPRE_SI = false;
        
        //Los valores concretos de un tipo de dato son literales
        long numero1 = 23;  //int ---> long (conversion implicita)
        long numero2 = (long)23; //conversion explicita o casting explicito 
        
        
        double expresion = 12/5;
        
        //Math,ceil, floor, round
        expresion = Math.ceil(3.4); //ceil redondea hacia arriba
        System.out.println(expresion);
        expresion = Math.floor(4.9); //floor redondea hacia abajo
        System.out.println(expresion);
        expresion = Math.round(4.2); //round redondea al más cercano
        System.out.println(expresion);
        expresion = Math.round(4.8);
        System.out.println(expresion);
        expresion = Math.round(4.5);
        System.out.println(expresion);        
     
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el peso de la persona: ");
        pesoPersona = teclado.nextFloat();
        System.out.println("Introduce la estatura de la persona: ");
        estaturaPersona = teclado.nextDouble();
        //Con scanner, despues de leer numeros hay que limpiar la variable 
        teclado.nextLine();
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        
        System.out.println("peso "+ pesoPersona + " Kg y estatura " +estaturaPersona+" m");
        double indiceMasaCorporal = pesoPersona / Math.pow(estaturaPersona, 2);
        //IMC = peso (kg) / estatura (m2)
        System.out.printf("%s tu IMC es: %.2f", nombre, indiceMasaCorporal);
        
        String apellido = JOptionPane.showInputDialog("Introduce tu apellido: ");
        System.out.println(apellido);
        
        String dinerotexto = JOptionPane.showInputDialog("Introduce dinero para soborno: ");
        double dineros = Double.parseDouble(dinerotexto);
        
        System.out.println("El profesor va a recibir " + (SUPLEMENTO+dineros) + " € al año");
        JOptionPane.showMessageDialog(null, "El profesor va a recibir " + (SUPLEMENTO+dineros) + " € al año");
        
        
    }
    
}
