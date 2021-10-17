package com.kodilla.collections.interfaces.arrays.homework;

import com.kodilla.collections.interfaces.homework.AlfaRomeo;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lancia;
import com.kodilla.collections.interfaces.homework.Maserati;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Initial speed: 0");
        System.out.println("Current speed: " + car.getSpeed());
    }

    public static String getCarBrand(Car car) {
        if (car instanceof Maserati)
            return "Maserati";
        else if (car instanceof AlfaRomeo)
            return "Alfa Romeo";
        else if (car instanceof Lancia)
            return "Lancia";
        else
            return "Unknown brand";
    }
}
