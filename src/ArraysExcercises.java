import package1.Packages1;
import package1.Packages2;

import java.util.Arrays;

public class ArraysExcercises extends Object {
    public int field1 = 1;
    public int field2 = -1;

    public static void main(String... args) {
        int[] dane = new int[3];
        dane[0] = 3;
        dane[1] = 6;
        dane[2] = 7;
        System.out.println(dane);
        // Zadanie - proszę wypisać kolejne elementy tablicy
        for (int el : dane) {
            System.out.println(el);
        }
        for (int i = 0; i<dane.length; i++) {
            System.out.println(dane[i]);
        }

        // Zadanie
        // Napisz program, który w 10 elementowej tablicy
        // umieszcza liczby od 9 do 0
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++) {
            arr[i] = 9 - i;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("tablice wielowymiarowe");
        // tablice wielowymiarowe
        int arr2[][] = new int[3][2];
        System.out.println(arr2.length);
        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr2[i].length; j++) {
                arr2[i][j] = j + i*2;
                System.out.println(arr2[i][j]);
            }
        }
        //
        // arr2[0][0] = 0 + 0 * 2; = 0
        // arr2[0][1] = 1 + 0 * 2; = 1

        // arr2[1][0] = 0 + 1 * 2; = 2
        // arr2[1][1] = 1 + 1 * 2; = 3

        // arr2[2][0] = 0 + 2 * 2; = 4
        // arr2[2][1] = 1 + 2 * 2; = 5

        // zadanie - korzystając z tablicy dwuwymiarowej
        // wypisać macierz:
        // 100
        // 010
        // 001

        // System.out.print
        // System.out.println()
        int n = 3;
        int [][] arr3 = new int[n][n]; // wszystkie elementy

        // tablicy pierwotnie mają wartość 0
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == j) {
                    arr3[i][j] = 1;
                }
            }
        }
        // drugi sposob
//        int [][] arr3 = {
//                {1, 0, 0},
//                {0, 1, 0},
//                {0, 0, 1},
//        };

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }

        // Stworzyć tablicę 3 wymiarową
        // 123 123 123
        // 123 123 123
        // 123 123 123
        int[][][] arr4 = {
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
                {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}},
        };
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    System.out.print(arr4[i][j][k]);
                }
                System.out.print(' ');
            }
            System.out.println();
        }

        // metody pomocnicze Arrays
        // Arrays.fill
        int size = 6;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];
        short[] a4 = new short[size];
        int[] a5 = new int[size];
        long[] a6 = new long[size];
        float[] a7 = new float[size];
        double[] a8 = new double[size];
        String[] a9 = new String[size];
