package packages;

import oop.Person;
import oop.Student;

public class Packages {
    public static void main(String... args) {
//    Packages1 p = new Packages1();
//    Loops loops; nie zadziałą
        Packages1.foo();

        // stworzyć 2 klasy, każda w osobnym pakiecie
        // w jednej z nich wywołać metodę z drugiej klasy
        // która wypisuje nazwę tej klasy
        Person p = new Person("Frank");
//        System.out.println(p.name); nie zadziałą
        // name ma dostęp pakietowy

        Student s = new Student("Chris");
//        System.out.println(s.name); nie zadziałą
        // name ma dostęp pakietowy

//        s.showClassName1(); nie zadziała
        // metoda showClassName1 ma dostęp pakietowy

//        s.showClassName4(); // nie zadziała
        // metoda showClassName4 ma dostęp chroniony
    }
}

// nie mogą istnieć dwie klasy publiczne w jednym pliku
class A {
    public void foo1() {
        System.out.println("A:foo1");
    }
}