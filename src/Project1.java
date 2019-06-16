import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Project1 extends Object {


    public static void main(String... args) {
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

    }
}
