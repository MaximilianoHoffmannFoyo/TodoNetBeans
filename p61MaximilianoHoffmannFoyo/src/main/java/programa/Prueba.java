package programa;

import herencia.Chaman;
import herencia.Mago;
import herencia.MagoBlanco;
import herencia.MagoOscuro;
import java.util.ArrayList;
import java.util.Collections;

public class Prueba {

    public static void main(String[] args) {

        ArrayList<Mago> asociacion = new ArrayList<>();

        MagoBlanco magoBla1;
        MagoBlanco magoBla2;
        MagoOscuro magoOsc1;
        MagoOscuro magoOsc2;
        Chaman chaman1;
        Chaman chaman2;

        asociacion.add(magoBla1 = new MagoBlanco(10, "Rudeus", "Sauco"));//Conversion implicita
        asociacion.add(magoBla2 = new MagoBlanco(15, "Fedor", "Nieve"));//Conversion implicita
        asociacion.add(magoOsc1 = new MagoOscuro("Lucius", "Roble", 30.2));//Conversion implicita
        asociacion.add(magoOsc2 = new MagoOscuro("Arthur", "Abeto", 32.1));//Conversion implicita
        asociacion.add(chaman1 = new Chaman("rojo", "Rat", "Pino", 2));//Conversion implicita
        asociacion.add(chaman2 = new Chaman("Azul", "Gin", "Sauce", 25));//Conversion implicita

        Collections.sort(asociacion, (Mago c1, Mago c2) -> c1.getNombre().compareTo(c2.getNombre()));

        for (Mago mago : asociacion) {
            System.out.println(mago.toString());
        }

        for (Mago mago : asociacion) {
            if (mago instanceof MagoBlanco) {
                System.out.println(((MagoBlanco) mago).getTamanioBarba());//Conversion explicita
                ((MagoBlanco) mago).aumentarTamanioBarba(3); //Conversion explicita
                System.out.println(((MagoBlanco) mago).getTamanioBarba());//Conversion explicita
                System.out.println("\n");
            }

            if (mago instanceof MagoOscuro) {
                System.out.println(((MagoOscuro) mago).getTamanioSombrero());//Conversion explicita
                ((MagoOscuro) mago).aumentarTamanioSombrero(6.1); //Conversion explicita
                System.out.println(((MagoOscuro) mago).getTamanioSombrero());//Conversion explicita
                System.out.println("\n");
            }

            if (mago instanceof Chaman) {
                System.out.println(((Chaman) mago).getColorMagia());//Conversion explicita
                ((Chaman) mago).ponerMagiaANaranja(); //Conversion explicita
                System.out.println(((Chaman) mago).getColorMagia());//Conversion explicita
                System.out.println("\n");
            }
        }

        for (Mago mago : asociacion) {
            System.out.println(mago.saberTipoMago());
        }

    }

}
