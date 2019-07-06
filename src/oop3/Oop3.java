package oop3;

public class Oop3 {
    public static void main(String... args) {
        C c = new C();
        D d = new D();
        d.c(c);

        // Uwaga! Interfejsy nie mogą dziedziczyć
        // metod, które różnią się jedynie typami
        // zwracanymi

        System.out.println(InterfaceC.FEBRUARY);
//        InterfaceC.FEBRUARY = 2; // nie zadziałą
        // pole w interfejsie jest finalne

        InterfaceC.CImplementation cInner = new InterfaceC.CImplementation();
        cInner.a();
        cInner.b();

        // Zadanie
        // Stworzyć klasę wewnątrz interfejsu, która implementuje go.
        // Następnie stworzyć obiekt tej klasy i wywołać metodę z
        // interfejsu.

        InterfaceC.CImplementation.D.E e = new InterfaceC.CImplementation.D.E();
        e.e();
        // Wniosek
        // Klasa zagnieżdzona w obrębie interfejsu posiada
        // kontekst statyczny, a zatem nie może odwoływać się
        // do (niestatycznych) pól/metod z klasy zewnętrznej

        // klasy wewnętrzne
        System.out.println("Klasy wewnętrzne");
        OuterClass o = new OuterClass();

        // tworzenie obiektów klasy wewnętrznej - sposób I
        OuterClass.InnerClass i = o.inner();
        i.foo1Inner();
//        i.foo1(); nie zadziała
        i.outer().foo1();

        // tworzenie obiektów klasy wewnętrznej - sposob II
        // przy użyciu operator .new
        OuterClass.InnerClass i2 = o.new InnerClass();
        i2.foo1Inner();

        // Wniosek 1
        // Pomiędzy klasą wewnętrzną a zewnętrzną istnieje
        // łącznik, który pozwala nam na korzystanie z pól/metod
        // klasy zewnętrznej w klasie wewnętrznej

        // Wniosek 2
        // Aby stworzyć obiekt klasy wewnętrznej muszę wcześniej
        // utworzyć obiekt klazy zewnętrznej

        // Zadanie
        // a) Stworzyć klasę zewnętrzną z min. 1 polem i metodą
        // b) Stworzyć klasę wewnętrzną
        // c) Dodać do niej metodę, która będzie
        // odwoływać się do metody i pola z klasy zewnętrznej
        // d) Utworzyć obiekt klasy wewnętrznej i wywołać
        // metodę należącą do niej
        // e) Za pomocą referencji do obiektu utworzonego w
        // pkt. d) wywołać metodę z klasy zewnętrznej
        // (Podpowiedź "nazwaklasy.this")

        Sequence sequence = new Sequence(10);
        for(int k=0; k < 9; k++) {
//            sequence.add(new Integer(k));
            sequence.add(k); // automatyczna konwersja do typu
            // opakowującego typ podstawowy (Integer)
        }
        Sequence.SequenceSelector selector = sequence.new SequenceSelector();
        selector.sequence().add(13);
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        // Klasy wewnętrzne w metodach i zasięgach
        // 6 przypadków
        // 1) klasa zdefiniowana wewnątrz metody
        // 2) klasa zdefiniowana wewnątrz scope'u (zasięgu) metody
        System.out.println("1) i 2) klasa zdefiniowana wewnątrz metody");
        Parcel5 p = new Parcel5();
        Destination destination = p.destination("Tasmania");
        System.out.println(
            destination.readLabel()
        );

//        PDestination pDestination; // nie zadziała,
        // klasa zdefiniowana wewnątrz metody jest widoczna
        // tylko w obrębie tej metody

        // 3) anonimowa klasa implementująca interfejs
        System.out.println("3) anonimowa klasa implementująca interfejs");
        Parcel7 parcel7 = new Parcel7();
        Contents contents = parcel7.contents();
        System.out.println(
            contents.value()
        );

        // Zadanie
        // a) Stwórz interfejs z przynajmniej jedną metodą,
        //    a następnie zaimplementuj go poprzez zdefiniowane
        //    klasy wewnętrznej W METODZIE zwracającej ten
        //    interfejs
        // b) powtórz ćwiczenie z pkt a) z użyciem anonimowej
        //    klasy implementującej interfejs
        // c) powtórz ćwiczenie z pkt a) ale klasę wewnętrzną
        //    zdefiniuj w zasięgu zdefiniowanym w obrębie tej
        //    metody

//        Przykład:
//        void metoda() {
//            {
//                class Klasa
//            }
//        }

        // a)
        ZadanieA zadanieA = new ZadanieA();
        ZadanieAInterface zadanieAInterface =
                zadanieA.produceZadanieAInterface();
        zadanieAInterface.show();

        // c) klasa wewnątrz dodatkowego zasięgu w obrębie metody
        // uwaga na null pointer exception!
        ZadanieC zadanieC = new ZadanieC();
        ZadanieAInterface zadanieAInterface2 =
                zadanieC.produceZadanieAInterface();
        zadanieAInterface2.show();

        // b) używamy anonimowej klasy wewnętrznej
        ZadanieB zadanieB = new ZadanieB();
        ZadanieAInterface zadanieAInterface3 =
                zadanieB.produceZadanieAInterface();
        zadanieAInterface3.show();


        // 4) anonimowa klasa rozszerzająca klase posiadającą
        //    konstruktor inny od domyślnego
        Parcel8 parcel8 = new Parcel8();
        Wrapping w1 = parcel8.wrapping1(10);
        System.out.println(
            w1.value()
        );
        Wrapping w2 = parcel8.wrapping2(11, 12);
        System.out.println(
                w2.value()
        );

        // Pnieważ klasy wewnętrzne nie posiadają nazwy
        // nie możemy im definiwoać konstruktorów natomiast
        // możemy:

        // 5)
        // inicjalizować pola anonimowych klas w momencie
        // ich definicji

        // 6)
        // inicjalizacjować pola w bloku inicjalizującym





    }
}
