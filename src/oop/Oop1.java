package oop;

//import packages.A;

public class Oop1 {
    public static void main(String... args) {
        // dostęp pakietowy/publiczny
        Person p = new Person("Jan");
        Student s = new Student("Thomas");
        p.showName();
        s.showName();
        System.out.println(s.name);
        p.showClassName1();
        s.showClassName1();

        // dostęp private
//        p.showClassName2(); // nie zadziałą
        // nie możemy odwoływać się do prywatnych
        // metod/pól poza obrębem tej klasy!
        p.showClassName3();
        s.showClassName3();
//        s.showClassName2(); // nie zadziała
        // metoda showClassName2 jest prywatna
        // dziedzienie nie ma w tym przypadku znaczenia


        // dostęp protected
        // to samo co dostęp pakietowy, lecz możliwe jest
        // używanie metod/pól protected w klasach dziedziczących
        // po tej klasie
        p.showClassName4();
        s.showClassName4();

        // Zadanie
        // 1)
        // Stworzyć 3 klasy, z czego 2 w tym samym pakiecie
        // a jedna w innym pakiecie
        // każda z klas powinna zawierać 4 rodzaje pól/metod
        // o dostępie:
        // - public
        // - private
        // - pakietowym
        // - protected
        // Spróbować odwołać się do każdej z tych
        // pól/metod w każdej klasie.

        // 2)
        // niech jedna z 2 klas w tym samym pakiecie
        // dzieczy (extends) po drugiej klasie z tego pakietu
        // Spróbować odwołać się do każdej z tych pol/metod
        // w każdej klasie.

        // 3)
        // proszę dodać konstruktor do klasy bazowej
        // i odziedziczyć go.
        // utworzyć obiekt korzystając z tego
        // konstrutkora
//        Iphone iphone1 = new Iphone();
//        System.out.println(iphone1.name);

        // 4)
        // dodać konstuktor również do klasy, która
        // dziedziczy po innej klasie
        // utworzyć obiekt korzystając z tego
        // konstrutkora
//        System.out.println(iphone1.name);

        Phone phone2 = new Phone("noname");
        Iphone iphone2 = new Iphone("iphone 7"); // nie zadziała
        System.out.println(iphone2.name); // nie zadziała

        phone2.showName(); // phone
        iphone2.showName(); // iphone

        IphoneGold iphoneGold = new IphoneGold();
        iphoneGold.showName();

        iphoneGold.showName(10);
//        iphoneGold.showName("10b");

        // Wniosek
        // jeżeli klasa potomna ma metodę, która ma
        // taką samą sygnaturę (nazwa + lista argumentów)
        // jak w klasach przodków, to przy wywołaniu
        // wybierana jest zawsze
        // wersja z klasy najbardziej potomnej

        // Konstruktory domyślne
//        DefaultConstructorA a = new DefaultConstructorA();
        DefaultConstructorB b = new DefaultConstructorB();

        System.out.println("Constructing DefaultConstructorC...");
        DefaultConstructorC c =
                new DefaultConstructorC("hello");

        // Wniosek!
        // konstruowanie odbywa się zawsze począwszy
        // od klasy najstarszego potomka.
        // Jeżeli konstruktor w danej klasie nie istnieje
        // to jest tworzony przez kompilator konstruktor
        // domyślny.

        // final - oznaczanie klasy jako nieprzeznaczonej
        // do dziedziczenia

        // final - pola
        FinalB finalB = new FinalB();
        System.out.println(
                finalB.b
        );
//        finalB.b = 4; // błąd - stałych nie możemy modyfikowac

        finalB.showB();

        FinalA finalA = new FinalA();
        finalA.showB();

        // Downcasting/Upcasting - rzutowanie w górę
        int a = 4;
        char ch = (char) a; // rzutujemy zmienną
        // o większej pojemności informacji na typ
        // o mniejszej pojemności informacji
        // musimy zrobić to jawnie ponieważ może
        // dojśc do utraty pewnej części informacji

        float f = 20;
        f = a;
        a = (int) f; // tu również konieczne rzutowanie

        // wlasne typy
        Someone someone = new Someone();
        Teacher teacher = new Teacher();
        someone = teacher; // tutaj niepotrzebujemy rzutowania
        // Wniosek
        // gdyby nie było linii z someone = teacher, to
        // wówczas w instrukcji "(Teacher) someone" wystąpiłby
        // błąd polegający na niepoprawnym rzutowaniu
        // z typu Someone na typ Teacher.

//        teacher = someone; // tutaj jest problem
        teacher = (Teacher) someone; // tutaj jest problem
        // do zmiennej o większej pojemności chcemy
        // przypisać zmienną o mniejszej pojemności

        // Wniosek
        // Proces domyślnego niejawnego upcastingu/downcasting
        // w przypadku typu Obiektowego odbywa się
        // "na odwrót" w stosunku do typów podstawowych
        teacher.print();

        // zadanie Stworzyć 2 klasy, jedna dziedziczy po
        // drugiej, następnie dokonać rzutowania w górę
        // i w dół pomiędzy typami.

        // Przykład
        // chcemy posiadać klasę, która będziee miała metodę
        // operującą na type bazowym (rodzicu)
        Lesson lesson = new Lesson();
        Someone someone1 = new Someone();
        Teacher teacher1 = new Teacher();
        lesson.addParticipant(someone1);
        lesson.addParticipant(teacher1);
        lesson.showParticipants();

        // Zadanie - stworzyć 3 klasy
        // rodzic, potomek,
        // III klasa będzie zawierała metodę, która operuje
        // na obiektach tych dwóch wcześniejszych klas
        // zademonstrować zjawisko polimorfizmu



    }
    public void foo() {
        System.out.println("package oop");
//        A a - new A(); nie zadziałą!
        // możemy importować klasy publiczne
    }
}
