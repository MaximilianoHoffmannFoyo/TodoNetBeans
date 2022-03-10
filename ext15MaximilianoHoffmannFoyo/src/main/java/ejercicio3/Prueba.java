package ejercicio3;

import ejercicio1.CategoriaEmpleado;
import ejercicio1.Trabajador;
import ejercicio2.Empresa;
import java.time.LocalDate;

public class Prueba {

    public static void main(String[] args) {

        Empresa empresaA = new Empresa("Kasukabe", "023451");
        Empresa empresaB = new Empresa("Peliper", "678234");

        Trabajador t1 = new Trabajador("Bo", "Palta Febreo", LocalDate.of(1981, 3, 5), CategoriaEmpleado.INICIAL);
        Trabajador t2 = new Trabajador("Han", "Solo", LocalDate.of(1994, 4, 6), CategoriaEmpleado.MEDIA);
        Trabajador t3 = new Trabajador("Obi-Wan", "Kenobi", LocalDate.of(1979, 5, 7), CategoriaEmpleado.AVANZADA);
        Trabajador t4 = new Trabajador("Luke", "Skywalker", LocalDate.of(1996, 6, 8), CategoriaEmpleado.AVANZADA);
        Trabajador t5 = new Trabajador("Lili", "Poter", LocalDate.of(1969, 7, 9), CategoriaEmpleado.MEDIA);

        Trabajador t6 = new Trabajador(t3);

        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);

        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);

        empresaA.imprimir();
        System.out.println("----------------------------------------------");
        empresaB.imprimir();
        System.out.println("----------------------------------------------");

        empresaB.despedir(t5);
        empresaA.contratar(t5);

        empresaA.ordenarNombre();
        empresaB.ordenarNombre();

        empresaA.imprimir();
        System.out.println("----------------------------------------------");
        empresaB.imprimir();
        System.out.println("----------------------------------------------");

        System.out.println("Obi-wan en la empresaA: " + empresaA.buscarNombre(t3));
        System.out.println("Obi-wan en la empresaB: " + empresaB.buscarNombre(t3));
    }

}
