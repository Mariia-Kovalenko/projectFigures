package com.company;

public abstract class BaseFactory implements AbstractFactory {

    @Override
    public abstract BaseFactory getFactory();

    public abstract void createCircle();
    public abstract void createTriangle();
}
