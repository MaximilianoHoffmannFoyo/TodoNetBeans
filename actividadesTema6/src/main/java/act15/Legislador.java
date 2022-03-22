package act15;

/*
15.- Declara una clase abstracta Legislador que herede de la clase Persona, con 
un atributo provinciaQueRepresenta y partidoPolitico. Incluye en la clase Legislador 
los métodos getters, setters y toString, además de los constructores correspondientes. 
Declara un método abstracto getCamaraEnQueTrabaja() que devuelva un String, indicando 
si es un “Senador” o un “Diputado”. 
Crea dos clases concretas que hereden de Legislador: la clase Diputado y la clase 
Senador. La clase Diputado tiene como atributo el número de asiento que ocupa. La 
clase Senador tiene como atributo el salario extra a cobrar por sesión. Implementa 
constructores, getters, setters y toString, así como los métodos abstractos necesarios 
en ambas clases. Crea una lista de legisladores y muestra por pantalla la cámara 
en que trabajan haciendo uso del polimorfismo, así como sus datos haciendo uso del 
método polimórfico toString.

 */
public abstract class Legislador extends Persona{
    
    private String provinciaQueRepresenta;
    private String partidoPolitico;

    public Legislador() {
    }

    public Legislador(String provinciaQueRepresenta, String partidoPolitico, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return super.toString()+"Legislador{" + "provinciaQueRepresenta=" + provinciaQueRepresenta + ", partidoPolitico=" + partidoPolitico + '}';
    }
    
    public abstract String getCamaraEnQueTrabaja();
    
}
