package oop3;

public class WithInner {
    class Inner {}
}

class InheritInner extends WithInner.Inner {
    // Spostrzeżenie
    // Musimy dodać wywołanie konstruktora dla klasy
    // zewnętrznej klasy wewnętrznej po której dziedziczymy
    // ponieważ obiekt klasy zewnętrznej musi być stworzony
    // zanim przejdziemy do tworzenia obiektu klasy wewenętrznej
    InheritInner(WithInner wi) {
        wi.super();
    }

    public void show() {
        System.out.println("Hello from InheritInner which extends WithInner.Inner");
    }
}
