package oop2;

import java.util.Arrays;

public class Oop2 {

    public static void main(String... args) {
        Oop2 oop2 = new Oop2();

        // Metody ze zmienną liczbą argumentów
        System.out.println(
                oop2.showArrayOfStrings("ala", "ma", "kota", "kota", "kota", "kota")
        );

        // Zadanie
        // napisać metodę, która pobiera dowolną ilość
        // Stringów jak argumenty i następnie zwrócić
        // jeden String będący efektem konkatenacji
        // tych Stringów
        System.out.println(
                oop2.concatenate("ala", "ma", "kota", "kota", "kota", "kota")
        );

        // Interfejsy
        InterfaceOneAndTwo specificOne = new SpecificOne();
        InterfaceOneAndTwo specificTwo = new SpecificTwo();
        oop2.show1(specificOne);
        oop2.show1(specificTwo);
        oop2.show2(specificOne);
        oop2.show2(specificTwo);
        oop2.show3(specificOne);
        oop2.show3(specificTwo);

        // Przykład
        // Zdefiniować 3 klasy i 2 interfejsy + trzeci łączący oba
        // Pierwsza i druga, która implementuje interfejs
        // Trzecia, która posiada metodę, pobierającą
        // jako argument obiekt klasy, która
        // implementuja ten interfejs
        // Zademonstrować zjawisko Polimorfizmu.

        Classes classes = new Classes();
        CanFacebookInterface student0 = new Student();
        CanLearnJavaAndFacebookInterace student1 = new BetterStudent();
        CanFacebookInterface student2 = new Student();
        CanFacebookInterface student3 = new Student();
        classes.start(
                student0, student1, student2,
                student3
                );

        classes.doTheHomework(student1);
//        classes.doTheHomework(student2); nie zadziała!

        // zadanie domowe
        // przeanalizować powyższy kod
        // i na tej podstawie proszę zademonstrować polimorfizm
        // na przykładzie użycia interfejsów
        
    }

    public void show1(InterfaceOne abstractOne) {
        abstractOne.abstractMethodOne();
    }
    public void show2(InterfaceTwo abstractTwo) {
        abstractTwo.abstractMethodTwo();
    }
    public void show3(InterfaceOneAndTwo abstractTwo) {
        abstractTwo.abstractMethodOne();
        abstractTwo.abstractMethodTwo();
    }

    public String showArrayOfStrings(String... args) {
        System.out.println(args);
        return Arrays.toString(args);
    }

    public String concatenate(String... args) {
        return String.join(", ", args);
    }

}
