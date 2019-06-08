import java.lang.reflect.Array;

/**
 *
 */
public class Main {

    // tu jest metoda główna
    // każda linia zaczyna się od '//'
    /* assfdasdfa
    afsdfsdaasdf
    sdfadsfdsf
     */

    /**
     * Metoda główna
     *
     * @param args - lista argumentów
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // typy numeryczne
        // liczby całkowite
        // byte - 1 bajt - zakres -128;127
        byte zmienna1 = 45;
        // short - 2 bajty zakres - -32 768 - 32 767
        short zmienna2 = 32767;
        // int - 4 bajty - zakres --2147483648 - 2147483647
        // long - 8 bajtów -2^63 do 2^63
        int zmienna3 = 3443;
        long zmienna4 = 51000;

        // liczby zmiennoprzecinkowe
        float float1 = 4.45f; // 32 bity
        double double1 = 5.67; // 64 bity
//        Float.MAX_VALUE, Float.MIN_VALUE
//        Double.MAX_VALUE, Double.MIN_VALUE

        // typ logiczny
        boolean boolean1 = true; // lub false

        // typ pusty
//        void
//        void void1; // nie ma sensu

        char char1 = 'ą'; // ąćżźć - polskie znaki również działają

        // oprócz typów podstawowych mamy typy obiektowe
        // BigInteger, BigDecimal - służą do operacji na
        // liczbach o dowolnej precyzji

        // tablice
        char char2 = 'a';
        char char3 = 'b';
        char char4 = 'c';
        char[] arr = {'a', 'b', 'c', 48}; // tablie zawsze
        // mogą przechowywać wartości 1 typu
        // jeżeli podamy inny typ. zostanie wykonane rzutowanie
        // czyli konwersja

        // typ łańcuch znaków
        String string1 = "jakiś tekst";
        String string2 = new String("jakiś tekst2");
        char char10 = string2.charAt(0);

        System.out.println(zmienna1);
        System.out.println(zmienna2);
        System.out.println(float1);
        System.out.println(double1);
        System.out.println(boolean1);
        System.out.println(char1);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(string1);
        System.out.println(char10);



    }
}
