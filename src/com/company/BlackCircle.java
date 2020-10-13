package com.company;

public class BlackCircle extends BlackFactory implements Circle {
    double x ;
    double y ;
    double radius;

    {
        x =0;
        y = 0;
        radius = 1;
    }



    @Override
    public String toString() {
        return "Created circle with center in "+
                "("+ x +
                ";" + y + ")"+
                " and radius "+ radius;
    }

    @Override
    public double countArea() {
        return Math.PI* Math.pow(radius,2);
    }
}
