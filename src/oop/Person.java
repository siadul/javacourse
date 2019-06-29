package oop;

public class Person {
    String name = ""; // name ma dostęp pakietowy
    // możemy z tego pola korzystać wyłącznie w obrębie
    // tego samego pakietu

    public Person(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println(name);
    }

    void showClassName1() {
        System.out.println("Person");
    }

    private void showClassName2() {
        System.out.println("private: Person");
    }

    public void showClassName3() {
        showClassName2();
    }

    protected void showClassName4() {
        System.out.println("protected: Person");
    }
}