//        java.util.Arrays.fill(a1, true);
        Arrays.fill(a1, true);
        System.out.println("a1 = " + Arrays.toString(a1));
        Arrays.fill(a2, (byte)11);
        System.out.println("a2 = " + Arrays.toString(a2));
        Arrays.fill(a3, 'x');
        System.out.println("a3 = " + Arrays.toString(a3));
        Arrays.fill(a4, (short)17);
        System.out.println("a4 = " + Arrays.toString(a4));
        Arrays.fill(a5, 19);
        System.out.println("a5 = " + Arrays.toString(a5));
        Arrays.fill(a6, 23);
        System.out.println("a6 = " + Arrays.toString(a6));
        Arrays.fill(a7, 29);
        System.out.println("a7 = " + Arrays.toString(a7));
        Arrays.fill(a8, 47);
        System.out.println("a8 = " + Arrays.toString(a8));
        Arrays.fill(a9, "Ahoj");
        System.out.println("a9 = " + Arrays.toString(a9));
        // zakresy
        Arrays.fill(a9, 0, 1, "tam");
        System.out.println("a9 = " + Arrays.toString(a9));

        // zadanie
        // 1. tworzyć pustą tablicę obiektów ArrayExcercises
        // 2. korzystając z metody Arrays.fill wypełnić
        // tę tablićę nowym obiektem ArrayExcercises
        ArraysExcercises[] arrObj = new ArraysExcercises[3];
        System.out.println(Arrays.toString(arrObj));
        Arrays.fill(arrObj, new ArraysExcercises());
        System.out.println(Arrays.toString(arrObj));
        System.out.println(arrObj);
        System.out.println(arrObj[0].field1);
        arrObj[0].field1 = 10;
        arrObj[1].field1 = 100;
        arrObj[2].field1 = 200;

        arrObj[0].field2 = -1000;
        System.out.println(arrObj[0].field1);
        System.out.println(arrObj[1].field1);
        System.out.println(arrObj[2].field1);
        System.out.println(arrObj[0].field2);
        System.out.println(arrObj[1].field2);
        System.out.println(arrObj[2].field2);

        // wniosek: mamy 1 obiekt i 3 referencje do niego.
        // modyfikacja za pomocą dowolnej referencji
        // zmienia wartośc tego samego obiektu
        ArraysExcercises obj = new ArraysExcercises();
        arrObj[0] = obj;
        arrObj[1] = new ArraysExcercises();
        arrObj[2] = new ArraysExcercises();
        System.out.println(Arrays.toString(arrObj));

        ArraysExcercises obj1 = null, obj2 = null;
        System.out.println(obj1);
        System.out.println(obj2);
        obj1 = new ArraysExcercises();
        obj2 = obj1; // UWAGA, do zmiennej obj2 przypisuje
        // referencję do tego samego obiektu
        System.out.println(obj1);
        System.out.println(obj2);
        obj1.field1 = 100;
        obj2.field1 = 1000;
        System.out.println(obj1.field1);
        System.out.println(obj2.field1);

        // WNIOSEK
        // zmienne obiektowe przechowują zawsze
        // REFERENCJE do obiektu (a nie konkretnego obiekty)
        // Przypisanie zmiennej1 do zmiennej2 oznacza
        // KOPIOWANIE REFERENCJI, a nie OBIEKTÓW

        // UWAGA
        // tablice są również pełnoprawnymi obiektami
        int[] arrInt1 = {1, 2, 3};
        int[] arrInt2;
        arrInt2 = arrInt1; // UWAGA! kopiujemy referencje
        arrInt2[1] = 0;
        System.out.println(
                Arrays.toString(arrInt1)
        );
        System.out.println(
                Arrays.toString(arrInt2)
        );

        // UWAGA!!! NIE DOTYCZY TYPÓW PODSTAWOWYCH
        int a = 5;
        int b;
        b = a; // TUTAJ NIE ZACHODZI KOPIOWANIE REFERENCJI
        a = 10;
        System.out.println(a);
        System.out.println(b);

        // System.arraycopy - kopiowanie tablic
        int[] arr5 = {1, 3, 5};
        int n2 = arr5.length;
        int[] arr6 = new int[n2];
        for(int i=0; i<arr5.length; i++) {
            arr6[i] = arr5[i];
        }
        arr5[2] = 0;
        System.out.println(
                Arrays.toString(arr5)
        );
        System.out.println(
                Arrays.toString(arr6)
        );

        int[] arr7 = new int[n2];
        System.arraycopy(arr5, 0, arr7, 0, n2);
        arr5[0] = 0;
        System.out.println(
                Arrays.toString(arr5)
        );
        System.out.println(
                Arrays.toString(arr7)
        );

        // Zadanie
        // stworzyć tablice kolejnych liczb całkowytch
        // 1, 2 ... 10
        // korzystając z metody System.arraycopy
        // stworzyć drugą tablicę, która zawiera
        // 5 elementów tablicy pierwszej od 5 do 9
        int[] arr10 = new int[10];
        int[] arr11 = new int[5];
        for(int i=1; i<11; i++) {
            arr10[i-1] = i;
        }

        System.arraycopy(arr10, 4, arr11, 0, 5);
        System.out.println(
                Arrays.toString(arr10)
        );
        System.out.println(
                Arrays.toString(arr11)
        );

        // Analogicznie - stworzyć tablicę:
