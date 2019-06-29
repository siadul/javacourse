package oop;

public class Oop0 {
//    public Oop0() {
//        System.out.println("Oop0");
//    }

//    public Oop0(int a) {
//        System.out.println("Oop0");
//    }

    public static void main(String... args) {
        Oop0 o0 = new Oop0();
        o0.a();

        Oop0b o0b = new Oop0b(4);
        o0b.a();
        o0b.a(4);
//        o0b.super.a();
    }
    public void a() {
        System.out.println("OK");
    }
    public static void foo() {
        System.out.println("Packages1.foo");
    }
}
