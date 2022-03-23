package herencia;
//Clase C
/*MagoBlanco es un tipo general de mago pero más especifico que un Mago general,
Dado que todos tienen barba y dependiendo del tamaño de su barba tienen más o menos poder*/
public class MagoBlanco extends Mago {//blanco de magia blanca no del color de piel

    private double tamanioBarba;

    public MagoBlanco() {
    }

    public MagoBlanco(double tamanioBarba, String nombre, String Barita) {
        super(nombre, Barita);
        this.tamanioBarba = tamanioBarba;
    }

    @Override//Metodo sobreescrito del metodo abstracto de la superClase
    public String saberTipoMago() {//método polimórfico
        return "Es un mago blanco";
    }

    //metodo unico de la clase C
    public void aumentarTamanioBarba(double aumento) {
        this.tamanioBarba += aumento;
    }

    //toString con información de la superclase
    @Override
    public String toString() {//método polimórfico
        return super.toString() + "MagoBlanco{" + "tamanioBarba=" + tamanioBarba + "}\n";
    }

    public double getTamanioBarba() {
        return tamanioBarba;
    }

    public void setTamanioBarba(double tamanioBarba) {
        this.tamanioBarba = tamanioBarba;
    }

}
