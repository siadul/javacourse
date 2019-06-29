package oop;

public class Iphone extends Phone {
//    public String name = "phone";

    /*public Iphone() {
//        super();
        name = "iphone";
    }*/


    public void showName() {
        System.out.println("Iphone");
    }

    public void showName(int a) {
        System.out.println("Iphone " + a);
    }

    public Iphone(String name) {
        super(name);
        System.out.println("Iphone(String name)");

        // Wniosek
        // Klasy dziedziczące (potomkowie)
        // muszą w konstrutkorach
        // "potrafić" stworzyć wpierw obiekt
        // z klasy po której dziedziczą.

        // Czyli w konstrutkorze sparametryzowanym
        // musza mieć jako pierwszą instrukcję kodu
        // odwołanie do konstruktora z klasy bazowej
        // bądź w klasie bazowej musi istnieć jawnie
        // zdefiniowana wersja konstruktora domyślnego
        // (bez argumentów)

        // Zadanie
        // Proszę utworzyć 2 klasy, które posiadają
        // sparametryzowane konstruktory
        // Jedna z nich dziedziczy po drugiej klasie.
        // Następnie utworzyć obiekty tych klas.


        // Dziedziczenie metod


    }
}
