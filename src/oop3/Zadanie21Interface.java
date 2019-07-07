package oop3;

// Utwórz interfejs zawierający klasę zagnieżdżoną
// z metodą statyczną, która wywołuje metodę interfejsu
// i wypisuje wynik wywołania na wyjściu.
// Zaimplmentuj interfejs i przekaż egzemplarz implementacji
// do metody.
public interface Zadanie21Interface {
    String show();
    class Zadanie21 { // implements Zadanie21Interface {
        public String show() {
            return "Hello from Zadanie21Inner:show";
        }
        public static void test(Zadanie21Interface zadanie21Interface) {
            System.out.println(
                    zadanie21Interface.show()
            );
        }
    }
}
