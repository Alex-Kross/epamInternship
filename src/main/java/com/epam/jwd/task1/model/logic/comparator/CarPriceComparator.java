package com.epam.jwd.task1.model.logic.comparator;

import com.epam.jwd.task1.model.entity.Car;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
//        if (car1.getFuelConsumption() > car2.getFuelConsumption()) {
//            return 1;
//        } else if (car1.getFuelConsumption() < car2.getFuelConsumption()) {
//            return -1;
//        }
        return (int) (car1.getPrice() - car2.getPrice());
    }
}
