package oop;

// abstract przed class oznacza, że nie może istnieć
// żaden obiekt tej klasy
// Uwaga! możemy utworzyć obiekt klasy, która dziedziczy
// po niej
public abstract class Shape {
    // abstract przed metodą oznacza, że metoda
    // służy wyłącznie do przeciążania
    public abstract void draw();
}
