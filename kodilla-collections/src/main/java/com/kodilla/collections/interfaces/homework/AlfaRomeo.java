package com.kodilla.collections.interfaces.homework;

public class AlfaRomeo implements Car {

    public int speed;

    public AlfaRomeo(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        if (this.speed >= 0) {
            return speed;
        } else return 0;
    }

    @Override
    public void increaseSpeed(int value) {
        this.speed += value;
        System.out.println("Increase value: " + value);
    }

    @Override
    public void decreaseSpeed(int value) {
        this.speed += (-value);
        System.out.println("Decrease value: " + value);
    }
}
