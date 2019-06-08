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

        // zadanie1
        // Wypisać 10 liczb począwszy od 9 do 0

        // zadanie2
        // wypisać 5 liter a, b, c, d, e
        // wskazówka - użyjemy rzutowania liczby
        // całkowitej na typ znakowy (char)
        // wskazówka2: a = 97


    }
}
