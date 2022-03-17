package act7;

import java.util.ArrayList;

public class Main {

/*
Incluye una clase de prueba con el método main(), donde se cree una lista de 
cuatro Trabajadores. Añade en la lista dos objetos Camarero y dos objetos del 
tipo inventado por ti.  Finalmente recorre la lista y llama al método cotizar() 
de cada uno de los trabajadores, comprobando el comportamiento polimórfico de dicho método.
*/
    public static void main(String[] args) {
    
        ArrayList<Trabajador> empleados = new ArrayList<>();
        empleados.add(new Camarero("metre", "Pepe", "Lopez", "22323d"));
        empleados.add(new Camarero("Jefe Sala", "Juan", "Gilguero", "111hfk"));
        empleados.add(new Cheff("Mini Chef", "Remy", "Linguini ", "fhtrf"));
        empleados.add(new Cheff("Pinche", "Chuso", "Montero", "f54343ew"));
        
       for (Trabajador f : empleados) {
            f.cotizar();
        }
     }

    
}
