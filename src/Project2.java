public class Project2 extends Object {


    public static void main(String... args) {
        // projekty proszę wysyłać na:
        // krzysztofsiadul@gmail.com
        // termin: 07.07

        // PROJEKT 1 KALKULATOR
        // Napisać program, który pozwala nam wykonywać operacji matematycznych na liczbach
        // wprowadzonych z klawiatury


        // Przykładowe działanie programu

        // Podaj liczbę: 48.34
        // Jakie działanie wykonać (+, -, /, *, sqrt, pow, exit)?: +
        // Podaj liczbę: 51.66
        // Rezultat działania 48.34 + 51.66 = 100
        // Jakie działanie wykonać (+, -, /, *, sqrt, pow, exit)?: sqrt
        // Rezultat działania sqrt(48.34 + 51.66) = 10
        // Jakie działanie wykonać (+, -, /, *, sqrt, pow, exit)?: pow
        // Podaj liczbę: 3
        // Rezultat działania (sqrt(48.34 + 51.66))^3 = 1000
        // Jakie działanie wykonać (+, -, /, *, sqrt, pow, exit)?: exit
        // Do widzenia.


        // Założenia
        // 1. Każdą liczbę oraz każde działanie (+, -, /, *, sqrt, pow, exit) przechowywujemy w tablicy Stringów
        // 2. Mamy min. 2 klasy
        // 3. InputOutputManager - odpowiada za pobieranie danych wejściowych od użytkownika oraz wypisywanie na
        //    standardowe wyjście
        // 4. Calculator
        //  - odpowiada za wykonywanie operacji.
        //  - posiada metodę, która generuje działanie na podstawie tablicy operacji przykładowo
        //      String getOperations(String[] operations)
        //      input:
        //          getOperations(["48.34", "+", "42.66", "sqrt", "pow", "3", "exit"])
        //      output:
        //          "(sqrt(48.34 + 42.66))^3"

        // Wskazówki:
        // Math.sqrt(100) -> sqrt(10)
        // Math.pow(2, 3) -> 2^3



        // PROJEKT 2
        // Do kodu z PROJEKT 1 dodać nakładkę graficzną korzystając z JavaFX

        // Projekt
        // Dodać GUI:
        // - przyciski operacji Sum, Difference, Product, Dividend, SquareRoot, Power
        // - min. 2 x input, LICZBY do operacji użytkownik wpisuje do formularza z klawiatury, nie za pomocą przycisków
        // - slider poziomy i pionowy - zmieniające wartość liczby wpisanej w inputach
        // - textfield/label z rezultatem operacji
        // - textfield z dotychczasowymi operacjami

        // - obsługa błędów (np. dzielenie przez 0, parsowanie danych wprowadzonych przez usera)
        // - listę operacji przechowujemy w kontenerze (najlepiej na stosie, ale może być ostatecznie zwyczajne ArrayList)

        //  - min. 10 klas w tym:
        //      - Klasy abstrakcyjnej AbstractOperation, zawierającej metodę abstrakcyjną calculate
        //      - Klas dziedziczących po Operation: Sum, Difference, Product, Dividend, SquareRoot, Power, Exit
        //      - Klasy Calulator z metodą główną main, która odpowiada za obliczanie operacji

        // javafx:
        // pobieramy SDK, struktura projektu i dorzucamy odpowiednie pliki
        // https://stackoverflow.com/questions/51478675/error-javafx-runtime-components-are-missing-and-are-required-to-run-this-appli
        // w opcjach uruchomienia dodajemy potrzebne komponenty javafx.fxml i javafx.graphics (uwaga! nie controls)

    }
}
