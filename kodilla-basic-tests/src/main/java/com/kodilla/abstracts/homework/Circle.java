package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println("Circle");
        System.out.println("Radius: r = " + r);
        System.out.print("Area (Πr²) is: ");
    }

    @Override
    public void circumference() {
        System.out.print("Circumference (2Πr) is: ");
    }
}
