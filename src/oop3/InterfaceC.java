package oop3;

import java.util.Random;

public interface InterfaceC extends
        InterfaceA, InterfaceB {
//    final static int JANUARY = 1, FEBRUARY = 2;
    int JANUARY = 1, FEBRUARY = 2;
    Random MARCH = new Random(47);

    // pola w interfejsie są zawsze finalne i statyczne
    // a zatem możemy pominąć te modyfikatory

    class CImplementation implements InterfaceC {

        interface D {
            void d();
            static void staticD() {
                System.out.println("staticD() from inner interface D" +
                        "from inner class Cimplementation" +
                        "from InterfaceC");
            }

            static class E {
                void e() {
//                    d(); // nie zadziała! kontekst statyczny!
                    staticD();
                }

            }
        }

        @Override
        public void a() {
            System.out.println("a() from InterfaceC" +
                    "Inner class CImplementation");
        }

        @Override
        public void b() {
            System.out.println("b() from InterfaceC" +
                    "Inner class CImplementation");
        }

        @Override
        public int a(int a) {
            return 0;
        }
    }
}
