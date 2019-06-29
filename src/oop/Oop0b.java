package oop;

public class Oop0b extends Oop0 {

//    public Oop0b() {
//        System.out.println("Oop0b");
//    }

    public Oop0b(int a) {
        System.out.println("Oop0b");
    }

//    public void a() {
//        System.out.println("OK");
//    }
    public static void foo() {
        System.out.println("Packages1.foo");
    }

    public void a(int b) {
        System.out.println("OK");
    }


//    @Override
    /**
     * upewniamy się, że mamy przesłonięcie, a nie przeciążenie
     */
    public void a(float g) {
        System.out.println("OK");
    }

    /**
     * upewniamy się, że mamy przesłonienie, a nie przeciążenie
     */
    public void a(int c, int d) {
        System.out.println("OK");
    }
}
