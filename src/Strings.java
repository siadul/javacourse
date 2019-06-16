import packages.Packages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Strings extends Object {


    public static void main(String... args) throws IOException {
//        przyklad1();
//        zadanie1();
//        przyklad2();
        przyklad3();
//        Packages p;
    }

    public static void przyklad1() {
        // Sczytywanie danych z klawiatury
        // Przykład
        // chcemy pobrać dane wejściowe jako
        // 2 liczby i wypisać ich sumę
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        System.out.print("Podaj a: ");
        double a = 0;
        try {
            a = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("a musi być liczbą!");
//            e.printStackTrace();
        }

        System.out.print("Podaj b: ");
        double b = 0;
        try {
            b = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("b musi być liczbą!");
//            e.printStackTrace();
        }

        System.out.println("a + b = " + (a + b));
    }

    public static void zadanie1() {
        // ZADANIE
        // Napisać program, który pobiera dane z klawiatury
        // dopóki użytkownik nie wpisze "exit".
        // Przy każdym wpisaniu danych dodajemy String
        // wejściowy do tablicy Stringów.
        // Na końcu działania (po wpisaniu exit)
        // wyświetlamy tablicę Stringów wpisanych przez usera
        BufferedReader br2 = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        String inp = "";
        int n = 100;
        String [] inpArr = new String[n];
        int i = 0;
        do {
            System.out.print("wpisz string[" + i + "]: ");
            try {
                inp = br2.readLine();
                inpArr[i] = inp;
            } catch (IOException e) {
                System.out.println(
                        "Wystąpił błąd wejścia/wyjścia");
            }
        } while(!"exit".equals(inp) && ++i < n);

        System.out.println(
                Arrays.toString(inpArr)
        );
    }

    public static void przyklad2() throws IOException {
        String q = "Jak leci?";
        System.out.println(q);
        String q2 = q.toUpperCase();
        System.out.println(q2);

        // WNIOSEK
        // Obiekty klasy String są Immutable (niemutowalne)
        // To znaczy, że metody operujące na tych obiektach
        // zwracają nowy egzemplarz (obiekt) tej klasy.

        // length - liczba znaków w stringu
        System.out.println(q2.length());

        // konkatenacja - łączenie stringów
        String q3 = q.concat(q2);
        String q4 = q + q2;
        System.out.println(q3);
        System.out.println(q4);

        // format
        String q5 = String.format(
                "Float %f, integer %d, string %s",
                45.23, 34, "Str1");
        String q6 = String.format(
                "Float %.4f",45.23);
        String q7 = String.format(
                "scientific notation %e",10005.23);
        String q8 = String.format(
                "octal integer %o",9);
        String q9 = String.format(
                "hex %x",27);
        String q10 = String.format(
                "hex %X",27);

        String q11 = String.format("|%20d|", 92);
        String q12 = String.format("|%5.1f|", 45.0333);
        String q13 = String.format("|%020d|", 92);
        String q14 = String.format("|%-20d|", 92);
        String q15 = String.format("|%+20d|", 92);
        String q16 = String.format("|%,d|", 100000000);
        String q17 = String.format("|%20s|", "test");
        String q18 = String.format("|%-20s|", "test");
        String q19 = String.format("|%.3s|", "test");
        String q20 = String.format("|%-20.3s|", "test");
        String q21 = String.format("jakiś tekst" +
                "%2$s dalszy tekst %1$s", "test", 45);

        System.out.println(q5);
        System.out.println(q6);
        System.out.println(q7);
        System.out.println(q8);
        System.out.println(q9);
        System.out.println(q10);
        System.out.println(q11);
        System.out.println(q12);
        System.out.println(q13);
        System.out.println(q14);
        System.out.println(q15);
        System.out.println(q16);
        System.out.println(q17);
        System.out.println(q18);
        System.out.println(q19);
        System.out.println(q20);
        System.out.println(q21);

        // Zadanie
        // 1. Wypisać liczbe sczytaną z klawiatury
        // na minium 8 znakach, z czego 3 po przecinku
        // brakujące znaki powinny być uzupełnione od końca
        // Przykład
        // 3.45
        // |3.450   |
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        double q22 = Double.parseDouble(br.readLine());
        System.out.println();
        System.out.println(
                String.format("|%-8.3f|", q22)
        );
        System.out.format("|%-8.3f|", q22); // ekwiwalent
    }

    public static void przyklad3() {
        String s = "jakiś ciąg znaków";
        System.out.println(
                s.charAt(4)
        );

        // porównywanie stringów
        String s1 = "aa";
        String s2 = "ab";
        System.out.println(
                s1.equals(s2)
        );
        System.out.println(
                s1.compareTo(s2)
        );
        System.out.println(
                s2.compareTo(s1)
        );
        System.out.println(
                s1.compareTo(s1)
        );

        String s3 = "aa";
        String s4 = "aA";
        System.out.println(
                s3.compareToIgnoreCase(s4)
        );
        System.out.println(
                s4.compareToIgnoreCase(s3)
        );

        // endsWith/startsWith
        String s5 = "jakiś tekst";
        System.out.println(
                s5.endsWith("tekst")
        );
        System.out.println(
                s5.startsWith("jakiś")
        );

        // indexOf
        System.out.println(
                s5.indexOf("tekst")
        );
        // zwraca pozycję w stringu wejściowym
        // od której zaczyna się podciąg podany jako
        // argument
        // jeżeli nie istnieje - zwrócona jest wartość -1
        System.out.println(
                s5.indexOf('t')
        );
        System.out.println(
                "tekst tekst".indexOf('t')
        );
        System.out.println(
                "indexOf with fromIndex param: "
                        + "tekst tekst".indexOf('t', 2)
        );
        System.out.println(
                s5.lastIndexOf('t')
        );
        String s6 = "tekst jakiś tekst";

        System.out.println(
                s6.lastIndexOf("tekst")
        );

        // substring
        System.out.println(
                s6.substring(5)
        );
        System.out.println(
                s6.substring(6, 9)
        );

        System.out.println(
                s6.toUpperCase()
        );
        System.out.println(
                s6.toLowerCase()
        );
        System.out.println(
                "     białe znaki przed i po     ".trim()
        );
        char[] chars = "abcdefghijklmnopqrstuwvxyz".toCharArray();
        System.out.println(
                Arrays.toString(chars)
        );

        // getChars
        String s7 = "Jakiś długi tekst";
        char[] cha = new char[8];
        s7.getChars(2, 9, cha, 1);
        System.out.println(
                Arrays.toString(cha)
        );

        // replace
        System.out.println(
                s7.replace('t', 'T')
        );
        System.out.println(
                s7.replaceFirst("([t])", "'$1'")
        );
        System.out.println(
                "prefix tekst suffix"
                        .replaceFirst("(.*)(tekst)(.*)",
                                "|$1|, ;$2;, '$3'")
        );
        System.out.println(
                "xyz xyz".replaceFirst("xyz","abc")
        );
        System.out.println(
                "xyz xyz".replaceAll("xyz","abc")
        );

        // split
        System.out.println(
                Arrays.toString("abc def ghi".split(" "))
        );

        System.out.println(
                Arrays.toString("abc_def+ghi".split("[_+]"))
        );
        System.out.println(
                Arrays.toString("abc_def+ghi".split("[_+]", 2))
        );
        System.out.println(
                "abc_def+ghi".matches("abc_def_ghi")
        );
        System.out.println(
                "abc_def+ghi".matches("abc.def.ghi")
        );

        System.out.println(
                Arrays.toString(
                        "abc_def+ghi".getBytes()
                )
        );

        // klasa StringBuilder - jezeli mamy do czynienia z duża
        // ilością operacji na stringach, wydajniej używac tej klasy
        String s9 = "tekst1";
        String s10 = "tekst2";
        String s11 = s9 + s10 + s9;
        // klasa jest mutowalna, a to oznacza, że wywoływanie metod
        // na rzecz obiektów tej klasy modyfiuje stan tych obiektów

        StringBuilder stringBuilder = new StringBuilder("compile ");
        System.out.println("string = " + stringBuilder);
        stringBuilder.append(true);
        System.out.println("After append = " + stringBuilder);

        stringBuilder = new StringBuilder("abcd ");
        System.out.println("string = " + stringBuilder);

        stringBuilder.append("sufix");

        System.out.println("After append = " + stringBuilder);
        System.out.println(stringBuilder.charAt(5));
        System.out.println(stringBuilder.deleteCharAt(5));
        System.out.println(stringBuilder.delete(1, 3));
        // indexOf
        System.out.println(stringBuilder.insert(1, "test"));
        stringBuilder.setLength(3);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        // Zadanie
        // Korzystając z metody StringBuilder zbudować
        // łańcuch znaków "StringBuilder excercise"
        // następnie usunąć w nim wszystkie wystąpienia literki 'e'
        StringBuilder sb = new StringBuilder("StringBuilder excercise");

        String ss = "e";
        while (sb.indexOf(ss) != -1) {
            sb.deleteCharAt(sb.indexOf(ss));
        }
    }
}
