public class Static {
    int field1;
    static int fieldStatic;
    static int fieldStatic2 = 10;
    static int fieldStatic3 = 15;
    static int fieldStatic4;
    static {
        System.out.println("static scope");
        System.out.println(fieldStatic4);
        fieldStatic4 = fieldStatic2 + fieldStatic3;
        System.out.println("end of static scope");
    }
}
