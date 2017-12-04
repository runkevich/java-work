package com.gmail.runkevich8.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] arg) throws IOException {
        System.out.println("Расчет площадей: 1 - Треугольник, 2 - Круг, 3 - Квадрат, 4 - Прямоугольник.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
        Shape shape = null;

        switch (i) {
            case 1: {
                shape = new Triangle(5, 2);
                break;
            }
            case 2: {
                shape = new Circle(4);
                break;
            }
            case 3: {
                shape = new Square(7);
                break;
            }
            case 4: {
                shape = new Rectangle(2,6);
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

    }

}
