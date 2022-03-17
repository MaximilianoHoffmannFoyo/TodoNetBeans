
package act5;

public class Main {
    /*
    - Creación de 5 objetos Cliente, uno con el constructor por defecto 
        y cuatro con el parametrizado. De los cuatro objetos creados con 
        el parametrizado, 3 tendrán los mismos estados. 
    - Imprime los hashCode de cada instancia, y comprueba cuáles son iguales y cuáles distintos.
    - Comprobaciones de las propiedades transitiva, reflexiva, simétrica y nula.
    */
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Eric","0924368D",26);
        Cliente c3 = new Cliente("Kenny","9254325E",17);
        Cliente c4 = new Cliente("Kenny","9254325E",17);
        Cliente c5 = new Cliente("Kenny","9254325E",17);
        
        System.out.println("HashCodes:");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c5.hashCode());
        
        //transitiva 
        System.out.println("\ntransitiva");
        System.out.println(c3.equals(c4));
        System.out.println(c4.equals(c5));
        System.out.println(c3.equals(c5));
        //reflexiva
        System.out.println("\nreflexiva");
        System.out.println(c1.equals(c1));
        //simétrica
        System.out.println("\nsimétrica");
        System.out.println(c3.equals(c5));
        System.out.println(c5.equals(c3));
        //nula
        System.out.println("\nnula");
        System.out.println(c2.equals(null));
    }
    
}
