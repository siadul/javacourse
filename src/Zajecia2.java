public class Zajecia2 {
    public static void main(String... args) {
        staticPlayground();

    }

    public static void staticPlayground() {
        System.out.println("staticPlayground scope");
        Static s1 = new Static();
        s1.field1 = 66;
        Static s2 = new Static();
        s2.field1 = 99;
        System.out.println(s1.field1);
        System.out.println(s2.field1);

        System.out.println("Pole statyczne");
        s1.fieldStatic = 55;
        s2.fieldStatic = 77;
        Static.fieldStatic = 99;
        System.out.println(s1.fieldStatic);
        System.out.println(s2.fieldStatic);
        System.out.println(Static.fieldStatic);
        System.out.println(Static.fieldStatic4);

        // uwaga, blok statyczny wykonywany jest tylko wtedy
        // gdy odwłamy się do elementu statycznego klasy!

        // ZADANIE
        // Utworzyć klasę, która będzie zawierała pole statyczne
        // mówiące o ilości egzemplarzy danej klasy
        // tzn. każde utworzenie obiektu zwięszka tę wartość o 1
    }
}
