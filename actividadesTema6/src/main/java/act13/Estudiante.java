package act13;

public class Estudiante extends Persona {

    private String id;

    public Estudiante() {
    }

    public Estudiante(String id, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstudiante{" + "id=" + id + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Es un estudiante");
    }

}
