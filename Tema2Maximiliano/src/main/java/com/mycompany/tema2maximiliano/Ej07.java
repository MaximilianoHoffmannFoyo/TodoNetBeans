
package com.mycompany.tema2maximiliano;

public class Ej07 {
    /*7.- Crea una nueva clase llamada Ej07, que contenga una llamada al método public static void main(String[] args). 
    La aplicación Java contendrá comentarios descriptivos del código y realiza lo siguiente:
    a.- Declara e inicializa tres variables int en la misma instrucción (a=1, b=2, c=3).
    b.- Declara e inicializa tres variables double en la misma instrucción (d=4.5, e=5.7, f=6.9).
    c.- Muestra las variables en dos líneas, la primera línea mostrará las variables tipo entero y la segunda línea mostrará las variables tipo double.
    d.- Realiza los siguiente intercambios de valores: en b guarda c, en c guarda a, en a guarda b. Muestra por pantalla el resultado.
    e.- Realiza los siguiente intercambios de valores: en e guarda f, en f guarda d, en d guarda e. Muestra por pantalla el resultado.
    */
    public static void main(String[] args) {
        //Declaramos e inicializamos 3 variables int y 3 double
        int a=1, b=2, c=3;
        double d=4.5, e=5.7, f=6.9;
        //y 1 variable más de cada tipo para intercambiar
        int aux1;
        double aux2;
        //Mostramos las variables en 2 líneas
        System.out.println("Estas son las variables tipo entero: a = "+a+", b = "+b+", c = "+c);
        System.out.println("Estas son las variables tipo double: d = "+d+", e = "+e+", f = "+f);
        //Hacemos estos intercambios de valores: En b guarda c, en c guarda a, en a guarda b
        aux1 = b;
        b = c;
        c = a;
        a = aux1;
        //Mostramos las variables de nuevo(solo las enteras)
        System.out.println("Estas son las nuevas variables tipo entero: a = "+a+", b = "+b+", c = "+c);
        //Hacemos estos intercambios de valores: En e guarda f, en f guarda d, en d guarda e
        aux2 = e;
        e = f;
        f = d;
        d = aux2;
        //Mostramos las variables de nuevo(solo las enteras)
        System.out.println("Estas son las nuevas variables tipo double: d = "+d+", e = "+e+", f = "+f);
    }
    
}
