package ejercicio2;

import ejercicio1.Carta;
import java.util.ArrayList;

public class Ronda {

    private ArrayList<Carta> cartas = new ArrayList<>();

    public Ronda() {
    }

    public Ronda(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void imprimirRonda() {
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
}
