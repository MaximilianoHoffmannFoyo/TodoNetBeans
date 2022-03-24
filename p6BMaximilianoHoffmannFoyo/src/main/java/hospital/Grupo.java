package hospital;

public enum Grupo {
    
    C(1),
    D(2),
    E(3);
    
    private final double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }
    
    
}
