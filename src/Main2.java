/**
 * @version 2.0
 * @author ks
 */
public class Main2 {

    // tu jest metoda główna
    // każda linia zaczyna się od '//'
    /* assfdasdfa
    afsdfsdaasdf
    sdfadsfdsf
     */

    /**
     * Metoda główna
     * @see Main
     * @return opiss typu zwracanego
     * @throws Exception // wyjątki
     * @deprecated funkcja już jest przestarzała i zostanie
     * usunięta w wersji 2.0
     *
     * @param args - lista argumentów
     */
    public static void main(String[] args) {
        System.out.println("test");

        // Zadanie
        // proszę utworzyć nową klasę analogiczne Main
        // z dwoma metodami, które są opisane adnotacjami
        // @see, @return, @throws i @deprecated oraz @params
        // natomiast klasa niech zawiera opis wersji i autora
        int i = -1;

        // operatory bitowe
        int a = Integer.parseInt("10111",2);
        int b = Integer.parseInt("1000",2);
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println();

    }
}
