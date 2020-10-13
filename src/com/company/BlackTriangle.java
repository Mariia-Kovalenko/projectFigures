package com.company;

public class BlackTriangle extends BlackFactory implements Triangle {

    private double a;
    private double b;
    private double c;
    private double h;

    {
        a = 1;
        b = 1;
        c = 1;
        h = Math.sqrt(3)*0.5;
    }

    @Override
    public String toString() {
        return "Created triangle with sides: " +
                " a = " + a +
                " b = " + b +
                " c = " + c;
    }

    @Override
    public double countPerimetr() {
        return a+b+c;
    }
}
