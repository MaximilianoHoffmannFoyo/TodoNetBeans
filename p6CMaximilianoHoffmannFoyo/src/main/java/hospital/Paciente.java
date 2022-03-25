package hospital;

import java.util.Random;

public class Paciente extends Persona {

    private String numeroHistoria;

    public Paciente() {
    }

    public Paciente(String numeroHistoria, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public void tomarMedicina(String medicina) {
        if (new Random().nextBoolean()) {
            System.out.println("El paciente " + this.getNombre() + " " + this.getApellidos() + " se ha curado al tomar " + medicina);
        } else {
            System.out.println("El paciente " + this.getNombre() + " " + this.getApellidos() + " ha empeorado al tomar " + medicina);
        }
    }

}
