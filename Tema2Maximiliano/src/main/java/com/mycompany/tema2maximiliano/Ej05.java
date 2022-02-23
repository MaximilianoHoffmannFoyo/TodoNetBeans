
package com.mycompany.tema2maximiliano;

public class Ej05 {

    public static void main(String[] args) {
        //a.- Declara una variable primitiva de cada uno de los tipos estudiados.
        
        byte bytex;
        short shortx;
        int entero;
        long longx;
        float floatx;
        double real;
        char caracter;
        boolean booleano;
        
        //b.- Declara una constante numérica de tipo double y otra de tipo int.
        
        final int ENTERO_CONSTANTE;
        final double REAL_CONSTANTE;
        
        //c.- Declara un objeto String.
        String texto;
        
        //d.- Inicializa las variables, la constante y el objeto con literales de tu elección.
        bytex = 5;
        shortx = 345;
        entero = 123;
        //importante poner "L" al final de dato de long y "F" al final de float
        longx = 348855463457547l;
        floatx = 543.6f;
        real = 265.79567;
        caracter = 'A';
        booleano = true;
        ENTERO_CONSTANTE = 14;
        REAL_CONSTANTE = 13.12;
        texto = "Hola";
        
        /*e.- Muestra en pantalla cada una de las variables, 
        constantes y objetos anteriores, en distintas líneas y especificando 
        el tamaño que ocupan en memoria*/
        System.out.println("Byte");
        System.out.println("Short");
        System.out.println("Int contiene un número entero como: " + entero + " Y ocupa un tamaño en momoria de 32bits");
        System.out.println("Long");
        System.out.println("Float");
        System.out.println("Double contiene un número real como: " + real + " Y ocupa un tamaño en momoria de 64bits");
        System.out.println("Char contiene un caracter como: " + caracter + " Y ocupa un tamaño en momoria de 16bits");
        System.out.println("Boolean contiene un valor como: " + booleano + " Y ocupa un tamaño en momoria de 1bit"); 
        System.out.println("String contiene un " + texto + " Y ocupa un tamaño en memoria que no se^^");
        
        System.out.println("final int contiene un número entero como: " + ENTERO_CONSTANTE + " Y ocupa un tamaño en momoria de 32bits");
        System.out.println("final double contiene un número real como: " + REAL_CONSTANTE + " Y ocupa un tamaño en momoria de 64bits");
    
    }
    
}
