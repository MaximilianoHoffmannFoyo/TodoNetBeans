package ejercicio4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        ArrayList<Precipitaciones> precipitaciones = mapeador.readValue(new File("precipitacionesBadajoz.json"),
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Precipitaciones.class));
        for (Precipitaciones precipitacion : precipitaciones) {
            System.out.println(precipitacion);
        }

    }

}