//        [0, 5, 6, 7, 0]
        int[] arr12 = new int[5];
        System.arraycopy(arr10, 4, arr12, 1, 3);
        System.out.println(
                Arrays.toString(arr12)
        );

        // porównywanie - Arrays.equals
        int[] b1 = new int[10];
        int[] b2 = new int[10];
        Arrays.fill(b1, 47);
        Arrays.fill(b2, 47);
        System.out.println(b1 == b2); // PORÓWNYWANIE REFERENCJI
        System.out.println(Arrays.equals(b1, b2));

        String[] s1 = new String[4];
        Arrays.fill(s1, "Hej");
        String[] s2 = {
                new String("Hej"),
                new String("Hej"),
                new String("Hej"),
                new String("Hej"),
        };
        System.out.println(Arrays.equals(s1, s2));

        String x = new String("abc");
        String y = new String("abc");
        System.out.println("x == y: " + (x == y)); // porównywanie referencji
        System.out.println("\"xx\" == \"xx\": " + ("xx" == "xx"));
        // tutaj mamy porównywanie stałych "xx", a więc nie referencji!

        System.out.println("x.equals(y)" + x.equals(y));
        // porównywanie wartości Stringa

        for(int i=0; i<s1.length; i++) {
            System.out.println("s1[i] == s2[i]: " +
                    (s1[i] == s2[i]));
            System.out.println("s1[i].equals(s2[i]): " +
                    s1[i].equals(s2[i]));
        }
        System.out.println(Arrays.equals(s1, s2));

        // Wniosek:
        // Arrays.equals zwraca false, jeżeli liczba elementów
        // tablic jest różna.
        // Iteruje po elementach tablicy1
        // i porównuje z elementami tablicy2.
        // Jeżeli te elementy są obiektami (np. String, Array,
        // ArraysExcercises) to wówczas wywołuje metodę equals
        // na rzecz tych obiektów.
        // Jeżeli choć jedno wywołanie zwróci false,
        // Arrays.equals zwraca false

        // Zadanie
        // Stworzyć 2 tablice obiektów ArraysExcercises
        // i porównać za pomocą meetody Arrays.equals
        ArraysExcercises[] arr100= {
                new ArraysExcercises(),
                new ArraysExcercises(),
        };
        ArraysExcercises[] arr101= {
                new ArraysExcercises(),
                new ArraysExcercises(),
        };
        ArraysExcercises[] arr102 = new ArraysExcercises[2];
        ArraysExcercises[] arr103 = new ArraysExcercises[2];
        System.out.println(
                "Arrays.equals: " + Arrays.equals(arr100, arr101)
        );
        System.out.println(
                "Arrays.equals (null): " + Arrays.equals(arr102, arr103)
        );
        ArraysExcercises a100 = new ArraysExcercises();
//        a100.field1 = 33;
        ArraysExcercises a101 = new ArraysExcercises();

        System.out.println(
                "a100.equals(a101): " + a100.equals(a101)
        );

        // Zadanie
        // Stworzyć 2 tablice dwuwymiarowe
        // a następnie porównać je ze sobą


        int bb[][] = {
                {1, 2},
                {3, 4},
        };
        int cc[][] = {
                {1, 2},
                {3, 4},
        };
        int xx[] = {1, 2};
        int yy[] = {1, 2};
        int zz[] = {3, 4};
        int dd[][] = {
                xx,
                zz
        };
        int ee[][] = {
                xx,
                zz
        };

        System.out.println(
                "bb[][] == cc[][]: " + (bb == cc)
        );
        System.out.println(
                "Arrays.equals(bb, cc): " + Arrays.equals(bb, cc)
        );
        System.out.println(
                "xx.equals(yy): " + xx.equals(yy)
        );
        System.out.println(
                "bb.equals(cc): " + bb.equals(cc)
        );
        System.out.println(
                "Arrays.equals(xx, yy): " + Arrays.equals(xx, yy)
        );
        System.out.println(
                "Arrays.equals(dd, ee): " +
                        Arrays.equals(dd, ee)
        );

        System.out.println(
                "Arrays.deepEquals(bb, cc): " +
                        Arrays.deepEquals(bb, cc)
        );

        // Wniosek
        // Do porównywania tablic wielowymiarowych
        // używamy metody Arrays.deepEquals

        // Arrays.sort
        int[] tab = {2, 1, 9};
        Arrays.sort(tab);
        System.out.println(
                Arrays.toString(tab)
        );







    }

    @Override
    public boolean equals(Object o) {
        ArraysExcercises a = (ArraysExcercises) o;
        if (field1 == a.field1 && field2 == a.field2) {
            return true;
        }

        return false;
    }
}
