package act13;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//Crea una lista de personas (con la clase ArrayList) y prueba a añadir varios 
//alumnos y varios profesores a la lista. Recorre la lista y llama al método 
//identificate() de cada objeto. Muestra los datos de cada objeto. Usa el 
//operador instanceof en cada iteración para mostrar la clase de cada uno de 
//los objetos y llamar al método getID si es un Estudiante o llamar al método 
//getEspecialidad si es un Profesor. ¿Puedes crear objetos de la clase Persona? 
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Estudiante("01", "Ela", "Kidner", "5346342D", new Direccion("Tolete", "Estepona", "21432", "España")));
        personas.add(new Estudiante("02", "Fer", "Hernis", "5222242G", new Direccion("Tolete", "Estepona", "21432", "España")));
        personas.add(new Estudiante("03", "Dani", "Robber", "765723M", new Direccion("Tolete", "Estepona", "21432", "España")));
        personas.add(new Profesor("matematicas", "Middle", "Kidner", "5355662D", new Direccion("Tolete", "Estepona", "21432", "España")));
        personas.add(new Profesor("lengua", "Tyer", "Top", "124132W", new Direccion("Tolete", "Estepona", "21432", "España")));
        personas.add(new Profesor("ingles", "Rpck", "Bottom", "546756H", new Direccion("Tolete", "Estepona", "21432", "España")));

        for (Persona persona : personas) {
            persona.identificate();
            if (persona instanceof Estudiante) {
                System.out.println(((Estudiante) persona).getId());
            } else if (persona instanceof Profesor) {
                System.out.println(((Profesor) persona).getEspecialidad());
            }
        }
        System.out.println("\n\n");
//Repite el ejercicio pero usando una lista de objetos de tipo Identificable. 
//¿Por qué es posible?

        ArrayList<Identificable> identificados = new ArrayList<>();
        identificados.add(new Estudiante("01", "Ela", "Kidner", "5346342D", new Direccion("Tolete", "Estepona", "21432", "España")));
        identificados.add(new Estudiante("02", "Fer", "Hernis", "5222242G", new Direccion("Tolete", "Estepona", "21432", "España")));
        identificados.add(new Estudiante("03", "Dani", "Robber", "765723M", new Direccion("Tolete", "Estepona", "21432", "España")));
        identificados.add(new Profesor("matematicas", "Middle", "Kidner", "5355662D", new Direccion("Tolete", "Estepona", "21432", "España")));
        identificados.add(new Profesor("lengua", "Tyer", "Top", "124132W", new Direccion("Tolete", "Estepona", "21432", "España")));
        identificados.add(new Profesor("ingles", "Rpck", "Bottom", "546756H", new Direccion("Tolete", "Estepona", "21432", "España")));

        for (Identificable identificado : identificados) {
            identificado.identificate();
            if (identificado instanceof Estudiante) {
                System.out.println(((Estudiante) identificado).getId());
            } else if (identificado instanceof Profesor) {
                System.out.println(((Profesor) identificado).getEspecialidad());
            }
        }
    }

}
