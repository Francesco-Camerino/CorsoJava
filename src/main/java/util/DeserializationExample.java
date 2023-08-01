package util;

import com.google.gson.Gson;
import introduzione.Persona;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeserializationExample {
    private static final Logger LOGGER = Logger.getLogger(DeserializationExample.class.getName());
    public static void main(String[] args) {
        // Creazione di un oggetto Gson
        Gson gson = new Gson();

        try (FileReader fileReader = new FileReader("person.json")){
            //Deserializza l'oggetto da JSON
            // e ricostruiscilo come un oggetto java
            Persona persona = gson.fromJson(fileReader,Persona.class);
            System.out.println("Deserializzazione JSON completata.");
            persona.presentazione();
        }
        catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Errore durante la deserializzazione JSON", e);
        }
    }
}
