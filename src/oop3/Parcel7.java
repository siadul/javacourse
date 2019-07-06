package oop3;

public class Parcel7 {
    public Contents contents() {
        return new Contents() { // klasa anonimowa
            // to klasa, która nie posiada nazwy.
            // Nie posiada jej, ponieważ jedynym jej
            // zadaniem jest implementacja interfejsu (lub
            // dziedziczenie po innej klasie)

            // Uwaga!
            // Nie da się tworzyć obiektu z interfejsu.
            // Możemy tworzyć obiekt tylko z klasy (nieabstrakcyjnej)

            // Wniosek
            // Tutaj musimy tworzyć nową klasę.
            // Klasa ta nie posiada nazwy

            // Wniosek
            // Skoro klasa anonimowa nie posiada nazwy
            // nie możemy stworzyć w jej obrębie konstruktora.
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }
}
