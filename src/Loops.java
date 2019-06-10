import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        int a = 10;
        while (a < 10) {
            // kod powtarzany dopóki spełniony jest warunek pętli
            System.out.println(a);
            a++;
        }

        // do while
        a = 10;
        do {
            // kod powtarzany dopóki spełniony jest warunek pętli
            System.out.println(a);
            a++;
        } while(a < 10);

        // for
//        for (inicjalizacja; warunek; instrukcja)
        for (int licznik=0; licznik<10; licznik++) {
            System.out.println(licznik);
        }

        System.out.println("zadanie1");
        // zadanie1
        // Wypisać 10 liczb począwszy od 9 do 0
        for (int i=9; i>=0; i--) {
            System.out.println(i);
        }

        // zadanie2
        // wypisać 5 liter a, b, c, d, e
        // wskazówka - użyjemy rzutowania liczby
        // całkowitej na typ znakowy (char)
        // wskazówka2: a = 97
        System.out.println("zadanie2");
        for (char c=97; c<97+5; c++) {
            System.out.println(c);
        }

        // operator przecinka
        System.out.println("operator przecinka");
        for (int i=0, j=10; i<10; i++, j--) {
            System.out.println(i + ", " + j);
        }

        // foreach
        System.out.println("foreach");
        char[] arr = {97, 98, 99};
        for(char i : arr) {
            System.out.println(i);
        }

        // instrukcje sterujące pętli
        // return, break, continue
        System.out.println("continue");
        for(int i=0; i<10; i++) {
            if (i % 2 != 0) {
                continue; // przechodzimy do następnej iteracji
            }
            System.out.println(i);
        }

        System.out.println("break");
        for(int i=1; ; i++) {
            if (i % 5 == 0) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("return");
//        for(int i=1; ; i++) {
//            if (i % 5 == 0) {
//                return;
//            }
//            System.out.println(i);
//        }
//        System.out.println("ten kod się nie wykona");

        // if (warunek) {} else {}
        System.out.println("if else");
        Random rand = new Random();
        int i = rand.nextInt();
        System.out.println(i);
        if (i % 2 == 0) {
            System.out.println("wylosowaliśmy liczbę parzystą");
        } else if(i % 3 == 0) {
            System.out.println("wylosowaliśmy liczbę podzielną przez 3");
        } else {
            System.out.println("wylosowaliśmy liczbę nie podzielną" +
                    "ani przez 2 ani przez 3");
        }

        // co jeżeli wygenerujemy liczbę 6?
        // ponieważ mamy else i 6 dzieli się przez 2 bez reszty
        // nie będzie wykonywane dalsze sprawdzanie warunków

        // switch
        System.out.println("switch");
        for(int t=0; t<100; t++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'Y':
                case 'u':
                    System.out.println("samogłoska");
                    break;
                case 'x':
                    System.out.println("?");
                default:
                    System.out.println("spółgłoska");
            }
        }
    }
}
