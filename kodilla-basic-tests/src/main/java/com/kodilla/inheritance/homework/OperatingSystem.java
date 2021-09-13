package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int winStarted;
    private int winEnded;

    public OperatingSystem(int winStarted, int winEnded) {
        this.winStarted = winStarted;
        this.winEnded = winEnded;
    }

    public void winName() {
        System.out.println(getClass().getSimpleName());
    }
    public void turnOn() {
        System.out.println("error");
    }

    public void turnOff() {
        System.out.println("error");
    }

    public int getWinStarted() {
        return winStarted;
    }

    public int getWinEnded() {
        return winEnded;
    }
}