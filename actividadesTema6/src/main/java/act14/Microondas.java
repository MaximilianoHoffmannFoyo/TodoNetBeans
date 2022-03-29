package act14;

/*Incluir la clase Microondas, que también hereda de Electrodoméstico e implementa Silencioso. Esta clase tendrá el atributo 
potencia máxima en Vatios (w) e implementará los constructores, getter, setter y toString. El método silencio() deberá mostrar 
por consola que el microondas de consumo tal emite 40dB.
 */
public class Microondas extends Electrodomestico implements Silencioso, Comparable {

    private double potenciaMaxima;

    public Microondas(double potenciaMaxima, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMaxima = potenciaMaxima;
    }

    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(double potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    @Override
    public String toString() {
        return "Microondas{" + "potenciaMaxima=" + potenciaMaxima + '}';
    }

    @Override
    public void silencio() {
        System.out.println("El microondas de consumo " + getConsumo() + " emite 40dB.");
    }

    @Override
    public int compareTo(Object o) {
        return 2;
    }

}
