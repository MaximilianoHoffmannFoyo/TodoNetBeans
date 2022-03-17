package act7;

/*
7.- Transforma la clase Trabajador de los apuntes de clase en una clase abstracta que 
incluya el método abstracto cotizar(). Crea la jerarquía de herencia que cuelgue de la 
clase Trabajador, implementado el método abstracto en las respectivas clases (además de 
la clase Camarero, inventa tú otra). Incluye una clase de prueba con el método main(), 
donde se cree una lista de cuatro Trabajadores. Añade en la lista dos objetos Camarero 
y dos objetos del tipo inventado por ti.  Finalmente recorre la lista y llama al método 
cotizar() de cada uno de los trabajadores, comprobando el comportamiento polimórfico de dicho método.
 */
public abstract class Trabajador {

    private String nombre;
    private String apellido1;
    private String NIF;

    public Trabajador(String nombre, String apellido1, String NIF) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.NIF = NIF;
    }

    public abstract void cotizar();
//    {
//        System.out.println("Cotizando como Trabajador");
//    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

}
