package ejercicio5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ejercicio4.Precipitaciones;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        ArrayList<Precipitaciones> precipitaciones = mapeador.readValue(new File("precipitacionesBadajoz.json"),
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Precipitaciones.class));

        Map<String, Double> mapa = Metodos.metodoA(precipitaciones);

        for (String key : mapa.keySet()) {
            System.out.printf("%s -- %s %n", key, mapa.get(key));
        }

    }

}
