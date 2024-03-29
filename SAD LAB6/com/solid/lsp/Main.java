package com.solid.lsp;


public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + reg1.getWidth());
        System.out.println("Height = " + reg1.getHeight());
        System.out.println("Area = " + reg1.getArea());

        Square reg2 = new Square(5);
        // reg2.setWidth(width);
        // reg2.setHeight(height);
        reg2.setSide(20);
        System.out.println("====   Square  ====");
        System.out.println("Width = " + reg2.getWidth());
        System.out.println("Height = " + reg2.getHeight());
        System.out.println("Side = " + reg2.getSide());
        System.out.println("Area = " + reg2.getArea());
    }
}
