package com.company;

public class WhiteTriangle extends WhiteFactory implements Triangle {


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
