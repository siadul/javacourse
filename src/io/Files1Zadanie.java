package io;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Files1Zadanie {

    public static void main(String args[]) {
        // Stworzyć plik plikiZadanie1.txt jeżeli nie istnieje
        // i dopisać do niego linię składającą się z
        // ciągu znaków utworzonych z 10 losowych znaków
        // alfanumerycznych

        String nazwaPliku = "files1zadanie.txt";
        dopiszDoPliku(nazwaPliku);
    }

    public static void dopiszDoPliku(String nazwaPliku) {
        try {
            FileWriter fileWriter = new FileWriter(
                    nazwaPliku, true);

            PrintWriter out = new PrintWriter(fileWriter);

            out.println(generateHash());


            out.close();
        } catch (IOException e) {
            System.out.println("Nie da się otworzyć pliku!");
        }
    }

    public static String generateHash() {
        String hash = ""; // 2 sposoby tablica znakow, albo do skutku
        while(true) {
            Random r = new Random();
            String f = "" + (char)(r.nextInt(500));
            if(f.matches("[a-zA-Z0-9]")) {
                hash += f;
            }
            if(10 == hash.length()) {
                break;
            }
        }

        return hash;
    }
}

