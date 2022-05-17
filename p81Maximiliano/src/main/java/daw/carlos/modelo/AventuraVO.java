package daw.carlos.modelo;

import java.time.LocalDate;

public class AventuraVO {

    private int codAventura;
    private String nombre;
    private String dificultad;
    private String descripcion;

    public AventuraVO(int codAventura, String nombre, String dificultad, String descripcion) {
        this.codAventura = codAventura;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.descripcion = descripcion;
    }

    public AventuraVO() {

    }

    public int getCodAventura() {
        return codAventura;
    }

    public void setCodAventura(int codAventura) {
        this.codAventura = codAventura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "AventuraVO{" + "codAventura=" + codAventura + ", nombre=" + nombre + ", dificultad=" + dificultad + ", descripcion=" + descripcion + '}';
    }

    
}
