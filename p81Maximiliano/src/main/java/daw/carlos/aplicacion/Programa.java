/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.carlos.aplicacion;

import daw.carlos.modelo.AventuraDAO;
import daw.carlos.modelo.AventuraVO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J. Carlos F. Vico <jcarlosvico@maralboran.es>
 */
public class Programa {

    public static void main(String[] args) {

        AventuraDAO daoPersona = new AventuraDAO();
        List<AventuraVO> lista = new ArrayList<>();
        lista.add(new AventuraVO(10, "Aventura10", "facil", "descripcion10"));
        lista.add(new AventuraVO(20, "Aventura20", "facil", "descripcion20"));
        lista.add(new AventuraVO(30, "Aventura30", "medio", "descripcion30"));
        lista.add(new AventuraVO(40, "Aventura40", "experto", "descripcion40"));
        lista.add(new AventuraVO(50, "Aventura50", "dificil", "descripcion50"));

        try {

//            System.out.println("Nº personas insertadas " + daoPersona.insertAventura(lista));
            System.out.println("-----------------------------------------");
            System.out.println("Comprobamos en una nueva lista que se recogen los datos desde la tabla.");
            List<AventuraVO> nuevaLista = daoPersona.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Persona con primary key 1: ");
            System.out.println(daoPersona.findByCodAventura(1));
            System.out.println("-----------------------------------------");
            System.out.println("Se va a borrar la persona con pk 3");
            System.out.println("Nº personas borradas "
                    + daoPersona.deleteAventura(new AventuraVO(30, "Aventura30", "medio", "descripcion30")));
            System.out.println("-----------------------------------------");
            nuevaLista = daoPersona.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de borrar una persona -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Modificación de la persona con pk 5");
            System.out.println("Nº Personas modificadas "
                    + daoPersona.updateAventura(10, new AventuraVO(70, "Aventura70", "ultraDificil", "descripcion70")));
            System.out.println("-----------------------------------------");
            nuevaLista = daoPersona.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de modificar una persona -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
//            System.out.println("Ejecución del procedimiento almacenado");
//            System.out.println("Se cambia María Weston por Felipe Román");
//            System.out.println("Nombres cambiados " + daoPersona.cambiarNombres("Felipe Román", "Maria Weston"));
            System.out.println("-----------------------------------------");
            nuevaLista = daoPersona.getAll();
            System.out.println("-------- Lista con datos recogidos desde la B.D despues de ejecutar proced. -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
        }
        System.out.println();
        lista.forEach(System.out::println);

    }

}
