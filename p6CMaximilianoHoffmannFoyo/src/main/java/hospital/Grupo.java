package hospital;

public enum Grupo {

    C(17.5),
    D(18),
    E(18.5);

    private final double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }

}
