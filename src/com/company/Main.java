package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle tr1 = new BlackTriangle();
        System.out.println(tr1);
        Circle cir1 = new WhiteCircle();
        System.out.println(cir1);

        BaseFactory blackFactory = new BlackFactory(); }
}
