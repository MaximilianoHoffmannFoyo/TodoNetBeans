package act12y13;

import act11.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Act13 {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        ArrayList<App> apps = mapeador.readValue(new File("./appsjson/aplicacionesjson.json"),
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, App.class));
        for (App app : apps) {
            System.out.println(app);
        }

    }
}
