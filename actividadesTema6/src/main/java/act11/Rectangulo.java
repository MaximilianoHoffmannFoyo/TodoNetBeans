
package act11;

public class Rectangulo extends Figura {

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }
    
    @Override
    public int calcularArea(){
        return this.getBase()*this.getAltura();
    }
}
