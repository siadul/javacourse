package oop3;

public class ZadanieStaticClass {
    static class ZadanieStaticClassInner {
        public void show() {
            System.out.println("Hello from ZadanieStaticClassInner");
        }
    }
    // koniec zadania

    // dla porównania klasa wewnętrzna niestatyczna
    class ZadanieNonStaticClassInner {
//        static int x; // klasy wewnętrzne niestatyczne
        // nie mogą zawierać statycznych elementów
        public void show() {
            System.out.println("Hello from ZadanieNonStaticClassInner");
        }
    }

    // dlaczego ta metoda nie może być statyczna?
    // ponieważ zwraca obiekt klasy niestatycznej wewnętrznej,
    // gdybym wywołał metodę na rzecz klasy a nie obiektu to
    // wówczas nie zostałby stworzony obiekt klasy zewnętrznej
    public ZadanieNonStaticClassInner produceZadanieNonStaticClassInner() {
        return new ZadanieNonStaticClassInner();
    }

    // metoda statyczna może zwracać obiekt klasy niestatycznej
    // (ale nie wewnętrznej)
    public static String aa() {
        return new String();
    }

    // klasy wewnątrz interfejsów
    public interface ClassInInterface {
        void howdy();
        void howdy2();

        static class Test implements ClassInInterface {
            @Override
            public void howdy() {
                howdy2();
                System.out.println("Jak leci?");
            }

            @Override
            public void howdy2() {
                System.out.println("Jak leci - howdy2?");
            }
        }

        static class Test2 { // static nie jest potrzebne
            public void howdy() {
//                howdy2(); // nie zadziała, nie ma łącznika
                System.out.println("Jak leci?");
            }
        }
    }


}
