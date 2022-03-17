package act8;

import java.util.Random;

/*
Crea la clase Dado, especialización de la clase Azar. El método lanzar() de la clase Dado devolverá un número aleatorio entre 1 y 6.
 */
public class Dado extends Azar{

    public Dado() {
    }
    
    public int lanzar(){
        Random r = new Random();
        return r.nextInt(6)+1;
    }
}
