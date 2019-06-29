package oop;

public class Phone {
    public String name;

    /*public Phone() {
        this.name = "phone";
        System.out.println("konstruktor z klasy Phone");
    }*/

    // problem sie pojawia w przypadku konstruktorów
    // sparametryzowanych
    public Phone(String name) {
        System.out.println("Phone(String name)");
        this.name = name;
    }

    public void showName() {
        System.out.println("Phone");
    }
}
