package com.company;

public class Rectangle {
    double x;
    double y;
    private static int createdRectangles = 0;
    final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    final static String ENGLISH_CLASS_NAME = "Rectangle";


    public Rectangle(double x, double y) {

        this.x = x;
        this.y = y;
        createdRectangles ++;
    }

    public Rectangle(double x) {

        this.x = x;
        this.y = x;
        createdRectangles ++;
    }


    double calculateArea() {
        double p;
        p = x*y;


        return p;
    }

    void printArea(){
        double pRect = calculateArea();
        System.out.println("Площадь фигуры: " + pRect);

    }

    String printRectangleKind() {
        String rectangleKind;
        if(x==y) {
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

    void printRectanglesCount(){
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников.");
    }


    static void printClassName(boolean printInRussian) {
        if (printInRussian == false){
            System.out.println(ENGLISH_CLASS_NAME);
        }
          else{
              System.out.println(RUSSIAN_CLASS_NAME);
            }
    }
}
