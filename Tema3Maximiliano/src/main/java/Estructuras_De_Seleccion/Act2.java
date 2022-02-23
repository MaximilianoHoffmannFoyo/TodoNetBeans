package Estructuras_De_Seleccion;

import java.util.Scanner;

public class Act2 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        //a)
        System.out.println("Introduce el número: ");
        int x = dato.nextInt();
        String a = (x >= 135) ? "mayor" : "menor";
            System.out.println(a);
        
        //b)
        System.out.println("Introduce nuevo número: ");
        x = dato.nextInt();
        String b = (x <= 0) ? "Menor que cero" : "Mayor que cero";
            System.out.println(b);
            
        //c)
        System.out.println("Introduce nuevo número: ");
        x = dato.nextInt();
        int c = (x < 0) ? x + -(x*2) : x ;
            System.out.println(c);
    }
    
}
