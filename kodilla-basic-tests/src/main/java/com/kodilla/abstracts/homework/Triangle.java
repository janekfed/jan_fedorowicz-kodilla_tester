package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public int sideA;
    public int sideB;
    public int sideC;
    public int height;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("Triangle");
        System.out.println("Sides length: a = " + sideA + ", b = " + sideB + ", c = " + sideC);
        System.out.println("Height: h = " + height);
        System.out.print("Area (a * h / 2) is: ");
    }

    @Override
    public void circumference() {
        System.out.print("Circumference (a + b + c) is: ");
    }
}
