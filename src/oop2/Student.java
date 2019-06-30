package oop2;

public class Student implements CanFacebookInterface {
    @Override
    public void writeComments() {
        System.out.println("Student is writing a comment at this moment.");
    }
}
