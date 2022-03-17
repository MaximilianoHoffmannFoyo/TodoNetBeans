package act8;

/*
8.- Suponiendo la siguiente clase:
public abstract class Azar{
protected int posibilidades;
public abstract int lanzar();
}
Crea la clase Dado, especialización de la clase Azar. El método lanzar() de la clase Dado devolverá un número aleatorio entre 1 y 6.
Crea la clase Moneda, especialización de la clase Azar. El método lanzar() de la clase Moneda devolverá un número aleatorio entre 1 y 2.
 */
public abstract class Azar {

    protected int posibilidades;

    public abstract int lanzar();
    
}
