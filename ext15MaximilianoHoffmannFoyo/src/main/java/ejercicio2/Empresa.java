package ejercicio2;

import ejercicio1.Trabajador;
import java.util.ArrayList;
import java.util.Collections;

public class Empresa {

    private ArrayList<ejercicio1.Trabajador> Trabajadores;
    private String nombre;
    private String CIF;

    public Empresa(String nombre, String CIF) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.Trabajadores = new ArrayList<>();
    }

    public void imprimir() {
        System.out.println("Nombre de la empresa: " + this.nombre);
        System.out.println("CIF de la empresa: " + this.CIF);
        System.out.println("Trabajadores de la empresa: ");
        for (Trabajador trabajador : Trabajadores) {
            System.out.println(trabajador.toString());
        }
    }

    public void contratar(Trabajador t) {
        this.Trabajadores.add(t);
    }

    public boolean despedir(Trabajador t) {

        Trabajador aux = this.Trabajadores.remove(this.Trabajadores.indexOf(t));

        return aux.equals(t);
    }

    public int[] buscarTodosNombre(String nombre) {
        int[] lista = new int[this.Trabajadores.size()];
        for (Trabajador t : this.Trabajadores) {
            if (t.getNombre().equals(nombre)) {
                int aux = 0;
                lista[aux] = Trabajadores.indexOf(t);
            }
        }
        return lista;
    }

    public void ordenarNombre() {
        Collections.sort(Trabajadores, (Trabajador c1, Trabajador c2) -> c1.getNombre().compareTo(c2.getNombre()));
    }

    public int buscarNombre(Trabajador t) {
        return Collections.binarySearch(Trabajadores, t, (Trabajador c1, Trabajador c2) -> c1.getNombre().compareTo(c2.getNombre()));
    }

}
