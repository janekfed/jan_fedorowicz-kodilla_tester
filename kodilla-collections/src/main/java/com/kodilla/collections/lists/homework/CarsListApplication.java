package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.AlfaRomeo;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lancia;
import com.kodilla.collections.interfaces.homework.Maserati;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.interfaces.arrays.homework.CarUtils.getCarBrand;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new AlfaRomeo(123));
        cars.add(new Lancia(134));
        cars.add(new Maserati(145));

        Maserati carToBeRemoved = new Maserati(178);
        cars.add(carToBeRemoved);

        cars.remove(0);
        cars.remove(carToBeRemoved);

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println("-----------------------------");
            System.out.println("Car brand: " + getCarBrand(car));
            System.out.println("Initial speed: 0");
            System.out.println("Current speed: " + car.getSpeed());
        }
    }
}
