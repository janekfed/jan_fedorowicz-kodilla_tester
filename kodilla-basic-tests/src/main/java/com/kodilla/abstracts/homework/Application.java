package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Circle circle = new Circle(2);
        circle.area();
        System.out.println(Math.PI * circle.r * Math.PI * circle.r);
        circle.circumference();
        System.out.println(2 * Math.PI * circle.r + "\r\n");

        Triangle triangle = new Triangle(3, 5, 7, 9);
        triangle.area();
        System.out.println((double) triangle.sideA * (double) triangle.height / 2);
        triangle.circumference();
        System.out.println(triangle.sideA + triangle.sideB + triangle.sideC + "\r\n");

        Square square = new Square(5);
        square.area();
        System.out.println(square.side * square.side);
        square.circumference();
        System.out.println(square.side * 4);
    }
}