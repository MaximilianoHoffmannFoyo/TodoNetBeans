package tienda;

public final class LibroPapel extends Libro implements SeEnvia {

    private int numPaginas;

    public LibroPapel() {
    }

    public LibroPapel(int numPaginas, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {//método polimórfico
        return super.toString()+"\nLibroPapel{" + "numPaginas=" + numPaginas + '}';
    }

    @Override
    public void enviar(String direccion) {//método polimórfico
        System.out.println("El " + this.getClass() + " con descripcion " + this.getDescripcion()
                + ", isbn " + this.getIsbn() + ", numero de paginas " + this.getNumPaginas()
                + "\n y codigo " + this.getCodigo() + ". Se enviara a la direccion: " + direccion);
    }

    @Override
    public int hashCode() {//método polimórfico
        int hash = 7;
        hash = 97 * hash + this.numPaginas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//método polimórfico
        if (!super.equals(obj)) {
            return false;
        }
        final LibroPapel other = (LibroPapel) obj;
        return this.numPaginas == other.numPaginas;
    }

    @Override
    public void resaltarTexto() {
        System.out.println("El texto es marcado con un rotulador verde fluorescente");
    }

}
