package oop3;

public class Parcel11 {
    public int a;
    private static class ParcelContents implements Contents {
        private int i = 11;
        public int value() { return i; }
    }
    protected static class ParcelDestination implements Destination {
        private String label;
        private ParcelDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() {
//            System.out.println(a); // nie zadziała
            // klasy statyczne wewnętrzne (zagnieżdzone)
            // nie posiadają łącznika do klasy zewnętrznej!
//            Parcel11 p = Parcel11.this;

            return label;
        }

        public static void f() {} // klasy zagniedżone mogą
        // zawierać elementy statyczne

        static int x = 10;
        static class AnotherLevel {
            public static void f() {}
            static int x = 10;
        }

    }
    public static Destination destination(String s) {
        return new ParcelDestination(s); // tutaj mogę korzystać
        // z konstruktora, który jest prywatny w klasie wewnętrznej
    }
    public static Contents contents() {
        return new ParcelContents();
    }
}