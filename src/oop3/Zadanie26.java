package oop3;

public class Zadanie26 {
    public void show2() {
        System.out.println("Zadanie26Inner.show2()");
    }

    class Zadanie26Inner {
        public void show() {
            System.out.println("Zadanie26Inner.show()");
        }

        Zadanie26Inner(int x) {
            System.out.println("Zadanie26Inner(int x)");

        }

        Zadanie26 getOuter() {
            return Zadanie26.this;
        }
    }
}

class Zadanie26e {
    class Zadanie26bInner extends Zadanie26.Zadanie26Inner {
        Zadanie26bInner(Zadanie26 zadanie26, int x) {
            zadanie26.super(x);
        }
        public void show2() {
            show();
            getOuter().show2();
        }
    }
}
