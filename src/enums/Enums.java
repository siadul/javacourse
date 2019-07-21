package enums;

import packages.Color;

import static packages.Color.*;

interface ColorInterface {
    String GREEN = "zielony"; // niejawnie final static
    String YELLOW = "żółty";
}

public class Enums {
    public static void main(String[] args) {
//        Color c = Color.GREEN;
        Color c1 = GREEN;
        Color c2 = YELLOW;
        System.out.println(c1);
        System.out.println(c1.value);
        System.out.println(GREEN.value);
        System.out.println(YELLOW.value);
        System.out.println(ColorInterface.GREEN);
//        Color c3 = new Color("Zielony"); // nie zadziała
        c1 = Color.getColor("żółty");
        switch(c1) {
            case GREEN:
                System.out.println("Wybrano zielony");
                break;
            case YELLOW:
                System.out.println("Wybrano żółty");
                break;
            case RED:
                System.out.println("Wybrano czerwony");
                break;
        }

        // Zadanie - utworzyć własny typ enum
        // i skorzystać z niego w switchu
    }
}