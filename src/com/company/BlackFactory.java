package com.company;

public class BlackFactory extends BaseFactory {

    private final String message ="This is Black Factory";

    @Override
    public void createCircle() {

    }

    @Override
    public void createTriangle() {

    }

    public BlackFactory() {
        System.out.println(message);
    }

    @Override
    public BaseFactory getFactory() {
        return this;
    }
}
