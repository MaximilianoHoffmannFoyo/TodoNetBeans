
package com.mycompany.tema2maximiliano;

public class Ej09 {
    //9.- Crea una nueva clase llamada Ej09, que contenga una llamada al método public static void main(String[] args). 
    //La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente:
    //a.- Declara e inicializa dos variables int (a=10,  b=20).
    //b.- Declara cuatro variables booleanas.
    //c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
    //d.- Muestra en pantalla el resultado de las operaciones, usando las variables booleanas.

    public static void main(String[] args) {
        //Declaramos e inicializamos las variables a y b
        int a = 10, b = 20;
        //Declaramos 4 variables booleanas
        boolean aMenorB,aMayorB,aIgualB,aDiferenteB;
        //Guardamos en las anteriores variables booleanas, las operaciones: a<b, a>b, a==b, a!=b
        aMenorB = a<b;
        aMayorB = a>b;
        aIgualB = a==b;
        aDiferenteB = a!=b;
        //mostramos los resultados de las operaciones usando las variables booleanas
        System.out.println("a<b = "+aMenorB+", a>b = "+aMayorB+", a==b = "+aIgualB+", a!=b = "+aDiferenteB);
    }
    
}