package ejercicio5;

import ejercicio4.Precipitaciones;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Metodos {

    public static Map<String, Double> metodoA(ArrayList<Precipitaciones> precip) {
        Map<String, Double> mapa = new TreeMap<>();

        for (Precipitaciones precipitaciones : precip) {
            mapa.put(precipitaciones.getEstacionMeteorologica(), precipitaciones.getPrecipitacion());
        }
        return mapa;
    }

    public static void metodoB(ArrayList<Precipitaciones> precip) {
        precip.stream().filter(p -> p.getFecha().get(0).equals(2017))
                .filter(p -> p.getFecha().get(1).equals(10))
                .filter(p -> p.getFecha().get(2) <= 20)
                .filter(p -> p.getFecha().get(2) >= 10)
                .forEach(System.out::println);
    }
}
