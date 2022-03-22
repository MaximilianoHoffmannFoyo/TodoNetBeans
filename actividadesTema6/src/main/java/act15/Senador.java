package act15;

public class Senador extends Legislador {
    
    private double salarioExtra;

    public Senador(double salarioExtra) {
        this.salarioExtra = salarioExtra;
    }

    public Senador(double salarioExtra, String provinciaQueRepresenta, String partidoPolitico, String nombre, String nif, int edad) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, nif, edad);
        this.salarioExtra = salarioExtra;
    }

    public double getSalarioExtra() {
        return salarioExtra;
    }

    public void setSalarioExtra(double salarioExtra) {
        this.salarioExtra = salarioExtra;
    }

    @Override
    public String toString() {
        return super.toString()+"Senador{" + "salarioExtra=" + salarioExtra + '}';
    }
    
    public String getCamaraEnQueTrabaja(){
        return "Senador";
    }
}
