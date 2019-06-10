import java.util.Random;

public class Classes {
    // składowe/pola/fields
    int pole1 = 6;
    int pole2;
    float pole3;
    char pole4;
    boolean pole5;
    String pole6;
    char[] pole7 = {'a', 'c'};

    public static void main(String[] args) {
        Classes c = new Classes();
        c.foo1();

        // zadanie1
        // stworzyć metodę, która wyświetla tekst
        // złożony z losowych znaków dł. 10 znaków

        c.zadanie1();
        c.foo2(10, 15);
        c.zadanie2(10);
        c.zadanie2(2);

        // przykład
        // napiszmy metodę, która oblicza iloczyn dwóch liczb
        // i zwraca go nam
        System.out.println("example1");
        float result = c.example1(2, 2.5f);
        System.out.println(result);

        char ch = c.example2(97);
        System.out.println(ch);

        String str1 = c.example2('A', 3);
        System.out.println(str1);

        String str2 = c.example2(3, 'A');
        System.out.println(str1);

//        int i = c.example2(3, 'A');
//        System.out.println(str1);

//        c.example2(3, 'A'); // którą wersję ma wybrać kompilator?
        // wniosek: nie możemy przeciążać metod za pomocą różnicy
        // typów zwracanych

//        int i = c.example3(7.9); // error
//        int i = c.example3(7); // error
        short s1 = 45;
        int i = c.example3(s1);
        System.out.println(i);

//        long l = 48;
//        i = c.example3(l); // error
//        System.out.println(l);

        byte b = 4;
        i = c.example3(b);
        System.out.println(i);

        System.out.println("Fields");
        int p1 = c.pole1;
        System.out.println(p1);
        System.out.println(
                c.pole2         // 0
        );
        System.out.println(
                c.pole3         // 0.0
        );
        System.out.println(
                c.pole4         // (char)0
        );
        System.out.println(
                c.pole5         // false
        );
        System.out.println(
                c.pole6        // null
        );
        System.out.println(
                c.pole7
        );

        Classes c2 = new Classes(); // uruchamiany jest konstruktor
        c2.pole1 = 666;
        System.out.println(c.pole1); // 6
        System.out.println(c2.pole1); // 666

        Classes c3 = new Classes(69); // uruchamiany jest konstruktor
        Classes c4 = new Classes('6'); // uruchamiany jest konstruktor

        char[] charr = {'c', 'd', 'e'};
        Classes c5 = new Classes(3, 33.3f, 'c',
                true, "str", charr);
        c5.printFields();

        // zadanie stworzyć nową klasę, która będzie posiadała
        // 3 pola (a, b, sum)
        // Klasa ma zawierać konstruktor, który będzie
        // przyjmował 2 argumenty a i b, i do pola sum
        // przypisywał sumę parametrów a i b
    }

    public void foo1() {
        System.out.println("hello world from foo1");
    }

    public void zadanie1() {
        Random rand = new Random();
        String s = "";
        for(int i=0; i<10; i++) {
            s += (char)(rand.nextInt(26) + 97);
            System.out.println(s);
        }
    }

    public void foo2(int a, int b) {
        System.out.println(a + b);
    }

    // zadanie napisać metodę, która przyjmuje 1 argument
    // i wyświetla String o długości podanej jako argument
    // String składa się ze znaków 'X'
    // przykład
    // zadanie2(5)
    // XXXXX
    // zadanie2(2)
    // XX
    public void zadanie2(int length) {
        String s = "";
        for (int i=0; i<length; i++) {
            s += 'X';
        }
        System.out.println(s);
    }

    public float example1(float a, float b) {
        return a * b;
//        System.out.println("");
    }

    /**
     * @param a
     * @return następny znak w stosunku do kodu znaku
     * podanego jako parameter a
     */
    public char example2(int a) {
        return (char) (a + 1);
    }


    /**
     * Zwraca ciąg znaków 'ch' (String) o długości a
     * @param a
     * @return
     */
    public String example2(char ch, int a) {
        System.out.println("example2(char ch, int a)");
        String s = "";
        for(int i=0; i<a; i++) {
            s += ch;
        }

        return s;
    }

    /**
     * Zwraca ciąg znaków 'ch' (String) o długości a
     * @param a
     * @return
     */
    public String example2(int a, char ch) {
        System.out.println("example2(int a, char ch)");
        String s = "";
        for(int i=0; i<a; i++) {
            s += ch;
        }

        return s;
    }
    /*
     * Zwraca ciąg znaków 'ch' (String) o długości a
     * @param a
     * @return
     */
//    public int example2(int a, char ch) {
//        return 0;
//    }

//    public int example3(byte i) {
//        System.out.println("example3(byte i)");
//        return i;
//    }

    public int example3(int i) {
        System.out.println("example3(int i)");
        return i;
    }

    public int example3(short i) {
        System.out.println("example3(short i)");
        return i;
    }

    // konstruktory
    public Classes() {
        System.out.println("Hello from constructor Classes()");
    }

    // konstruktory
    public Classes(int a) {
        System.out.println("Hello from " +
                "constructor Classes(int a): " + a);
    }

    // konstruktory
    public Classes(char a) {
        System.out.println("Hello from " +
                "constructor Classes(char a): " + a);
    }

    public void printFields() {
        System.out.println("printFields()");
        System.out.println(pole2);
        System.out.println(pole3);
        System.out.println(pole4);
        System.out.println(pole5);
        System.out.println(pole6);
        System.out.println(pole7);
    }


    // konstruktory
    public Classes(int a, float b, char c,
                   boolean d, String e, char[] f) {
        System.out.println("Hello from " +
                "constructor Classes(int a, float b, char c, " +
                "                   boolean d, String e, char[] f): " + a);
        pole2 = a;
        pole3 = b;
        pole4 = c;
        pole5 = d;
        pole6 = e;
        pole7 = f;
    }


}
