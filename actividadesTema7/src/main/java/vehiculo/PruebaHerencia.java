
package act2;

public class PruebaHerencia {

    public static void main(String[] args) {
        
        Turismo v11 = new Turismo(4,true);
        Turismo v12 = new Turismo(4,false, "r432gw", "totota", "F3", "gris", 4.3);
        Deportivo v2 = new Deportivo(3, true,  true, "6654yyy", "Panda", "Alt", "gris", 4.3 );
        Furgoneta v3 = new Furgoneta(5, false, "Grande");
        
        System.out.println(v11.getAtributos());
        System.out.println(v3.getAtributos());
    }
    
}
