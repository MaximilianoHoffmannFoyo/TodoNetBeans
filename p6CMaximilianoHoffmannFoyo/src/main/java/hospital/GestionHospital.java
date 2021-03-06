package hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class GestionHospital {

    private Hospital hospital;

    public GestionHospital() {
    }

    public GestionHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public static void main(String[] args) {
        Hospital h = new Hospital("Costa del Sol", "marbella", 102, new ArrayList<Paciente>(), new ArrayList<Empleado>());
        GestionHospital gh = new GestionHospital(h);

        h.contratarEmpleado(gh.crearMedico());
        h.contratarEmpleado(gh.crearMedico());
        h.contratarEmpleado(gh.crearPersoanlPAS());
        h.contratarEmpleado(gh.crearPersoanlPAS());
        h.contratarEmpleado(gh.crearPersoanlPAS());
        h.pacientes.add(gh.crearPaciente());
        h.pacientes.add(gh.crearPaciente());
        h.pacientes.add(gh.crearPaciente());
        h.pacientes.add(gh.crearPaciente());
        h.pacientes.add(gh.crearPaciente());

        ((Medico) h.empleados.get(new Random().nextInt(2))).tratar(h.pacientes.get(new Random().nextInt(5)), "Pancetamol");

        for (Empleado empleado : h.empleados) {
            empleado.calcularIRPF();
        }

        h.pacientes.get(0).renovarNIF(LocalDate.now());
    }

    public Paciente crearPaciente() {
        return new Paciente(randomStringNumeros(12), randomString(6), randomString(10), new NIF(randomStringNumeros(8), LocalDate.now()));
    }

    public Medico crearMedico() {
        return new Medico("cirugía", randomStringNumeros(12), 1333.4, randomString(6), randomString(10), new NIF(randomStringNumeros(8), LocalDate.now()));
    }

    public Administrativo crearPersoanlPAS() {
        return new Administrativo(Grupo.C, randomStringNumeros(12), 253.4, randomString(6), randomString(10), new NIF(randomStringNumeros(8), LocalDate.now()));
    }

    public String randomString(int n) {
        String letras = "abcdefghijklmnñopqrstuvwxyz";
        String s = "";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            char letra = letras.charAt(random.nextInt(letras.length()));
            s += letra;
        }
        return s;
    }

    public String randomStringNumeros(int n) {
        String letras = "1234567890";
        String s = "";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            char letra = letras.charAt(random.nextInt(letras.length()));
            s += letra;
        }
        return s;
    }
}
