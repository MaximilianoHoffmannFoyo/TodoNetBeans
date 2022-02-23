package com.mycompany.proyectoejemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Borrador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean parar = true;
        int num1=0;
        do{
            try {
                System.out.println("Introduce un numero entero");
                num1 = sc.nextInt();
                parar = false;  
            } catch (InputMismatchException ime) {
                System.out.println("No introduzcas texto, solo numeros enteros");
                sc.nextLine();
            }
        } while(parar);
        
    }
    
}
