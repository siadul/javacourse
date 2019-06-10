public class ClassesZadanie {
    int a;
    int b;
    int sum;

    public ClassesZadanie(int a, int b) {
        System.out.println("ClassesZadanie(int a, int b)");
        this.a = a;
        this.b = b;
        sum = a + b;
    }

    public ClassesZadanie(int a, int b, int sum) {
        this(a, b);
        System.out.println("ClassesZadanie(int a, int b, int sum)");
        this.sum = sum;
    }

    public static void main(String... args) {
        ClassesZadanie zadanie = new ClassesZadanie(4, 7);
        System.out.println(zadanie.a);
        System.out.println(zadanie.b);
        System.out.println(zadanie.sum);

//        int a; // deklaracja zmiennej
//        a++; // error
//        System.out.println(a);

        // pola klasy są zawsze inicjalizowane wartościami domyślnymi
        // natomiast zmienne w obrębie metody nie posiadają
        // wartości domyślnych
        // próba modyfikacji takich zmiennych przez wczesniejszego
        // przypisania zakończy się błędem

        // zakres zmiennych
        int a2 = 5;
        {
            {
                int b = a2;
                System.out.println(b);
            }
        }
//        System.out.println(b);
        // wniosek
        // w zakresie wewnętrznym możemy odwoływać się
        // do zmiennych (ale nie tylko) w zakresie zewnętrznym
        // natomiast w drugą stonę to nie działa tzn.
        // w zakresie zewnętrznym nie mamy dostepu do zmiennych
        // utworzonych w zakresie wewnętrznym

        zadanie.foo1();
        zadanie.foo2();
        System.out.println(zadanie.a);

        // zwracanie obiektu tej samej klasy
        System.out.println("this");
        ClassesZadanie obj2 = new ClassesZadanie(1, 3);
        ClassesZadanie zad1;
        zad1 = zadanie.inc().inc().inc();
//        zadanie.inc();
//        zadanie.inc();
//        zadanie.inc();
        System.out.println(obj2.a);
        System.out.println(zad1.a);

        System.out.println("użycie this w konstruktorze");
        ClassesZadanie obj3 = new ClassesZadanie(1, 2, 3);
        System.out.println(obj3.a);
        System.out.println(obj3.b);
        System.out.println(obj3.sum);
    }

    public void foo1() {
        System.out.println("foo1");
        int a = 5;
        this.a = 10;
    }

    public void foo2() {
        System.out.println("foo2");
        a++;
    }

    public ClassesZadanie inc() {
        a++;
        return this;
    }
}
