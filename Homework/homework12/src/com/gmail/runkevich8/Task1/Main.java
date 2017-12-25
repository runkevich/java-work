package com.gmail.runkevich8.Task1;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.runkevich8.Task1.entity.Root;

import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            File json = new File("test.json");
            Root cricketer = mapper.readValue(json, Root.class);
            System.out.println("Java object created from JSON String :");
            System.out.println(cricketer);
        } catch (JsonGenerationException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
