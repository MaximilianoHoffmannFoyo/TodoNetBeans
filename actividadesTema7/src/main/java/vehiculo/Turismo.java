package act2;

public class Turismo extends Vehiculo {
    
    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(int puertas, boolean marchaAutomatica) {
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public Turismo(int puertas, boolean marchaAutomatica, String matricula, String marca, String modelo, String color, double tarifa) {
        super(matricula, marca, modelo, color, tarifa);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }
    
    @Override
    public String getAtributos(){
        String g = super.getAtributos();
        return g +" "+ this.puertas +" "+ this.marchaAutomatica;
    }
    
    
}
