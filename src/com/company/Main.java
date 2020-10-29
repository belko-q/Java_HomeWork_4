package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 7);
        Rectangle rectangle2 = new Rectangle(3, 7);
        Rectangle rectangle3 = new Rectangle(3);


        rectangle2.calculateArea();
        rectangle2.printArea();

        rectangle3.calculateArea();
        rectangle3.printArea();

        rectangle2.printRectangleKind();
        rectangle3.printRectangleKind();

        rectangle1.isTheSameRectangle(rectangle2);

        rectangle1.printRectanglesCount();

        rectangle1.printClassName(false);
        rectangle1.printClassName(true);

    }
}
