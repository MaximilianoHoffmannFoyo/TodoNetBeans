package vehiculo;

public class Furgoneta extends Vehiculo {
    
    private int puertas;
    private boolean marchaAutomatica;
    private String tamanioMaletero;

    public Furgoneta(String matricula, String marca, String modelo, String color,
            int puertas, boolean marchaAutomatica, String tamanioMaletero) {
        super(matricula, marca, modelo, color);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
        this.tamanioMaletero = tamanioMaletero;
    }

    @Override
    public String toString() {
        return "2 - "+super.toString()+":" + puertas + ":" + marchaAutomatica + ":" + tamanioMaletero ;
    }
    
    
    
}
