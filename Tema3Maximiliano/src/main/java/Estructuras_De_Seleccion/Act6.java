package Estructuras_De_Seleccion;

import java.util.Scanner;

public class Act6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double valorNecesario;
        double valorNecesario2;
 
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
        
        System.out.println("Elija una opción: ");
        opcion = entrada.nextInt();
 
        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Ingrese cuanto mide el lado del cuadrado: ");
            valorNecesario = entrada.nextInt();
            
            double areacuadrado = Math.pow(valorNecesario, 2);
            
            System.out.println("El cuadrado tiene un area de: "+areacuadrado);
        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Ingrese cuanto mide la base del triángulo: ");
                valorNecesario = entrada.nextDouble();
                System.out.println("Y la altura del triángulo tambien: ");
                valorNecesario2 = entrada.nextDouble();
                
                double areatriangulo = (valorNecesario*valorNecesario2)/2;
                
                System.out.println("El triángulo tiene un area de: "+areatriangulo);;
        } else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular el área de un círculo...");
                    System.out.println("Ingrese cuanto mide el radio del circulo: ");
                    valorNecesario = entrada.nextDouble();
                    
                    double areacirculo = Math.PI*Math.pow(valorNecesario, 2);
                    
                    System.out.println("El circulo tiene un area de: "+areacirculo);;
        } else {
            System.out.println("Ha seleccionado terminar");
               }     
           }
       }