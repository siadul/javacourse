package oop2;

public class SpecificTwo implements InterfaceOneAndTwo {
    @Override
    public void abstractMethodOne() {
        System.out.println("SpecificTwo's implementation of " +
                "abstractMethodOne");
    }

    @Override
    public void abstractMethodTwo() {
        System.out.println("SpecificTwo's implementation of " +
                "abstractMethodTwo");
    }
}
