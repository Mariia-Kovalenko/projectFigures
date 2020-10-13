package com.company;

public class WhiteFactory extends BaseFactory {

    private final String message ="This is Black Factory";

    public WhiteFactory() {
    }

    @Override
    public BaseFactory getFactory() {
        return null;
    }
}
