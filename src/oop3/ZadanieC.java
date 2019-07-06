package oop3;

public class ZadanieC {
    public ZadanieAInterface produceZadanieAInterface() {
        ZadanieAInterface zadanieAInterface = null;
        {
            if(3 < 5){
                class ZadanieAInner implements ZadanieAInterface {

                    @Override
                    public void show() {
                        System.out.println("Inner class ZadanieAInner");
                    }

                    public ZadanieC getOuter() { // to nam nic nie da
                        return ZadanieC.this; // poza zakresem
                    }// tracimy dostęp do całej klasy a zatem
                    // do metody również
                }

                zadanieAInterface = new ZadanieAInner();
            }
        }

        return zadanieAInterface;
    }
}
