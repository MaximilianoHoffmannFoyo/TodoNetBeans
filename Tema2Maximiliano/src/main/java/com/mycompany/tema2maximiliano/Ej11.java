
package com.mycompany.tema2maximiliano;

public class Ej11 {
    /*11.- Crea una nueva clase llamada Ej11, modifica el siguiente 
            programa para hacer que compile y funcione:
    public static void main(String [] args) 
    { 
        int n1 = 10, n2=30, suma=0, n3; 
        suma=n1+n2; 
        System.out.println(“LA SUMA ES: “ + suma); 
        suma=suma+n3; 
        System.out.println(suma); 
    } 
*/
    public static void main(String[] args) {
        int n1 = 10, n2 = 30, suma, n3 = 20; 
        suma=n1+n2; 
        System.out.println("LA SUMA ES: " + suma); 
        suma += n3; 
        System.out.println(suma);
    }
    
}
