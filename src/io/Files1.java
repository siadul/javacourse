package io;


import java.io.*;
import java.util.Scanner;

public class Files1 {

    public static void test() {
        String nazwaPliku = "tekst.txt";
        zapiszPlik(nazwaPliku);
        dopiszDoPliku(nazwaPliku);
        String s = odczytajZpliku("tekstdoprzeczytania.txt");
        System.out.println(s);
    }

    public static void zapiszPlik(String nazwaPliku) {
        try {
            PrintWriter out = new PrintWriter(nazwaPliku);
            out.println("Raz");
            out.println("Dwa");
            out.println("Trzy");
            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Nie da się utworzyć pliku!");
        }
    }

    public static void dopiszDoPliku(String nazwaPliku) {
        try {
            FileWriter fileWriter = new FileWriter(
                    nazwaPliku, true);

            PrintWriter out = new PrintWriter(fileWriter);
            out.print("Cztery");
            out.print("Pięć");
            out.print("Sześć");
            out.close();
        } catch (IOException e) {
            System.out.println("Nie da się otworzyć pliku!");
        }
    }

    public static String odczytajZpliku(String nazwaPliku) {
        File plikDane = new File(nazwaPliku);
        String odczyt = "";
        try {
            Scanner skaner = new Scanner(plikDane);
            while(skaner.hasNextLine()) {
                odczyt = odczyt + skaner.nextLine() + "ENDLINE\n";
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
        }

        return odczyt;
    }
}

