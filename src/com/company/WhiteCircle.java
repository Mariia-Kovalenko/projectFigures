package com.company;

public class WhiteCircle extends WhiteFactory implements Circle {

    @Override
    public double countArea() {
        return  Math.PI* Math.pow(radius,2);
    }
}
