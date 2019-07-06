package oop3;

public class Wrapping {
    private int i;
    public Wrapping(int x) {
        i = x;
    }
    public Wrapping(int x, int y) {
        i = x;
        System.out.println(y);
    }
    public int value() {
        return i;
    }
}
