package vehiculo;

public class Deportivo extends Vehiculo{
    
    private int puertas;
    private boolean marchaAutomatica;
    private boolean techo;

    public Deportivo(int puertas, boolean marchaAutomatica, boolean techo, String matricula, String marca, String modelo, String color, double tarifa) {
        super(matricula, marca, modelo, color, tarifa);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
        this.techo = techo;
    }
    
    public void pruevaDeportivo(){}

    @Override
    public String toString() {
        return super.toString()+", " + puertas + ", " + marchaAutomatica + ", " + techo;
    }
    
    
}
