/**
 * @version 2.0
 * @author ks
 */
public class Operators {
    public static void main(String[] args) {
        // =, ==, !=
        // klasa String obsługuje +, +=

        int x = 5;
        int y = 6;
        int z, a = 8, b = 10;
        z = x + y;
        a = x / y;

        float f1 = 5;
        float f2 = 6;

        b = ((2 + 2) * 2);

        System.out.println(z);
        System.out.println(a);
        System.out.println(f1/f2);
        System.out.println(b);

        String s1 = "";
        String s2 = "s2";
        String s3 = "s3";
        String s4 = s1 + s2 + s3;
        System.out.println(s4);

        // operatory przypisania
        // =
        int i1 = 5;
        i1 += 5; // i1 = i1 + 5
        // -= // i1 = i1 - 5
        // *=
        // /=

        // operatory jednoargumentowe
        // a++ - postinkrementacji
        // a = a + 1;
        int i2 = 3;
        i2++;
        int i3 = 10;
        System.out.println(i2);
        i3--;
        System.out.println(i3);
        int i4 = 100;
        System.out.println(i4--); // 100
        System.out.println(i4); // 99
        System.out.println(--i4); // 98
        System.out.println(i4); // 98

        // operatory relacji - zwracają typ logiczny (boolean)
        // true/false
        System.out.println(47 == 49);
        System.out.println(47 != 49);
        System.out.println(47 < 49);
        System.out.println(47 > 49);
        System.out.println(47 <= 49);
        System.out.println(47 >= 49);

        // operatory logiczne
        System.out.println(45 > 47 || (45 < 47
                && 49 > 50)
                );
        System.out.println(!(45 > 47));

        // literały
        int i10 = 0xf;
        int i11 = 071;
        System.out.println(i10);
        System.out.println(i11);

        float f10 = 10.3f;
        double d10 = 10.03d;
        long l10 = 10L;

        float exp = 2e-2f;
        float exp2 = 2e2f;
        System.out.println(exp);
        System.out.println(exp2);

        // operatur przesunięc (bitowych)
        int i12 = 2;  // 10
        int i13 = i12 << 1; // 100 // 4
        int i14 = i12 >> 1; // 1  / 1
        System.out.println(i12);
        System.out.println(i13);
        System.out.println(i14);

        int i15 = 8;
        i15 >>= 1; // i15 = i15 >> 1
        // analogicznie z operatorem <<=
        System.out.println(i15);

        // zadanie
        // Wypisać rezultat działania: 10111(binarnie)
        // 0,0001 * 10^-1 - 10111
        System.out.println(1e-4 * 1e-1 - 23);

        // operatory bitowe
        int a100 = Integer.parseInt("10111", 2);
        int a101 = Integer.parseInt("01000", 2);
        String s = Integer.toBinaryString(23);
        System.out.println(a100);
        System.out.println(s);

        String s100 = Integer.toBinaryString(a100 | a101); // OR
        System.out.println(s100);
        System.out.println(
                Integer.toBinaryString(a100 & a101) // AND
        );
        System.out.println(
                Integer.toBinaryString(a100 ^ a101) // XOR
        );
        // || -> |
        // && -> &
        // ! -> !

        int a102 = 10;
        a102 &= 8; // a102 = a102 & 8
        a102 |= 8; // a102 = a102 | 8
        a102 ^= 8; // a102 = a102 ^ 8

        a102 = ~8;
        System.out.println(a102);

        // operator trójargumentowy
        // wyrażenie ? wartość1 : wartość2
        System.out.println(
                1 > 2 ? "prawda" : "fałsz"
        );

        // instrukcja sterująca if
        if (1 > 2) {
            System.out.println("prawda");
        } else {
            System.out.println("fałsz");
        }

        int a103 = 10;
        int a104 = 11;
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if (b1 = b2 = b3) { // pamiętamy o podwójnym ==
            System.out.println("b1 = b2 = b3");
        }
        // druga pułapka
        // używanie operatora bitowego zamiast logicznego
        if (b1 | b2 | b3) { // zawsze używamy opertaora
            // logicznego jeżeli działamy na typach logiccznych
            System.out.println("b1 = b2 = b3");
        }

        // rzutowanie - w góre lub w dół
        // rzutowanie - konwersja jednego typu na drugi
        int i = 200;
        long lng = (long)i;
        lng = i;
//        i = lng; // i jest typu int, a int ma mniejszy zakres
        // niz long
        i = (int)lng;

        i = (int)5.54f; // zachodzi utrata częsci dziesiętnej
        System.out.println(i);
        float f = (float)4;
        System.out.println(f);

        char c = (char)97;
        System.out.println(c);
    }
}
