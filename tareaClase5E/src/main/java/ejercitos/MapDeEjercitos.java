package ejercitos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
En una estructura map, asocia a cada objeto de tipo Ejercito un identificador único. 
Se deben poder guardar Ejércitos con sus identificadores asociados, obtener un Ejercito 
según su nombre y obtener todos los Ejércitos contenidos en la estructura map.
 */
public class MapDeEjercitos {
    
    private Map<String, Ejercito> mapDeEjercitos;

    public MapDeEjercitos() {
        this.mapDeEjercitos = new TreeMap<>();
    }
    
    public void mostrarContenido() {
        for (String key : mapDeEjercitos.keySet()) {
            System.out.printf("%s -- %s %n", key, mapDeEjercitos.get(key));
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
        MapDeEjercitos paises = new MapDeEjercitos();
        
        Ejercito espania = new Ejercito();
        Ejercito alemania = new Ejercito();
        Ejercito japon = new Ejercito();
        Ejercito inglaterra = new Ejercito();
        Ejercito noruega = new Ejercito();
        
        paises.mapDeEjercitos.put("1", espania);
        paises.mapDeEjercitos.put("2", alemania);
        paises.mapDeEjercitos.put("3", japon);
        paises.mapDeEjercitos.put("4", inglaterra);
        paises.mapDeEjercitos.put("5", noruega);
        
        paises.mostrarContenido();
    }
}
