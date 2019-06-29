package oop;

public class FinalB {
    public final int b;
//    static {
//        b = 4;
//    }
{
    b = 4;
}
    FinalB() {
//        b = 4;
//        b = 6; błąd
        // final dla pola sprawia, że staję się ono
        // stałą - musimy zainicjalizować je w momencie
        // definicji, w bloku inicjalizacyjnym/statycznym
        // lub konstrutkorze
    }

    public final void showB() {
        System.out.println(b);
    }
}
