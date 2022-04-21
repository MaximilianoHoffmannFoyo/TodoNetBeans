package vehiculo;

public class Turismo extends Vehiculo {
    
    private int puertas;
    private boolean marchaAutomatica;

//    public Turismo(int puertas, boolean marchaAutomatica) {
//        this.puertas = puertas;
//        this.marchaAutomatica = marchaAutomatica;
//    }

    public Turismo(String matricula, String marca, String modelo, String color,
            int puertas, boolean marchaAutomatica) {
        super(matricula, marca, modelo, color);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }
    
    @Override
    public String getAtributos(){
        String g = super.getAtributos();
        return g +" "+ this.puertas +" "+ this.marchaAutomatica;
    }

    @Override
    public String toString() {
        return "0 - "+super.toString()+":" + puertas + ":" + marchaAutomatica ;
    }
    
    
}
