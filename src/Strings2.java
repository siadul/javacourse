import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Strings2 extends Object {


    public static void main(String... args) {


        // Zadanie
        // Korzystając z metody StringBuilder zbudować
        // łańcuch znaków "StringBuilder excercise"
        // następnie usunąć w nim wszystkie wystąpienia literki 'e'
        StringBuilder sb = new StringBuilder("StringBuilder excercise");

        String s = "e";
        while (-1 != sb.indexOf(s)) {
            sb.deleteCharAt(sb.indexOf(s));
        }
        System.out.println(sb);

    }
}
