package act15;
/*A) Persona
Atributos: nombre, nif, edad
Métodos: 
- Getters y Setters.
- Constructores (por defecto y parametrizado)
- Método toString(), que devolverá en un String los atributos de persona concatenados.
 */
public class Persona {
    
    private String nombre;
    private String nif;
    private int edad;

    public Persona() {
    }
    
    public Persona(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", nif=" + nif + ", edad=" + edad ;
    }
    
}
