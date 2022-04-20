package vehiculo;

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
    private double tarifa;
    private boolean disponible;
    
    
    private static String [] marcas = {"audi","ford","tesla","jeep","renolt"};
    private static String [] modelos = {"golf","grande","cuadrado","hueco","todo incluido"};
    private static String [] colores = {"celeste","naranja","negro","blanco","magenta"};
    
    public Vehiculo() {
        Random aleatorio = new Random();
        this.color = colores[aleatorio.nextInt(colores.length)];
        this.marca = marcas[aleatorio.nextInt(marcas.length)];
        this.modelo = modelos[aleatorio.nextInt(modelos.length)];
    }
    
    public static Vehiculo [] generar100VehiculosAleatoriamente(){
        Vehiculo [] coches = new Vehiculo[100];
        for (int i = 0; i < 100; i++) {
            coches[i] = new Vehiculo();
        }
        return coches;
    }
    public static void mostrar100Vehiculos(Vehiculo [] coches){
        for (int i = 0; i < 100; i++) {
            System.out.println(coches[i].toString());
        }
    }
    
    // el método constructor de la clase Vehiculo 
    public Vehiculo(String matricula,
            String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
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

    public double getTarifa() {
        return this.tarifa;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void aplicarDescuentoTarifa(double descuento) {
        this.tarifa -= descuento;
    }

    @Override
    public String toString() {
        return marca + ", " + modelo + ", " + color;
    }

    public String getAtributos(){
        return matricula +" "+ marca +" "+ modelo +" "+ color +" "+ tarifa +" "+ disponible;
    }
    
}
