package ejercicio1;

/*
 */
public enum CategoriaEmpleado {

    INICIAL("Categoría Básica", 50.0),
    MEDIA("Categoría Media", 70.0),
    AVANZADA("Categoría profesional", 100.0);

    private final String nombre;
    private final double complemento;

    private CategoriaEmpleado(String nombre, double complemento) {
        this.nombre = nombre;
        this.complemento = complemento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getComplemento() {
        return complemento;
    }

    public static CategoriaEmpleado getINICIAL() {
        return INICIAL;
    }

    public static CategoriaEmpleado getMEDIA() {
        return MEDIA;
    }

    public static CategoriaEmpleado getAVANZADA() {
        return AVANZADA;
    }

    @Override
    public String toString() {
        return "CategoriaEmpleado{" + "nombre=" + nombre + ", complemento=" + complemento + '}';
    }

}
