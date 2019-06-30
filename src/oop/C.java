package oop;

public class C {
    public A a;
    public C(A a) {
        this.a = a;
    }
    public void showA() {
        System.out.println("ShowA:");
        System.out.println(a.name);
        a.showName(); // polimorfizm!!!
        // Wniosek
        // polimorfizm dotyczy wyłącznie metod!
        // nie działa dla pól
    }
}
