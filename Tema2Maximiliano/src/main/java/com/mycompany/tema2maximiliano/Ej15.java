
package com.mycompany.tema2maximiliano;
public class Ej15 {
//15.- Indica si el siguiente código funciona o no. En caso afirmativo indica 
    //qué hace, en caso negativo explica por qué no funciona.
    /*
           a.-     boolean adivina = ((97 == 'a') && true);
        System.out.println(adivina);
    b.-     int a = 'a';
        System.out.println(a);
    c.-     int pi = 3.14;
        System.out.println(pi);
    d.-    double pi = 3,14;
        System.out.println(pi);
    e.-     boolean adivina = (1==4);
        System.out.println(adivina);
        */
    public static void main(String[] args) {
        //a.-     Si funciona y devuelve true 
                boolean adivina = ((97 == 'a') && true);
        System.out.println(adivina);

    //b.-     Si funciona, dado que el carácter a tiene un valor numérico que sí
        //      se puede guardar en un int y se mostrará 97 en el println 
                int a = 'a';
        System.out.println(a);

    //c.-     No funciona porque intenta guardar un número con decimales en un
        //      int, cosa que no se puede.
                //int pi = 3.14;
        //System.out.println(pi);

    //d.-    No funciona por que esta usando una coma en lugar de un punto para
        //      poner los decimales, (en este caso tampoco funcionaria arreglando lo
        //      de la coma por que está declarando la variable pi por segunda vez)
               //double pi = 3,14;
        //System.out.println(pi);

    //e.-     Si funcionaria y daria False dado que compara si 1 es igual a 4
        //      y como no lo es devuelve False, (en este caso da error 
        //      por que se  está declarando la variable boolean por segunda vez)
                //boolean adivina = (1==4);
        //System.out.println(adivina);
    }   
}
