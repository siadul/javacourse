package oop3;

public class ZadanieA {
    public ZadanieAInterface produceZadanieAInterface() {
        class ZadanieAInner implements ZadanieAInterface {

            @Override
            public void show() {
                System.out.println("Inner class ZadanieAInner");
            }
        }

        return new ZadanieAInner();
    }
}
