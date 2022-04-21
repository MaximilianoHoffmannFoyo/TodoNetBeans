package vehiculo;

public class Deportivo extends Vehiculo{
    
    private int puertas;
    private boolean marchaAutomatica;
    private boolean techo;

    public Deportivo(String matricula, String marca, String modelo, String color,
            int puertas, boolean marchaAutomatica, boolean techo) {
        super(matricula, marca, modelo, color);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
        this.techo = techo;
    }
    
    public void pruevaDeportivo(){}

    @Override
    public String toString() {
        return "1 - "+super.toString()+":" + puertas + ":" + marchaAutomatica + ":" + techo;
    }
    
    
}
