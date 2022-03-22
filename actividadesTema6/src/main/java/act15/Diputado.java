package act15;

public class Diputado extends Legislador {
    
    private int numeroAsiento;

    public Diputado() {
    }

    public Diputado(int numeroAsiento, String provinciaQueRepresenta, String partidoPolitico, String nombre, String nif, int edad) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, nif, edad);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return super.toString()+"Diputado{" + "numeroAsiento=" + numeroAsiento + '}';
    }
    
    public String getCamaraEnQueTrabaja(){
        return "Diputado";
    }
}
