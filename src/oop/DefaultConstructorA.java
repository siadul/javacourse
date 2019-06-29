package oop;

public class DefaultConstructorA {
    // I sposob
//    public DefaultConstructorA() {
//        System.out.println("DefaultConstructorA(): ");
//    }

    // II sposob - super()

    // jeżeli nie ma żadnego konstrutkora
    // to tworzony jest konstruktor domyślny (bez argumentów)
    public DefaultConstructorA(int a) {
        System.out.println("DefaultConstructorA(int a): " + a);
    }
}
