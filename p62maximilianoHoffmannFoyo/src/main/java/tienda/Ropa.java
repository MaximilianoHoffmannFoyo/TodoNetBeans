package tienda;

import java.util.Objects;

public abstract class Ropa extends Producto implements SeEnvia {

    private String marca;

    public Ropa() {
    }

    public Ropa(String marca, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {//método polimórfico
        return super.toString()+"\nRopa{" + "marca=" + marca + '}';
    }

    @Override
    public int hashCode() {//método polimórfico
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//método polimórfico
        if (!super.equals(obj)) {
            return false;
        }
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }

}
