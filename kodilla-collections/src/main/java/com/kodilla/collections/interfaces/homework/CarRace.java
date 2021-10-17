package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Maserati maserati = new Maserati(176);
        doRace(maserati);

        AlfaRomeo alfaRomeo = new AlfaRomeo(158);
        doRace(alfaRomeo);

        Lancia lancia = new Lancia(64);
        doRace(lancia);
    }

    private static void doRace(Car car) {
        System.out.println("-----------------------------------------------");
        System.out.println(car.getClass().getSimpleName());
        System.out.println("-----------------------------------------------");
        System.out.println("Initial speed: " + car.getSpeed());
        car.increaseSpeed(48);
        car.increaseSpeed(32);
        car.decreaseSpeed(52);
        car.decreaseSpeed(47);
        car.decreaseSpeed(75);
        System.out.println("Current speed: " + car.getSpeed() + "\n");
    }
}
