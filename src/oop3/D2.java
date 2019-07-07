package oop3;

public class D2 {
    public void showD2() {
        System.out.println("Hello from D2");
    }
}

abstract class E2 {
    public void showE2() {
        System.out.println("Hello from E2");
    }
}

abstract class E2Z extends E2 {
    public abstract Z3 getZ();
}

class Z3 extends D2 {
    E2Z makeE() {
        return new E2Z() {
            public Z3 getZ() {
//                Z3.this.showD2(); // mamy dostęp do metod z klasy Z3, D2 oraz E2
//                showD2();
//                showE2();

                return Z3.this;
            }
        }; // magic! anonimowa klasa wewnętrzna
        // posiada dostęp do elementów klasy zewnętrznej oraz
        // dziedziczy po innej klasie
    }
}
