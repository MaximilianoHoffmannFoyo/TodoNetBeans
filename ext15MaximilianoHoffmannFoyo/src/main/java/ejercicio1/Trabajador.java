package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

/*
 */
public class Trabajador implements Comparable<Trabajador> {

    private String nombre, apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoriaEmpleado;

    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado categoriaEmpleado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public CategoriaEmpleado getCategoriaEmpleado() {
        return categoriaEmpleado;
    }

    public void setCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado) {
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public Trabajador(Trabajador t) {
        this.nombre = t.nombre;
        this.apellidos = t.apellidos;
        this.fechaNacimiento = t.fechaNacimiento;
        this.categoriaEmpleado = t.categoriaEmpleado;
    }

    public double calcularSueldo() {
        double sueldoBaseComun = 1707;
        switch (this.categoriaEmpleado) {
            case INICIAL:
                return sueldoBaseComun + CategoriaEmpleado.INICIAL.getComplemento();
            case MEDIA:
                return sueldoBaseComun + CategoriaEmpleado.MEDIA.getComplemento();
            case AVANZADA:
                return sueldoBaseComun + CategoriaEmpleado.AVANZADA.getComplemento();
            default:
                break;
        }
        return 0;
    }

//    public static LocalDate fechaJubilacion(Trabajador trabajador){
//        return ;
//    }
    @Override
    public String toString() {
        return "\t" + apellidos + ", " + nombre + "\tF.Nac: " + fechaNacimiento
                + "\nCategoria:" + categoriaEmpleado.name()
                + "\nFecha de jubilación: " + "fechaJubilacion()"
                + "\nSueldoActual: " + calcularSueldo();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.apellidos);
        hash = 89 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 89 * hash + Objects.hashCode(this.categoriaEmpleado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return this.categoriaEmpleado == other.categoriaEmpleado;
    }

    @Override
    public int compareTo(Trabajador t) {
        return this.nombre.compareTo(t.nombre);
    }

}
