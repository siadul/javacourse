package oop;

public class IphoneGold extends Iphone {

    public IphoneGold() {
        super("Iphone Gold");
        System.out.println("IphoneGold()");
    }

    /**
     * adnotacja @Override sprawia, że mamy pewność
     * że nadpisujemy metodę z klasy potomnej (inaczej
     * kod nam się nie skompiluje)
     */
    @Override
    public void showName(int a) {
        System.out.println("Iphone Gold " + a);
    }

    public void showName() {
        // jak odwoływać się do metody showName
        // z klasy Iphone?
        super.showName();
//        super.super.showName(); nie zadziała
        // możemy się odwoływać co najwyżej do metod
        // klasy rodzica

        System.out.println("IphoneGold");
    }
}
