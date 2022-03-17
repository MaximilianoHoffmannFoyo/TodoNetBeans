
package act11;

public class Triangulo extends Figura {

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        super(base, altura);
    }
    
    @Override
    public int calcularArea(){
        return (this.getBase()*this.getAltura())/2;
    }
}
