package com.company;

public class WhiteCircle extends WhiteFactory implements Circle {
    @Override
    public String toString() {
        return "Created circle with center in "+
                "("+ x +
                ";" + y + ")"+
                " and radius "+ radius;
    }

    @Override
    public double countArea() {
        return  Math.PI* Math.pow(radius,2);
    }
}
