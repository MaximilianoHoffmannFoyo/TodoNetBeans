package ejercicio1;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> cartas = new ArrayList<>();
    private static String[] palos = {"picas", "diamantes", "tréboles", "corazones"};
    private static String[] figuras = {"J", "Q", "K", "A"};

    public Baraja() {
        Carta carta;
        for (int j = 0; j < 4; j++) {
            for (int i = 2; i < 11; i++) {
                carta = new Carta(i + "", palos[j]);
                cartas.add(carta);
            }
            for (int i = 0; i < 4; i++) {
                carta = new Carta(figuras[i], palos[j]);
                cartas.add(carta);
            }
        }
    }

    public void imprimirBaraja() {
        for (int i = 0; i < this.cartas.size(); i++) {
            System.out.println(this.cartas.get(i).toString());
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public static String[] getPalos() {
        return palos;
    }

}
