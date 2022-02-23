
package com.mycompany.tema2maximiliano;

public class Ej06 {
    /*6.- Crea una nueva clase llamada Ej06, que contenga una llamada al método 
    public static void main(String[] args). La aplicación Java contendrá comentarios 
    descriptivos del código e intercambiará los valores de dos variables de tipo entero, 
    haciendo uso de una tercera variable auxiliar. Antes de intercambiar los valores, 
    debes declarar e inicializar las variables con los valores que tú quieras. 
    Muestra los valores de las variables antes de intercambiar sus valores y después del intercambio.
    */
    public static void main(String[] args) {
        //Declaramos e inicializamos las variables.
        byte valorA = 5;
        byte valorB = 7;
        //Declaramos la variable auxiliar para intercambiar los valores anteriores.
        byte valorC;
        
        //Mostramos los valores antes de que se intercambien
        System.out.println("Estos son los valores antes de intercambiarse:");
        System.out.println("El valor A es: " + valorA + " y el valor B es: " + valorB);
        
        //intercambiamos el valor de las variables A y B usando la C de auxiliar para ello
        valorC = valorA;
        valorA = valorB;
        valorB = valorC;
        
        //Volvemos a mostrar los valores después del intercambio
        System.out.println("Estos son los valores después de intercambiarse:");
        System.out.println("El valor A ahora es: " + valorA + " y el valor B ahora es: " + valorB);
    }
    
}

