package com.epam.jwd.task1.model.logic.comparator;

import com.epam.jwd.task1.model.entity.Car;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return (int) (car1.getPrice() - car2.getPrice());
    }
}
