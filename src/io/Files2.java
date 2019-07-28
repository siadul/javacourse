package io;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Files2 {

    public static void test() {
        Path pathIn = Paths.get("tekstdoprzeczytania.txt");

        // odczyt
        List<String> in = new ArrayList<String>();
        try {
            in = Files.readAllLines(pathIn);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(in);
        for (String line: in) {
            System.out.println("[" + line + "]");
        }

        // zapis
        List<String> out = new ArrayList<String>();
        String line1 = "tekst";
        String line2 = "do zapisania";
        out.add(line1);
        out.add(line2);

        Path pathOut = Paths.get("tekstdozapisania.txt");
        try {
            Files.write(pathOut, out);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

