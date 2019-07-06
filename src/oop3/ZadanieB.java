package oop3;

public class ZadanieB {
    public ZadanieAInterface produceZadanieAInterface() {
        // standardowo
        return new ZadanieAInterface() {
            @Override
            public void show() {
                System.out.println("Anonymous Inner class " +
                        "ZadanieAInner");
                System.out.println("Anonymous Inner class " +
                        "ZadanieAInner");
            }

        };

        // lambda1
//        return () -> {
//            System.out.println("Anonymous Inner class " +
//                    "ZadanieAInner");
//            System.out.println("Anonymous Inner class " +
//                    "ZadanieAInner");
//        };

        // lambda2
//        return () -> System.out.println("Anonymous Inner class " +
//                "ZadanieAInner");


    }
}
