package com.mycompany.tarea7cmaximiliano;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws IOException {
        
        ArrayList<HoraDeClase> lista = Metodos.crearListaDeFicheroCSV("hor_curso_1920_final.csv");
//        lista.forEach(System.out::println);
        
        Set<String> setCurso = Metodos.setCurso(lista);
//        setCurso.forEach(System.out::println);
        Set<String> setProfesor = Metodos.setProfesor(lista);
//        setProfesor.forEach(System.out::println);
    
//        String[] opciones = {"Consultar horarios por profesor/a", "Consultar horarios por grupo"};
//                int opcion = JOptionPane.showOptionDialog(null, "Elije la opción que quieras:\n"+
//                        "La consulta que elijas segira en la linea de comandos", "Selección", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
//    
//    if (opcion == 0) {
//        setProfesor.forEach(System.out::println);
//        System.out.println("Se ha mostrado una lista con las iniciales de los profesores\n"
//                + "Elija una de ellas para generar el horario según dicho profesor:");
//        Metodos.guardarJSON(lista);
//    }
//    
//    if (opcion == 1) {
//        setCurso.forEach(System.out::println);
//        System.out.println("Se ha mostrado una lista con todos los grupos de la institución\n"
//                + "Elija una de ellas para generar el horario según dicho grupo:");
//        Metodos.guardarCSV(lista);
//    }
    
    }
}
