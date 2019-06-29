package oop;

import java.util.Arrays;

public class Teacher extends Someone {
    protected int a;
    protected char[] tab;
    public String name = "Teacher";

    public void showName() {
        System.out.println("Hello everybody - " + name);
    }

    public void init() {
        char[] a2 = {'a', 'b', 'c'};
//        tab = a2;
    }

    public void print() {
        System.out.println(
                Arrays.toString(tab)
        );
    }

}
