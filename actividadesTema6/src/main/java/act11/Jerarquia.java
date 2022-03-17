package act11;

import java.util.ArrayList;

/*11.  Escribe un programa que implemente la siguiente jerarquía de clases:

Implementar aquellos atributos y métodos que consideres necesarios para que se 
pueda ejecutar el siguiente programa:

public class Jerarquía {
    public static void main(String[] args) { 
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 12)); // Base=10 Altura=12
        figuras.add(new Triángulo(10,5); // Base=10 Altura=5
        figuras.add(new Romboide(15,5)); // Base=15, Altura=5 
        for (Figura f: figuras)
            System.out.println("Área: " + f.calcularArea());
        }
    }
}

Al ejecutar el programa, deberá aparecer por pantalla el área de cada una de las figuras creadas:
    Área del Rectángulo = 120cm² 
    Área del Triángulo = 25cm²
    Área del Romboide = 75cm²

 */
public class Jerarquia {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 12)); // Base=10 Altura=12
        figuras.add(new Triangulo(10, 5)); // Base=10 Altura=5
        figuras.add(new Romboide(15, 5)); // Base=15, Altura=5 
        for (Figura f : figuras) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}
