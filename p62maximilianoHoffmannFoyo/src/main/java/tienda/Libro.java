package tienda;

import java.util.Objects;

public abstract class Libro extends Producto implements Comparable<Libro> {

    private String isbn;

    public Libro() {
    }

    public Libro(String isbn, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {//método polimórfico
        return super.toString()+"\nLibro{" + "isbn=" + isbn + '}';
    }

    @Override
    public int hashCode() {//método polimórfico
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//método polimórfico
        if (!super.equals(obj)) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }

    @Override
    public int compareTo(Libro l) {//método polimórfico
        return this.isbn.compareTo(l.isbn);
    }
    
    public abstract void resaltarTexto();
}
