package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("Square");
        System.out.println("Side length: a = " + side);
        System.out.print("Area (a²) is: ");
    }

    @Override
    public void circumference() {
        System.out.print("Circumference (a * 4) is: ");
    }
}
