package oop;

public class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Pochodna wersja staticGet()";
    }

    public String dynamicGet() {
        return "Pochodna wersja dynamicGet()";
    }
}
