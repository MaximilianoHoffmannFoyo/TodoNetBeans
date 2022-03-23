package herencia;
//Clase D
/*Chaman es un tipo espesifico de MagoOscuro en el cual 
predomina un color espesifico en su magia.*/
public class Chaman extends MagoOscuro {

    private String colorMagia;

    public Chaman() {
    }

    public Chaman(String colorMagia, String nombre, String Barita, double tamanioSombrero) {
        super(nombre, Barita, tamanioSombrero);
        this.colorMagia = colorMagia;
    }

    //metodo sobreescrito de la clase B(MagoOscuro)
    @Override
    public void saberTamamioSombrero() {//método polimórfico
        System.out.println("Tamaño del sombrero del Chaman" + this.tamanioSombrero);
    }

    //metodo unico de esta clase (clase D)
    public void ponerMagiaANaranja() {
        this.colorMagia = "naranja";
    }

    //toString con información de las superclases
    @Override
    public String toString() {//método polimórfico
        return super.toString() + "Chaman{" + "colorMagia=" + colorMagia + "}\n";
    }

    public String getColorMagia() {
        return colorMagia;
    }

    public void setColorMagia(String colorMagia) {
        this.colorMagia = colorMagia;
    }

}
