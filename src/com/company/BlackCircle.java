package com.company;

public class BlackCircle extends BlackFactory implements Circle {
    private double x;
    private double y;
    private double radius;

    @Override
    public double countArea() {
        return Math.PI* Math.pow(radius,2);
    }
}
