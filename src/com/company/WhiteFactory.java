package com.company;

public class WhiteFactory extends BaseFactory {

    private final String message ="This is White Factory";

    public WhiteFactory() {
        System.out.println(message);
    }

    @Override
    public void createCircle() {

    }

    @Override
    public void createTriangle() {

    }

    @Override
    public BaseFactory getFactory() {
        return this;
    }
}
