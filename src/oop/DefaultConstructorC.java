package oop;

public class DefaultConstructorC extends DefaultConstructorB {
    // Jeżeli utworzymy choć 1 konstrutkor własny
    // to wówczas nie jest tworzony przez kompilator
    // konstruktor domyślny
    // a zatem konstrukcja tego obiektu będzie się mogła
    // odbywać jedynie poprzez ten konstruktor zdefiniowany
    // przez nas
    public DefaultConstructorC(String text) {
        System.out.println(
                "DefaultConstructorC(String text): " + text
        );
    }
}
