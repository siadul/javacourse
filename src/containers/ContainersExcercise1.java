package containers;

import java.util.*;

public class ContainersExcercise1 {
    // Zadanie 2
    // Stworzyć klasę, zawierającą metodę, która będzie
    // tworzyła histogram wystąpień SŁÓW zawierających
    // poszczególne litery alfabetu w Stringu
    // podanym jako argument.
    // Wypisać literę, liczbę wystąpień oraz
    // słowa zawierającę tę literę
    // Przykład:
    // INPUT: "A BB CD AD AFD"
    // OUTPUT: "A: 3 (A, AD, AFD)
    //          B: 1 (BB)
    //          C: 1 (CD)
    //          D: 2 (CD, AD, AFD)
    //          F: 1 (AFD)

    public static Map<String, Set<String>> getInfo(String input) {
        System.out.println(input);
        String[] wordsFromInput = input.split(" ");
        Map<String, Set<String>> map =
                new HashMap<String, Set<String>>();
        for(String w: wordsFromInput) {
            char[] wordChars = w.toCharArray();
            for(char wc: wordChars) {
                Set<String> words = map.get(
                        Character.toString(wc));
                if(null == words) {
                    words = new HashSet<>();
                    words.add(w);
                    map.put(Character.toString(wc), words);
                } else {
                    words.add(w);
                }
            }
        }

        return map;
    }
}