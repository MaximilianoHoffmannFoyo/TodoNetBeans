package tienda;

import java.util.Objects;

public final class Pantalon extends Ropa {

    private String talla;

    public Pantalon() {
    }

    public Pantalon(String talla, String marca, String codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {//método polimórfico
        return super.toString()+"\nPantalon{" + "talla=" + talla + '}';
    }

    @Override
    public void enviar(String direccion) {//método polimórfico
        System.out.println("El " + this.getClass() + " con descripcion " + this.getDescripcion() + ", con talla " + this.getTalla()
                + "\n y codigo " + this.getCodigo() + ". Se enviara a la direccion: " + direccion);
    }

    @Override
    public int hashCode() {//método polimórfico
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.talla);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//método polimórfico
        if (!super.equals(obj)) {
            return false;
        }
        final Pantalon other = (Pantalon) obj;
        return Objects.equals(this.talla, other.talla);
    }

}
