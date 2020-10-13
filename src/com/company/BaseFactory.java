package com.company;

public abstract class BaseFactory implements AbstractFactory {

    @Override
    public abstract BaseFactory getFactory();

    abstract Circle createCircle(double x, double y, double radius);

    abstract Triangle createTriangle(double a, double b, double c);
}
