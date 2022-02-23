
package maxipaquetes;

//Aquí estarian los Import(entre el package y el public class)

//Los comentarios de este estilo son de un sola linea
/*
Este tipo de 
comentarios tienen 
varias lineas
*/

//Declaración de la clase, todos los programas tienen que estar en una clase
public class Perimetro1 {

    //El metodo main es el que busca el JRE para iniciar la ejecucución del programa
    public static void main(String[] args) {
        
        //Instrución basica para imprimir por consola
        System.out.println("Programa para calcular el "
                + "perimetro de una circunferencia");

        //Perimetro = 2 * PI * r
        //Declaración e inicialización de una variable primitiva de tipo int
        int radio = 20;
        double pi; 
        pi = 3.14;
        
        System.out.println("El radio es: " + radio);
        
        double perimetro;
        //perimetro= 2 * pi * radio;
        perimetro= 2 * Math.PI * radio;
        
        System.out.println("El perimetro es: " + perimetro);
    }
    
}
 