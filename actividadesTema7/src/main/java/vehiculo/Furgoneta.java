package vehiculo;

public class Furgoneta extends Vehiculo {
    
    private int puertas;
    private boolean marchaAutomatica;
    private String tamanioMaletero;

    public Furgoneta(int puertas, boolean marchaAutomatica, String tamanioMaletero) {
        super();
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
        this.tamanioMaletero = tamanioMaletero;
    }

    @Override
    public String toString() {
        return super.toString()+", " + puertas + ", " + marchaAutomatica + ", " + tamanioMaletero ;
    }
    
    
    
}
