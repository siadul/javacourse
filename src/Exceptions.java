import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyArithmeticException extends ArithmeticException {}

public class Exceptions {

    public static double getDoubleFromInput() throws
            MyArithmeticException, IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        double mianownik = Double.parseDouble(br.readLine());
        if(0.0 == mianownik) {
            throw new MyArithmeticException();
        }

        return mianownik;
    }

    public static void main(String... args) {
        int licznik = 10;
        double mianownik = 1;

        for(int counter = 10; counter >= 0; counter--) {
            System.out.println("Podaj x aby obliczyć 10/x");

            try {
                double d = getDoubleFromInput();
            } catch (IOException | ArithmeticException e) {
                e.printStackTrace();
                System.out.println("Wystąpił błąd, spróbuj jeszcze raz");
                continue;
            } catch(NumberFormatException e) {
                System.out.println("Musisz wprowadzić liczbę!");
                continue;
            } catch(Exception t) {
                System.out.println("Coś poszło nie tak!");
                continue;
            } finally {
                // Instrukcje w bloku finally zostaną wykonane
                // ZAWSZE,
                // bez względu na to czy udało nam się
                // wykonac kod w bloku try czy nie, również,
                // jeżeli wystąpił Exception, ale nie przechwyciliśmy
                // go w bloku catch
                // Co więcej, również jeżeli mamy return
                // wewnątrz bloku try-catch, zostanie
                // wykonany kod z bloku finally.

                // np. zamkniecie pliku
                System.out.println("zamknij plik itp...");
            }
            System.out.println(licznik + "/" + mianownik
                    + "=" + licznik/mianownik);
        }

        // Zadanie
        // Stworzyć klasę "WordsFactory" z metodą "createWords",
        // która będzie zwracała LISTę słów utworzonych przez
        // użytkownika.

        // Słowa nie mogą zawierać innych znaków niż litery
        // (jeżeli taka sytuacja wystąpi proszę rzucać wyjątek).

        // Pobieranie danych ze strumienia wejściowego
        // powinno być wydzielone to osobnej metody.

        // Dodać obsługę możliwych błędów.
        // W razie konieczności proszę utworzyć własną
        // klase wyjątku.
        // W razie wystąpienia wyjątku proszę kontynuować pobieranie
        // danych (max 10 razy).
    }
}
