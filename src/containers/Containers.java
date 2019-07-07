package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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



    }
}
