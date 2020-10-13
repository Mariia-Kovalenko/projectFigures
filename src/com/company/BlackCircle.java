package com.company;

public class BlackCircle extends BlackFactory implements Circle {

    @Override
    public double countArea() {
        return Math.PI* Math.pow(radius,2);
    }
}
