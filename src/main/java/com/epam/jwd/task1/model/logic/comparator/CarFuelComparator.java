package com.epam.jwd.task1.model.logic.comparator;

import com.epam.jwd.task1.model.entity.Car;

import java.util.Comparator;

/**
 * It implements sorting cars by fuel consumption.
 * This class implements Comparator and override
 * his method
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class CarFuelComparator implements Comparator<Car> {

    /**
     * Sort cars in ascending order
     *
     * @param car1 part of list cars
     * @param car2 part of list cars
     * @return number what impact to sorting
     * @see Comparator#compare(Object, Object) 
     */
    @Override
    public int compare(Car car1, Car car2) {
        return (int) (car1.getFuelConsumption() - car2.getFuelConsumption());
    }
}
