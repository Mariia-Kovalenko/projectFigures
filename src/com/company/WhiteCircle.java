package com.company;

public class WhiteCircle extends WhiteFactory implements Circle {
    private double x;
    private double y;
    private double radius;


    @Override
    public double countArea() {
        return  Math.PI* Math.pow(radius,2);
    }
}
