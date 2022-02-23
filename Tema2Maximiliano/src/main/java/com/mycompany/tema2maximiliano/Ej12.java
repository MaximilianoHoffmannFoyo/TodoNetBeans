
package com.mycompany.tema2maximiliano;

public class Ej12 {
    /*12.- Crea una nueva clase llamada Ej12, modifica el siguiente programa 
            para que compile y funcione. ¿Cuál es el error?
public static void main(String [] args) 
{ 
    int n1=50,n2=30, 
    boolean suma=0; 
    suma=n1+n2; 
    System.out.println(“LA SUMA ES: “ + suma); 
}
Los erroes son que habia una , en vez de un ; al final de la primera linea
    que la variable suma estaba declarada como boolean en vez de int
*/
    public static void main(String[] args) {
        int n1 = 50,n2 = 30, 
        suma = 0; 
        suma = n1 + n2; 
        System.out.println("LA SUMA ES: " + suma);
    }
    
}
