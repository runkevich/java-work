package com.gmail.runkevich8.Task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (
                FileWriter writer = new FileWriter("D:\\Учеба-курсы\\notes3.txt", false))

        {

            String text = "Мама мыла раму, раму мыла мама";
            writer.write(text);
            writer.append('\n');
            writer.append('E');
            writer.flush();
        } catch (IOException ex)

        {
            System.out.println(ex.getMessage());
        }


        try (FileReader reader = new FileReader("D:\\Учеба-курсы\\notes3.txt")) {

            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

