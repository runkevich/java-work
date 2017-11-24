package com.gmail.runkevich8.Task4;

public class Main {

    public static void main(String[] arg) {

        Shape shape = null;

        switch (1) {
            case 1: {
                shape = new Triangle(5, 2);
                break;
            }
            case 2: {
                shape = new Circle(4);
                break;
            }
            default: {
                System.out.println("Такой фигуры нет");
            }
        }
        printShapeSqr(shape);
    }

    private static void printShapeSqr(Shape shape) {

        System.out.println(" площадь фигуры " + shape.getSqr());

//        if(shape instanceof Triangle){
//            System.out.println("треугольник");
//        }
//        if(shape instanceof Circle){
//            System.out.println("круг");
//        }
    }
}
