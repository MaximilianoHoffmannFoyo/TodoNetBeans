
package vehiculo;

public class PruebaHerencia {

    public static void main(String[] args) {
        
//        Turismo v11 = new Turismo(4,true);
        Turismo v12 = new Turismo("6574nb", "totota", "F3", "gris",4 ,false);
        Deportivo v2 = new Deportivo("6654yyy", "Panda", "Alt", "gris",3, true,  true);
        Furgoneta v3 = new Furgoneta("6654yyy", "citroen", "C44", "blanco", 1, true, "pequeño");
        
//        System.out.println(v11.toString());
        System.out.println(v12.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
    }
    
}
