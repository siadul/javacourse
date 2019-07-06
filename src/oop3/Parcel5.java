package oop3;

public class Parcel5 {
    public Destination destination(String s) {
        // tutaj definicja ciała metody
        int a = 0;

        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() {
                return label;
            }
        }

        {
            class PDestination2 implements Destination {
                private String label;
                private PDestination2(String whereTo) {
                    label = whereTo;
                }
                public String readLabel() {
                    PDestination pDestination = new PDestination(
                            "From inner PDestination2 class");
                    return label;
                }
            }
        }

        return new PDestination(s);
    }
}
