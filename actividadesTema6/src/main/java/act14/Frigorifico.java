package act14;

public class Frigorifico extends Electrodomestico implements Silencioso, Comparable{

    private double capacidad;

    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "capacidad=" + capacidad + '}';
    }

    @Override
    public void silencio() {
        System.out.println("El frigorífico de modelo " + getModelo() + " emite 50dB.");
    }

    @Override
    public int compareTo(Object o) {
        return 2;
     }

    

}
