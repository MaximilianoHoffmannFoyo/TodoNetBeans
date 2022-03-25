package hospital;

import java.util.ArrayList;

public class Hospital {

    public String nombre;
    public String direccion;
    public int numeroCamas;
    public ArrayList<Paciente> pacientes;
    public ArrayList<Empleado> empleados;

    public Hospital() {
    }

    public Hospital(String nombre, String direccion, int numeroCamas, ArrayList<Paciente> pacientes, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.pacientes = pacientes;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void contratarEmpleado(Empleado emp) {
        this.empleados.add(emp);
    }

    public void ingresarPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }
}
