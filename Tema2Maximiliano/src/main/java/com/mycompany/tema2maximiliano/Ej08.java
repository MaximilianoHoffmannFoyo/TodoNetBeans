
package com.mycompany.tema2maximiliano;

public class Ej08 {
    /*8.- Crea una nueva clase llamada Ej08, que contenga una llamada al método
    public static void main(String[] args).
    La aplicación Java contendrá comentarios descriptivos del código y realice lo siguiente:
    a.- Declara e inicializa tres variables int (a=10,  b=5, i=0)
    b.- Declara e inicializa dos variables double (c=71.3 y d=4.8)
    c.- Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d.
    El resultado de cada operación se almacena en una nuevas variables que se crearán para tal efecto.
    d.- Muestra el resultado de cada operación, usando las variables creadas en el paso c).
    e.- También muestra en pantalla los resultados de las siguientes operaciones: a*=3, b-=1, a/=b, c+=d.
    f.- Finalmente, el programa muestra en consola la siguiente información,
    en distintas instrucciones: valor de i, valor de i++, valor de i y valor de ++i.
    */
    public static void main(String[] args) {
        //Declaramos e inicializamos 3 variables int
        int a=10, b=5, i=0;
        //Declaramos e inicializamos 2 variables double
        double c=71, d=4.8;
        //Realizamos estas operaciones aritmeticas
        //a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d
        //Antes declaramos las variables para guardar los resultados de las operaciones
        int sumai, restai, multiplicacioni, divisioni;
        double sumad, restad, multiplicaciond, divisiond;
        sumai = a+b;
        restai = a-b;
        multiplicacioni = a*b;
        divisioni = a/b;
        sumad = c+d;
        restad = c-d;
        multiplicaciond = c*d;
        divisiond = c/d;
        //Mostramos el resultado de cada operación
        System.out.println("Estos son los resultados de cada operación:");
        System.out.println("a+b= "+sumai+", a-b= "+restai+", a*b= "+multiplicacioni+", a/b= "+divisioni);
        System.out.println("c+d= "+sumad+", c-d= "+restad+", c*d= "+multiplicaciond+", c/d= "+divisiond+ "\n");
        //Hacemos y mostramos los resultados de otras operaciones
        int aux1 = a*=3;
        b-=1;
        int aux2 = a/=b;
        c+=d;
        System.out.println("Resultados de otro tipos de operaciones:");
        System.out.println("a*=3 = "+aux1+", b-=1 = "+b+", a/=b = "+aux2+", c+=d = "+c+ "\n");
        //Mostramos por pantalla lo siguiente valor de i, valor de i++, valor de i y valor de ++i
        System.out.println("El valor de i es: "+ i);
        System.out.println("El valor de i++ es: "+ i++);
        System.out.println("El nuevo valor de i es: "+ i);
        System.out.println("El valor de ++i es: "+ ++i);
    }
}
