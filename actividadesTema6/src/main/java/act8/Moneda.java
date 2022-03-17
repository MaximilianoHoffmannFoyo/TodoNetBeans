package act8;

import java.util.Random;

/*
Crea la clase Moneda, especialización de la clase Azar. El método lanzar() de la clase Moneda devolverá un número aleatorio entre 1 y 2.
 */
public class Moneda extends Azar{

    public Moneda() {
    }
    
    public int lanzar(){
        Random r = new Random();
        return r.nextInt(2)+1;
    }
}
