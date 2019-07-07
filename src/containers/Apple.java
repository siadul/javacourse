package containers;

import java.util.ArrayList;

public class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange {}

class ApplesAndOragnesWithoutGenerics {
    public static void test() {
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(((Apple) apples.get(i)).id());
        }
    }
}

class ApplesAndOrangesWithGenerics {
    public static void test() {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i=0; i<3; i++) {
            apples.add(new Apple());
        }
//        apples.add(new Orange()); // nie zadziała
        // Wniosek
        // Dzięki określeniu typu elementów kolekcji
        // Już na etapie kompilacji jesteśmy w stanie
        // wykryć próby powiększenia tej kolekcji
        // o elementy, które są niepoprawnych typów.

        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        // foreach
        for(Apple c: apples) {
            System.out.println(c.id());
        }

        System.out.println(apples);
    }
}



