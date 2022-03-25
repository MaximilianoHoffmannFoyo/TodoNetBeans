package hospital;

public class Administrativo extends Empleado {

    public Grupo grupo;

    public Administrativo() {
    }

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void registrarDocumento(String nombreDoc) {
        System.out.println("El administrativo " + this.getNombre() + " " + this.getApellidos() + " ha registrado el documento " + nombreDoc + " (hashcode: " + nombreDoc.hashCode() + ")");
    }

    public double calcularIRPF() {
        return this.getSalario() * (this.grupo.getIrpf() / 100);
    }
}
