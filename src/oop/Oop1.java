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

        // 3 klasy, klasa B dziedziczy po A,
        // klasa C zawiera pole tupu A
        // klasa C posiada konstruktor z parametrem, który
        // inicjalizuje to pole.

        A a1 = new A();
        B b1 = new B();
        C c1 = new C(a1);
        C c2 = new C(b1);
        c1.showA();
        c2.showA();

        // Zadanie - stworzyć 4 klasy
        //
        // a) Shape, Circle, Square, Triangle
        // 3 ostatnie dziedziczą po Shape

        // b) klasa Shape zawiera metodę draw(),
        // która powinna być przeciążona
        // w pozostałych klasach.
        // metoda powinna rysować na wyjście
        // figurę za pomocą znaków "*"

        // c) utworzyć tablicę obiektów Shape
        // wypełnić ją obiektami Circle, Square i Triangle
        // a następnie w pętli wywołać funkcję draw() na
        // elementach tej tablicy
        int size = 4;
        Shape[] shapes = new Shape[size];
        shapes[0] = new Triangle();
        shapes[1] = new Circle(); // wskazowka dla ambitnych
        // x*x + y*y = r*r
        shapes[2] = new Square();
        shapes[3] = new UndefinedShape();

        drawShapes(shapes, size);

        // Zadanie
        // Stworzyć abstrakcyjną klasę Dog z minimum
        // jedną metodą abstrakcyjną showBreed()
        // Następnie utworzyć 2 klasy dziedziczące po niej.
        // Zademonstrować działanie polimorfizmu.

        // Przykład - polimorfizm nie zachodzi dla metod
        // statycznych
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        // Wniosek!
        // nie możemy przeciążać metod statycznych
        // a zatem nie zachodzi polimorfizm.
        System.out.println(sup.dynamicGet());

        // Przykład - polimorfizm w konstruktorach
        new RoundGlyph(5);

        // kowariancja typów zwracanych
        Mill m = new Mill();
        Grain g = m.process();
//        String str = String.valueOf(g);
//        System.out.println(str);
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);

        // Wniosek
        // Przeciążone metody polimorficzne mogą się
        // różnić co do typu zwracanego, ale tylko w ten
        // sposób, że typ zwracany w klasie pochodnej jest
        // typem pochodnym w stosunku do typu zwracanego
        // w klasie bazowej.


    }

    public static void drawShapes(Shape[] shapes, int size) {
        for(int i=0; i<size; i++) {
            shapes[i].draw(); // polimorfizm
        }
    }

    public void foo() {
        System.out.println("package oop");
//        A a - new A(); nie zadziałą!
        // możemy importować klasy publiczne
    }
}
