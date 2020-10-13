package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle tr1 = new BlackTriangle();
        System.out.println(tr1);
        Circle cir1 = new WhiteCircle();
        System.out.println(cir1);
        Circle cir2 = new WhiteCircle(2,4,3);
        System.out.println(cir2);
        System.out.println("-----------------------");
        BaseFactory blackFactory = new BlackFactory();
        BaseFactory  whiteFactory = new WhiteFactory();
        blackFactory.getFactory();
        whiteFactory.getFactory();

    }
}
