package com.kodilla.inheritance.homework;

public class Windows95 extends OperatingSystem {

    public Windows95() {
        super(1995, 2001);
    }

    @Override
    public void turnOn() {
        System.out.println("Started in " + getWinStarted() + ".");
    }

    @Override
    public void turnOff() {
        System.out.println("Ended in " + getWinEnded() + ".");
    }
}