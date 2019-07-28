package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Path pathIn = Paths.get("literki.txt");
        List<String> in = new ArrayList<String>();
        try {
            in = Files.readAllLines(pathIn);
        } catch (IOException e) {
            System.out.println("Nie udało się otworzyć pliku!");
        }
        System.out.println(in);

        final int asciiSize = 256;
        int[] result = new int[asciiSize];
        Arrays.fill(result, 0); // lub foreach
        // 0 - 0
        // 1 - 0
        // 2 - 0
        // ...
        // 255 - 0

        for (String line: in) {
            char[] chars = line.toCharArray();
            for (char ch: chars) {
                int charCode = (int)ch;
                System.out.print(ch);
                System.out.println(charCode);
                if(charCode > 0 && charCode < asciiSize) {
                    result[charCode]++;
                }

            }
        }

        List<String> out = new ArrayList<String>();
        Path pathOut = Paths.get("hist.txt");
        out.add(Arrays.toString(result));
        try {
            Files.write(pathOut, out);
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać pliku!");
        }

        // zapisywanie zamienionego tekstu
        //Zamień miejscami dwa najczęściej występujące w tekście znaki i zapisz cały zmieniony ciąg znaków
        //do pliku zamiana.txt

        // znajdź 2 najczęsciej wystepujace znaki
        List<String> out2 = new ArrayList<String>();

        int max1 = 0;
        int max2 = 0;
        int maxCode1 = 0;
        int maxCode2 = 0;
        for (int i=0; i<asciiSize; i++) {
            if(result[i] > max1) {
                max1 = result[i];
                maxCode1 = i;
            }
        }
        for (int i=0; i<asciiSize; i++) {
            if(i == maxCode1) {
                continue;
            }
            if(result[i] > max2) {
                max2 = result[i];
                maxCode2 = i;
            }
        }
        System.out.println(maxCode1);
        System.out.println(maxCode2);

        for (String line: in) {
            char[] chars = line.toCharArray();
            String str = "";
            for (char ch: chars) {
                int charCode = (int)ch;
                if(charCode == maxCode1) {
                    ch = (char) maxCode2;
                } else if(charCode == maxCode2) {
                    ch = (char) maxCode1;
                }
                str += ch;
            }
            out2.add(str);
        }

        Path pathOut2 = Paths.get("zamiana.txt");
        out.add(Arrays.toString(result));
        try {
            Files.write(pathOut2, out2);
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać pliku!");
        }

        // wspak
        File plikDane = new File("literki.txt");
        String odczyt = "";
        try {
            Scanner skaner = new Scanner(plikDane);
            while(skaner.hasNextLine()) {
                String line = skaner.nextLine();
                char[] chars = line.toCharArray();
                for(char c: chars) {
                    odczyt = c + odczyt;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
        }

        System.out.println(odczyt);

        List<String> out3 = new ArrayList<String>();
        Path pathOut3 = Paths.get("wspak.txt");
        out3.add(odczyt);
        try {
            Files.write(pathOut3, out3);
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać pliku!");
        }


    }
}
