package vehiculo;

import java.util.Objects;
import java.util.Random;

/*
2. Implementa la jerarquía de clases de Vehículo: Turismo, Deportivo y Furgoneta, 
según los apuntes de clase. Sobrescribe el método getAtributos() en cada clase. 
Realiza una clase de prueba donde se vea la creación de objetos de cada clase y 
las llamadas a los métodos getAtributos() en cada caso. Comprueba que desde un 
objeto de una superclase no puedes acceder a métodos de las subclases, pero sí al contrario.
*/

public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private boolean disponible;
    
    
    private static String [] marcas = {"audi","ford","tesla","jeep","renolt"};
    private static String [] modelos = {"golf","grande","cuadrado","hueco","todo incluido"};
    private static String [] colores = {"celeste","naranja","negro","blanco","magenta"};
    
//    public Vehiculo() {
//        Random aleatorio = new Random();
//        this.color = colores[aleatorio.nextInt(colores.length)];
//        this.marca = marcas[aleatorio.nextInt(marcas.length)];
//        this.modelo = modelos[aleatorio.nextInt(modelos.length)];
//    }
    
//    public static Vehiculo [] generar100VehiculosAleatoriamente(){
//        Vehiculo [] coches = new Vehiculo[100];
//        for (int i = 0; i < 100; i++) {
//            coches[i] = new Vehiculo();
//        }
//        return coches;
//    }
    public static void mostrar100Vehiculos(Vehiculo [] coches){
        for (int i = 0; i < 100; i++) {
            System.out.println(coches[i].toString());
        }
    }
    
    // el método constructor de la clase Vehiculo 
    public Vehiculo(String matricula,
            String marca, String modelo, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.disponible = false;
    }
// los métodos ‘get’ y ‘set’ de la clase Vehiculo 

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void setMarcas(String[] marcas) {
        Vehiculo.marcas = marcas;
    }

    public static void setModelos(String[] modelos) {
        Vehiculo.modelos = modelos;
    }

    public static void setColores(String[] colores) {
        Vehiculo.colores = colores;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return matricula +":"+ marca +":"+ modelo +":"+ color +":"+ disponible;
    }

    public String getAtributos(){
        return matricula +":"+ marca +":"+ modelo +":"+ color +":"+ disponible;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 19 * hash + Objects.hashCode(this.matricula);
//        hash = 19 * hash + Objects.hashCode(this.marca);
//        hash = 19 * hash + Objects.hashCode(this.modelo);
//        hash = 19 * hash + Objects.hashCode(this.color);
//        hash = 19 * hash + (this.disponible ? 1 : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Vehiculo other = (Vehiculo) obj;
//        if (this.disponible != other.disponible) {
//            return false;
//        }
//        if (!Objects.equals(this.matricula, other.matricula)) {
//            return false;
//        }
//        if (!Objects.equals(this.marca, other.marca)) {
//            return false;
//        }
//        if (!Objects.equals(this.modelo, other.modelo)) {
//            return false;
//        }
//        return Objects.equals(this.color, other.color);
//    }
    
}
