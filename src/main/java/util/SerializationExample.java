package util;

import com.google.gson.Gson;
import introduzione.Persona;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializationExample {
    private static final Logger LOGGER = Logger.getLogger(SerializationExample.class.getName());
    public static void main(String[] args) {

        // Oggetto da serializzare in formato json
        Persona persona = new Persona("Alice","Rossi",30);

        //Creazione Gson
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("person.json")){
            //serializza l'oggetto in formato JSON e
            // lo scrive sul file person.json
            gson.toJson(persona,writer);
            System.out.println("Serializzazione JSON completata");
        }
        catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Errore durante la serializzazione JSON", e);
        }
    }
}
