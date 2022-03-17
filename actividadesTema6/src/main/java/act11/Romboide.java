package act11;

public class Romboide extends Figura {

    public Romboide() {
    }

    public Romboide(int base, int altura) {
        super(base, altura);
    }
    
    @Override
    public int calcularArea(){
        return this.getBase()*this.getAltura();
    }
}
