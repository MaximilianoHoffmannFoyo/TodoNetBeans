package tienda;

import java.util.Objects;

public final class Musica extends Producto {

    private String grupo;

    public Musica() {
    }

    public Musica(String grupo, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {//método polimórfico
        return super.toString() + "\nMusica{" + "grupo=" + grupo + '}';
    }

    @Override
    public int hashCode() {//método polimórfico
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.grupo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//método polimórfico
        if (!super.equals(obj)) {
            return false;
        }
        final Musica other = (Musica) obj;
        return Objects.equals(this.grupo, other.grupo);
    }

}
