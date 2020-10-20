package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 7);
        Rectangle rectangle2 = new Rectangle(3, 7);
        Rectangle rectangle3 = new Rectangle(3);
        Rectangle rectangle4 = new Rectangle(4, 6);


        rectangle2.calculateArea(rectangle2);
        rectangle2.printArea(rectangle2);

        rectangle3.calculateArea(rectangle3);
        rectangle3.printArea(rectangle3);

        rectangle2.printRectangleKind(rectangle2);
        rectangle3.printRectangleKind(rectangle3);

        rectangle1.isTheSameRectangle(rectangle2);
        rectangle1.isTheSameRectangle(rectangle4);
    }
}
