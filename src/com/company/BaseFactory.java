package com.company;

public abstract class BaseFactory implements AbstractFactory {

    @Override
    public abstract BaseFactory getFactory();

    public void createCircle(){

    }
    public void createTriangle(){

    }
}
