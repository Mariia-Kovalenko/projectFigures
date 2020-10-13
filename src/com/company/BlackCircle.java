package com.company;

public class BlackCircle extends BlackFactory implements Circle {
    double x = 0;
    double y = 0;
    double radius =1;

    public BlackCircle(double x, double y, double radius) {

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
