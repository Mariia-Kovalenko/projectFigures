package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------");
        BaseFactory blackFactory = new BlackFactory();
        BaseFactory whiteFactory = new WhiteFactory();
        System.out.println();
        System.out.println("-----Black Circle-----");
        Circle blackCircle = blackFactory.createCircle(2,2,3);
        System.out.println(blackCircle);
        System.out.println(" Area: ");
        System.out.println(blackCircle.countArea());
        System.out.println();
        System.out.println("-----White Circle-----");
        Circle whiteCircle = whiteFactory.createCircle(4,1,4);
        System.out.println(whiteCircle);
        System.out.println(" Area: ");
        System.out.println(whiteCircle.countArea());
        System.out.println();
        System.out.println("-----Black Triangle----");
        Triangle blackTriangle = blackFactory.createTriangle(2,4,1);
        System.out.println(blackTriangle);
        System.out.println(" Perimeter: ");
        System.out.println(blackTriangle.countPerimetr());
        System.out.println();
        System.out.println("-----White Triangle----");
        Triangle whiteTriangle = whiteFactory.createTriangle(2,4,1);
        System.out.println(whiteTriangle);
        System.out.println(" Perimeter: ");
        System.out.println(whiteTriangle.countPerimetr());

    }
}
