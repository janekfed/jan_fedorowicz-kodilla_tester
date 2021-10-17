package com.kodilla.collections.interfaces.arrays.homework;

import com.kodilla.collections.interfaces.homework.AlfaRomeo;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lancia;
import com.kodilla.collections.interfaces.homework.Maserati;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] carsTable = new Car[random.nextInt(14)];
        for (int i = 0; i < carsTable.length; i++)
            carsTable[i] = drawCar();
        for (Car car : carsTable)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int randomCar = random.nextInt(3);
        int randomIncreaseSpeed = random.nextInt(199) + 1;

        if (randomCar == 0) {
            return new Maserati(0 + randomIncreaseSpeed);
        } else if (randomCar == 1)
            return new AlfaRomeo(0 + randomIncreaseSpeed);
        else
            return new Lancia(0 + randomIncreaseSpeed);
    }

}
