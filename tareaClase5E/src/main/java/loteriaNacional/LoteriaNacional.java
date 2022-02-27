package loteriaNacional;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
Implementa en una estructura de tipo map un sistema de almacenamiento de números
de décimos de lotería nacional y su premio asociado.
Inserta en la estructura 1000 registros, inventando los números de los décimos y el premio asociado.
Ten en cuenta que el número de décimo debe contemplar ceros a la izquierda (09876, 00234, ...).

La aplicación debe ofrecer al usuario la posibilidad de consultar por número de 
décimo el premio obtenido.
 */
public class LoteriaNacional {

    private Map<String, String> loteria;

    public LoteriaNacional() {
        this.loteria = new HashMap<>();
    }

    public void rellenarPremios(int numeroPremios) {
        Random alet = new Random();
        for (int i = 0; i < numeroPremios; i++) {
            String n = alet.nextInt(10) + "" + alet.nextInt(10) + "" + alet.nextInt(10) + "" + alet.nextInt(10) + "" + alet.nextInt(10);
            String p = alet.nextInt(10000) + 1 + "€";
            loteria.put(n, p);
        }
    }

    public void mostrarContenido() {
        for (String key : loteria.keySet()) {
            System.out.printf("%s -- %s %n", key, loteria.get(key));
        }
    }

    public void consultarboleto(String n) {
        if (loteria.containsKey(n)) {
            System.out.println("Has ganado: " + loteria.get(n));
        } else {
            System.out.println("No has ganado nada");
        }
    }

//    public void prueba() {
//        loteria.put("11111", "5€");
//    }
}
