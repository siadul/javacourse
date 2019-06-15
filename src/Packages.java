import package1.Packages2;

import java.util.Arrays;

class Packages {
    public int a = 3;
    public static void main(String... args) {
        int a[] = {4, 2, 9};
        Arrays.sort(a);
        System.out.println(
                Arrays.toString(a)
        );

        int z[] = {1, 2};

        int b[][] = {
                {1, 2},
                {8, 10},
        };
        int c[][] = {
                {1, 2},
                {8, 10},
        };
        int d[][] = {
                z,
                z,
        };
        int e[][] = {
                z,
                z,
        };

        System.out.println(
                Arrays.equals(b, c)
        );
        System.out.println(
                Arrays.deepEquals(b, c)
        );
        System.out.println(
                Arrays.equals(d, e)
        );

        Packages[] tab1 = {
                new Packages(),
                new Packages(),
        };
        Packages[] tab2 = {
                new Packages(),
                new Packages(),
        };

        Packages p1 = new Packages();
        Packages p2 = new Packages();

        System.out.println(
                p1.equals(p2)
        );
        System.out.println(
                tab1.equals(tab2)
        );
        System.out.println(
                Arrays.equals(tab1, tab2)
        );


        new Packages2();
        System.out.println(4);
    }

    @Override
    public boolean equals(Object o) {
        Packages p = (Packages) o;

        return a == p.a;
    }
}
