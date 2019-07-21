package containers;

import java.util.*;

public class Containers {
    public static void main(String... args) {
        // kontenery typowane
//        ApplesAndOragnesWithoutGenerics.test(); // generuje błąd
        ApplesAndOrangesWithGenerics.test();

        // Zadanie
        // Utworzyć kolekcję typu ArrayList przechowującą
        // obiekty klasy String.
        // Wypełnić kolekcję dowolnymi Stringami.
        // Wypisać zawartość tej kolekcji.
        ArrayList<String> collection = new ArrayList<String>();
        collection.add("Ala");
        collection.add("ma");
        collection.add("kota");
        for (String c: collection) {
            System.out.println(c); // możemy skorzystać z pętli
            // typu foreach
        }
        System.out.println(collection); // lub też możemy to
        // println przekazać całą kolekcję

        // Dodawanie grup obiektów
//         Collections.addAll();
//         Arrays.asList();

        // Przykład
        AddingGroups.test();

        // Zadanie stworzyć kolekcję Stringów typu ArrayList
        // i wypełnić ją za pomocą metod Arrays.asList
        // oraz Collections.addAll().

        PrintingContainers.test();
        ListFeatures.test();
        Iterators.test();
        LinkedListFeatures.test();

        // Zadanie 1
        // Stworzyć klasę, zawierającą metodę, która będzie
        // tworzyła histogram wystąpień liter w Stringu
        // podanym jako argument i go wypisać

        // Zadanie 2
        // Stworzyć klasę, zawierającą metodę, która będzie
        // tworzyła histogram wystąpień SŁÓW zawierających
        // poszczególne litery alfabetu w Stringu
        // podanym jako argument.
        // Wypisać literę, liczbę wystąpień oraz
        // słowa zawierającę tę literę
        // Przykład:
        // INPUT: "A BB CD AD AFD"
        // OUTPUT: "A: 3 [A, AD, AFD]
        //          B: 1 [BB]
        //          C: 1 [CD]
        //          D: 3 [CD, AD, AFD]
        //          F: 1 [AFD]
        Map<String, Set<String>> hist = ContainersExcercise1.getInfo(
                "A BB CD AD AFD");
        System.out.println(hist);
        for (String s: hist.keySet()) {
            Set set = hist.get(s);
            System.out.print(s + ": " + set.size() + " ");
            System.out.println(set);
        }

        // Zadanie domowe 1
        // Stworzyć metodę, która zwraca mapę, zawierającą
        // informację o liczbie samogłosek występujących
        // w poszczególnych słowach ciągu wejściowego oraz
        // listę, takich słów. Kluczami mapy powinny być
        // samogłoski występujące w tym ciągu znaków.
        // Przykład:
        // INPUT: "ALA MA KOTA"
        // OUTPUT: "A: 3 {ALA=2, MA=1, KOTA=1}
        //          O: 1 {KOTA=1}
        // Map<String, Map<String, Integer>>
    }
}
