package oop;

public class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph przed draw()");
        draw(); // z typu pochodnego?
        System.out.println("Glyph() po draw()");
        // Wniosek!
        // Konstruktory nie powinny korzystać
        // z metod, które są przeznaczone
        // do dziedziczenia ponieważ, może to się wiązać
        // z trudno przewidywalnym zachowaniem.

        // Mogą korzystać z metod nieprzeznaczonych
        // do dziedziczenia (a zatem oznaczonym modyfikatorem
        // final), bądź z metod statycznych.

        // Generalnie Konstruktory powinny
        // zajmować się najprostszą inicjalizacją
        // obiektów, a wszelkie bardzie zaawansowane
        // rzeczy powinniśmy realizować w zwyczajnej
        // metodzie.
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius); // 1? 5?
    }
}