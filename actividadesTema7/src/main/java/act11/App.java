package act11;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class App {
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private double tamanioKb;
    private int numeroDescargas;
    private static int contadorInstancias = 1;

    public App() {
        this.codigo = contadorInstancias;
        contadorInstancias++;
        this.nombre = nombreAleatorio();
        this.descripcion = descripcionAleatorio();
        this.tamanioKb = tamanioKbAleatorio();
        this.numeroDescargas = numeroDescargasAleatorio();
    }

    public App(int codigo, String nombre, String descripcion, double tamanioKb, int numeroDescargas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanioKb = tamanioKb;
        this.numeroDescargas = numeroDescargas;
    }
    
    public String nombreAleatorio(){
        Random r = new Random();
        char caracterRandom = (char) (r.nextInt(26) + 'a');
        return "app"+codigo+caracterRandom;
    }
    public String descripcionAleatorio(){
        Random r = new Random();
        ArrayList<String> descripciones = new ArrayList<String>();
        descripciones.add("App de pago");descripciones.add("App de banco");descripciones.add("App de pokemon");descripciones.add("App rosa");descripciones.add("App de comida rapida");
        descripciones.add("App de NetBeans");descripciones.add("App de banco del parque");descripciones.add("App calculadora");descripciones.add("App española");descripciones.add("App de red social");
        return descripciones.get(r.nextInt(10));
    }
    public double tamanioKbAleatorio(){
        Random r = new Random();
        DoubleStream d = r.doubles(1, 100.0, 1024.0);
        return d.sum();
    }
    public int numeroDescargasAleatorio(){
        Random r = new Random();
        IntStream d = r.ints(1, 0, 50000);
        return d.sum();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTamanioKb() {
        return tamanioKb;
    }

    public void setTamanioKb(double tamanioKb) {
        this.tamanioKb = tamanioKb;
    }

    public int getNumeroDescargas() {
        return numeroDescargas;
    }

    public void setNumeroDescargas(int numeroDescargas) {
        this.numeroDescargas = numeroDescargas;
    }

    public static int getContadorInstancias() {
        return contadorInstancias;
    }

    public static void setContadorInstancias(int contadorInstancias) {
        App.contadorInstancias = contadorInstancias;
    }

    @Override
    public String toString() {
        return codigo + ";" + nombre + ";" + descripcion + ";" + tamanioKb + ";" + numeroDescargas;
    }
    
    
}
