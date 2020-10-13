package com.company;

public class BlackCircle extends BlackFactory implements Circle {

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
