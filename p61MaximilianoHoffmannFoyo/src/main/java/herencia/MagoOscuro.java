package herencia;
//Clase B
/*MagoOscuro es un tipo general de mago pero más especifico que un Mago general,
Dado que todos tienen sombrero y dependiendo del tamaño de su sombrero tienen más o menos poder*/
public class MagoOscuro extends Mago {//oscuro de magia negra no del color de piel

    protected double tamanioSombrero;

    public MagoOscuro() {
    }

    public MagoOscuro(String nombre, String Barita, double tamanioSombrero) {
        super(nombre, Barita);
        this.tamanioSombrero = tamanioSombrero;
    }

    //Metodo sobreescrito del metodo abstracto de la superClase
    @Override
    public String saberTipoMago() {//método polimórfico
        return "Es un mago oscuro";
    }

    //metodo unico de la clase B
    public void aumentarTamanioSombrero(double aumento) {
        this.tamanioSombrero += aumento;
    }

    //metodo B2 que se va a sobreescribir en la clase D(chaman)
    public void saberTamamioSombrero() {//método polimórfico
        System.out.println("Tamaño del sombrero del Mago Oscuro" + this.tamanioSombrero);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.tamanioSombrero) ^ (Double.doubleToLongBits(this.tamanioSombrero) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MagoOscuro other = (MagoOscuro) obj;
        return Double.doubleToLongBits(this.tamanioSombrero) == Double.doubleToLongBits(other.tamanioSombrero);
    }

    //toString con información de la superclase
    @Override
    public String toString() {//método polimórfico
        return super.toString() + "MagoOscuro{" + "tamanioSombrero=" + tamanioSombrero + "}\n";
    }

    public double getTamanioSombrero() {
        return tamanioSombrero;
    }

    public void setTamanioSombrero(double tamanioSombrero) {
        this.tamanioSombrero = tamanioSombrero;
    }

}
