package herencia;
//Clase A, abstracta

import java.util.Objects;

public abstract class Mago {

    protected String nombre;
    protected String barita;

    public Mago() {
    }

    public Mago(String nombre, String Barita) {
        this.nombre = nombre;
        this.barita = Barita;
    }

    //metodo abstracto
    public abstract String saberTipoMago();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + Objects.hashCode(this.barita);
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
        final Mago other = (Mago) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.barita, other.barita);
    }

    //toString con información solo de esta clase por ser la principal   
    @Override
    public String toString() {//método polimórfico
        return "Mago{" + "nombre=" + nombre + ", Barita=" + barita + "}\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarita() {
        return barita;
    }

    public void setBarita(String barita) {
        this.barita = barita;
    }

}
