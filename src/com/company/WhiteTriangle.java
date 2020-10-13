package com.company;

public class WhiteTriangle extends WhiteFactory implements Triangle {
    double a;
    double b;
    double c;
    double h ;

    {
        a= 1;
        b = 1;
        c = 1;
        h = Math.sqrt(3)*0.5;
    }

    public WhiteTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

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
