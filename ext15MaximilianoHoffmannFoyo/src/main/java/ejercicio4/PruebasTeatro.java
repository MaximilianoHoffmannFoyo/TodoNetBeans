package ejercicio4;

public class PruebasTeatro {

    public static void main(String[] args) {

        Teatro T1 = new Teatro(20, 20);

        T1.imprimirTeatro();

        System.out.println("----------------");
        T1.reservarAsiento(1, 1);
        T1.reservarAsiento(1, 3);
        T1.reservarAsiento(1, 5);
        T1.reservarAsiento(1, 2);
        T1.reservarAsiento(1, 0);
        T1.imprimirTeatro();

        System.out.println("----------------");
        T1.cancelarReservaAsiento(1, 1);
        T1.cancelarReservaAsiento(0, 0);
        T1.cancelarReservaAsiento(1, 2);
        T1.cancelarReservaAsiento(2, 1);
        T1.cancelarReservaAsiento(1, 5);
        T1.imprimirTeatro();
    }

}
