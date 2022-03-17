package act7;

public class Cheff extends Trabajador {

    // Único atributo propio de Camarero
    private String tamanioDeSombrero;

    public Cheff(String tamanioDeSombrero, String nombre, String apellido1, String NIF) {
        // Llamada al constructor de la superclase
        super(nombre, apellido1, NIF);
        this.tamanioDeSombrero = tamanioDeSombrero;
    }

    // Método propio de camarero
    public void hacerPlato() {
        System.out.println("Objeto Cheff: Cocina un plato");
    }

    // Se omite getRango y setRango
    @Override
    // Método sobrescrito
    public void cotizar() {
        System.out.println("Cotizando como Cheff");
    }
}
