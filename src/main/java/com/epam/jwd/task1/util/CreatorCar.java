package com.epam.jwd.task1.util;

import com.epam.jwd.task1.model.entity.Car;
import com.epam.jwd.task1.model.entity.CargoTaxi;
import com.epam.jwd.task1.validator.Validator;

public class CreatorCar {
    private Validator validator;
    private Car car;

    public CreatorCar(Validator validator){//, Car car){
        this.validator = validator;
        //this.car = car;
    }

    public Car create(double price, double fuelConsumption, int numberSeat, double maxPayload) throws Exception {
        car = new Car(price, fuelConsumption, numberSeat, maxPayload);
        validator.validate(car);
        return car;
    }
//    public CargoTaxi create(double price, double fuelConsumption,
//                int numberSeat, double maxPayload, int g) throws Exception {
//        validator.validate(price, fuelConsumption, numberSeat, maxPayload,g);
//        return new CargoTaxi(price, fuelConsumption, numberSeat, maxPayload, g);
//    }
}
