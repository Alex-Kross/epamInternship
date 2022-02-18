package com.epam.jwd.task1.util;

import com.epam.jwd.task1.model.entity.Car;
import com.epam.jwd.task1.model.entity.CargoTaxi;
import com.epam.jwd.task1.validator.Validator;

public class CreatorCargoTaxi extends CreatorCar{
    private Validator validator;
    private Car car;

    public CreatorCargoTaxi(Validator validator) {
        super(validator);
    }git

    public Car create(double price, double fuelConsumption, int numberSeat,
                      double maxPayload, int percentFillingCarBody) throws Exception {
        car = new CargoTaxi(price, fuelConsumption, numberSeat,
                maxPayload, percentFillingCarBody);
        validator.validate(car);
        return car;
    }
//    public CargoTaxi create(double price, double fuelConsumption,
//                int numberSeat, double maxPayload, int g) throws Exception {
//        validator.validate(price, fuelConsumption, numberSeat, maxPayload,g);
//        return new CargoTaxi(price, fuelConsumption, numberSeat, maxPayload, g);
//    }
}
