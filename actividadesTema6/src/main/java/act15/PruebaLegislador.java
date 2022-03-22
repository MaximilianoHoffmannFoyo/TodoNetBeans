package act15;

import java.util.ArrayList;

public class PruebaLegislador {

    /*Crea una lista de legisladores y muestra por pantalla la cámara 
en que trabajan haciendo uso del polimorfismo, así como sus datos haciendo uso del 
método polimórfico toString.
     */
    public static void main(String[] args) {
        
        ArrayList<Legislador> lista = new ArrayList<>();
        
        lista.add(new Diputado(1, "Malaga", "PP", "Covi", "09582464g", 40));
        lista.add(new Senador(10.5, "Malaga", "GG", "Dovi", "02432464t", 40));
        lista.add(new Diputado(2, "Malaga", "TT", "Tovi", "243513o", 40));
        lista.add(new Senador(10.5, "Malaga", "BB", "Bovi", "9673521l", 40));
        
        for (Legislador legislador : lista) {
            System.out.println(legislador.toString()+"\n"
                    + legislador.getCamaraEnQueTrabaja());
        }
        
    }
    
}
