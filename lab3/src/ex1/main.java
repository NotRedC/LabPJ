package ex1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Parabola> parabole = new ArrayList<Parabola>();
        Parabola par = new Parabola(1, 2, 3);
        parabole.add(new Parabola(2, 3, 1));
        for(Parabola p:parabole)
        {
            System.out.println(p.varfParabola());
            System.out.println(p.getSegmDeDreapta(par));
            System.out.println(Parabola.getSegmDeDreaptaDoi(p, par));
            System.out.println(p.getLungSegm(par));
            System.out.println(Parabola.getLungSegmDoi(p, par));
            System.out.println(p);
        }
    }
}

class Parabola{
    private int a;
    private int b;
    private int c;
    public Parabola(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double xParabola()
    {
        double varfX;
        varfX = (double) -b/(2*a);
        return varfX;
    }

    public double yParabola()
    {
        double varfY;
        varfY = (double) ((-b*b) + (4 * a * c))/(4*a);
        return varfY;
    }

    public String varfParabola()
    {
        return "(" + this.xParabola() + "," + this.yParabola() + ")";
    }

    public String getSegmDeDreapta(Parabola p)
    {
        double varfX, varfY;
        varfX = (this.xParabola() + p.xParabola()) / 2;
        varfY = (this.yParabola() + p.yParabola()) / 2;
        return "(" + varfX + "," + varfY + ")";
    }

    public static String getSegmDeDreaptaDoi(Parabola p1, Parabola p2)
    {
        double varfX, varfY;
        varfX = (p1.xParabola() + p2.xParabola()) / 2;
        varfY = (p1.yParabola() + p2.yParabola()) / 2;
        return "(" + varfX + "," + varfY + ")";
    }

    public double getLungSegm(Parabola p)
    {
        double X, Y;
        X = p.xParabola() - this.xParabola();
        Y = p.yParabola() - this.yParabola();
        return Math.hypot(X,Y);
    }

    public static double getLungSegmDoi(Parabola p1, Parabola p2)
    {
        double X, Y;
        X = p1.xParabola() - p2.xParabola();
        Y = p1.yParabola() - p2.yParabola();
        return Math.hypot(X,Y);
    }

    @Override
    public String toString() {
        return "f(x) = " + a + "x^2" + "+" + b + "x" + "+" + "c";
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}