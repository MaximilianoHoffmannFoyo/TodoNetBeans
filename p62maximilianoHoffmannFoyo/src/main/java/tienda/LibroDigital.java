package tienda;

public final class LibroDigital extends Libro implements SeDescarga {

    private int numKBytes;

    public LibroDigital() {
    }

    public LibroDigital(int numKBytes, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {//método polimórfico
        return super.toString() + "\nLibroDigital{" + "numKBytes=" + numKBytes + '}';
    }

    @Override
    public void descargar() {//método polimórfico
        System.out.println("http://tunombre.daw/" + this.hashCode());
    }

    @Override
    public int hashCode() {//método polimórfico
        int hash = 7;
        hash = 53 * hash + this.numKBytes;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//método polimórfico
        if (!super.equals(obj)) {
            return false;
        }
        final LibroDigital other = (LibroDigital) obj;
        return this.numKBytes == other.numKBytes;
    }

    @Override
    public void resaltarTexto() {
        System.out.println("El texto es marcado en negrita y con un fondo amarillo");
    }
}
