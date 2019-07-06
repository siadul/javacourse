package oop3;

public class OuterClass {
    public String field1 = "OuterClass.f1";
    public void foo1() {
        System.out.println("OuterClass.foo1");
    }

    public InnerClass inner() {
        return new InnerClass();
    }

    class InnerClass {
        public void foo1Inner() {
            System.out.println("field1: " + field1);
            foo1();
        }

        public OuterClass outer() {
//            return this; // samo this przechowuje referencję
            // do obiektu klasy wewnętrznej natomiast jeżeli
            // potrzebujemy odwołać się do obiektu klasy
            // zewnętrznej musimy słowo "this" poprzedzić
            // nazwą klasy
            return OuterClass.this;
        }
    }
}
