
package tareaclase5d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Aplica lo estudiado para realizar una nueva clase llamada Ejercito, 
que contenga un número de soldados N. El constructor debe inicializar 
la estructura SET (no hay soldados duplicados y el orden no importa). 
Debe haber métodos para:

1. Saber el número de soldados que hay.
2. Alistar a un solado.
3. Saber si el ejército no tiene soldados.
4. Saber si un soldado está en el ejército.
4. Sacar todos los soldados, en forma de ArrayList.
5. Desmatricular a un soldado del ejército.
 */
public class EjercitoOrdenado {
    
    private Set<Soldado> listasoldados;

    public EjercitoOrdenado() {
        this.listasoldados = new TreeSet<>();
    }
    
    public int numeroSoldados(){
        return listasoldados.size();
    }
    public void alistarSoldado(Soldado s){
        listasoldados.add(s);
    }
    public boolean tieneSoldados(){
        return !listasoldados.isEmpty();
    }
    public boolean siSoldadoEnEjercito(Soldado s){
        return listasoldados.contains(s);
    }
    public ArrayList devolverListaEnArrayList(){
        ArrayList<Soldado> array = new ArrayList<>();
        for (Soldado s : listasoldados) {
            array.add(s);
        }
        return array; 
    }    
    public void desmatricularSoldado(Soldado s){
        listasoldados.remove(s);
    }
}
