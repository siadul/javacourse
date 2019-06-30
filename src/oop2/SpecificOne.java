package oop2;

public class SpecificOne implements InterfaceOneAndTwo {
    @Override
    public void abstractMethodOne() {
        System.out.println("SpecificOne's implementation of " +
                "abstractMethodOne");
    }

    @Override
    public void abstractMethodTwo() {
        System.out.println("SpecificOne's implementation of " +
                "abstractMethodTwo");
    }
}
