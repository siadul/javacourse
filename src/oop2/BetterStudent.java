package oop2;

public class BetterStudent implements CanLearnJavaAndFacebookInterace {

    @Override
    public void learnJava() {
        System.out.println("Better student is learning Java at this moment.");
    }

    @Override
    public void writeComments() {
        System.out.println("Better student is writing a comment at this moment.");
    }
}
