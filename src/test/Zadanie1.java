package test;

import oop.A;

class Punkt {
    public double x;
    public double y;

}

abstract class Ksztalt2D {
    public abstract double obwod();
    public void show() {
        System.out.println("Obwód figury wynosi " +
                obwod());
    }
}

class Kolo extends Ksztalt2D {
    public Punkt Sr;
    public double r;

    @Override
    public double obwod() {
        return Math.PI * 2 * r;
    }
}

class Trojkat extends Ksztalt2D {
    public Punkt A;
    public Punkt B;
    public Punkt C;
    private double a;
    private double b;
    private double c;

    public Trojkat() {
        A = new Punkt();
        A.x = 0;
        A.y = 0;
        B = new Punkt();
        B.x = 2;
        B.y = -2;
        C = new Punkt();
        C.x = 2;
        C.y = 2;
        boki();
    }
    public Trojkat(Punkt A, Punkt B, Punkt C) {
        this.A = A;
        this.B = B;
        this.C = C;
        boki();
    }
    public Trojkat(
            double Ax, double Ay,
            double Bx, double By,
            double Cx, double Cy
                   ) {
        A = new Punkt();
        A.x = Ax;
        A.y = Ay;
        B = new Punkt();
        B.x = Bx;
        B.y = By;
        C = new Punkt();
        C.x = Cx;
        C.y = Cy;
        boki();
    }

    private void boki() {
        a = Math.sqrt((C.x-B.x)*(C.x-B.x)
                +(C.y-B.y)*(C.y-B.y));
        b = Math.sqrt((A.x-C.x)*(A.x-C.x)
                +(A.y-C.y)*(A.y-C.y));
        c = Math.sqrt((A.x-B.x)*(A.x-B.x)
                +(A.y-B.y)*(A.y-B.y));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        boki();
    }

    public void setAA(Punkt a) {
        this.A = a;
        boki();
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        boki();
    }

    public void setBB(Punkt b) {
        this.B = b;
        boki();
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        boki();
    }

    public void setCC(Punkt c) {
        this.C = c;
        boki();
    }

    @Override
    public double obwod() {
        return a + b + c;
    }
}

public class Zadanie1 {
    public static void main(String[] arg) {
        Trojkat tr1 = new Trojkat();
        System.out.println(tr1.getA());
        System.out.println(tr1.getB());
        System.out.println(tr1.getC());
        Punkt A = new Punkt();
        A.x = -1;
        A.y = 0.3;
        Punkt B = new Punkt();
        B.x = -1;
        B.y = 2.3;
        Punkt C = new Punkt();
        C.x = 3;
        C.y = 1.3;
        tr1.setAA(A);
        tr1.setBB(B);
        tr1.setCC(C);
        System.out.println(tr1.getA());
        System.out.println(tr1.getB());
        System.out.println(tr1.getC());

        // wynik.txt
        // Files, Path
        Kolo k = new Kolo();
        Trojkat tr = new Trojkat();
        k.r = 1;
        Punkt p = new Punkt();
        p.x = 0;
        p.y = 0;
        k.Sr = p;

        Punkt p1 = new Punkt();
        p1.x = 0;
        p1.y = 0;
        tr.setAA(p1);

        Punkt p2 = new Punkt();
        p1.x = 1;
        p1.y = 1;
        tr.setAA(p2);

        Punkt p3 = new Punkt();
        p1.x = -1;
        p1.y = 1;
        tr.setAA(p3);

        k.show();
        tr.show();
    }
}
