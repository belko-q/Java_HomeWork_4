package com.company;

public class Rectangle {
    double x;
    double y;
    double z;

    Rectangle(double x, double y) {

        this.x = x;
        this.y = y;
    }

    Rectangle(double z) {

        this.z = z;

    }


    double calculateArea(Rectangle rectangle1) {
        double p;
        if(x!=0) {
            p = x*y;
        }
        else {
            p = z*z;
        }


        return p;
    }

    void printArea(Rectangle rectangle1){
        double pRect = calculateArea(rectangle1);
        System.out.println("Площадь фигуры: " + pRect);

    }

    String printRectangleKind(Rectangle rectangle1) {
        String rectangleKind;
        if(z!=0) {
            rectangleKind = "Это квадрат";
        }
        else{
             rectangleKind = "Это прямоугольник";
        }
        System.out.println(rectangleKind);
        return rectangleKind;
    }

    boolean isTheSameRectangle(Rectangle rectangle1) {
        boolean dublicate = false;
        if (rectangle1.x == this.x && rectangle1.y == this.y) {
            dublicate = true;
        }
        System.out.println(dublicate);
        return dublicate;
    }




}
