package oop3;

import java.util.Random;

public class Parcel8 {
    public Wrapping wrapping1(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }
    public Wrapping wrapping2(final int x, int y) {
//        x = 3;
        // Spostrzeżenie
        // zmienne, które wykorzystujemy w definicji
        // klasy anonimowej wewnętrznej, a które
        // pochodzą spoza obszaru tej definicji są zawsze finalne
        return new Wrapping(x, y) {
            public int field1 = 45;
            public int field2;
            {
                Random r = new Random(48);
                field2 = r.nextInt();
            }

            public int value() {
                return super.value() * x * y;
            }
        };
    }
}
