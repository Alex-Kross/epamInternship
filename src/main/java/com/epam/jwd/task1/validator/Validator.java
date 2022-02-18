package com.epam.jwd.task1.validator;

import com.epam.jwd.task1.model.entity.Car;
import com.epam.jwd.task1.model.entity.CargoTaxi;

public class Validator{

    public void validate(Car car) throws Exception {
        validatePrice(car.getPrice());
        validateFuelConsumption(car.getFuelConsumption());
        validateMaxPayload(car.getMaxPayload());
        validateNumberSeat(car.getNumberSeat());
    }

    public void validatePrice(double price) throws Exception {
        if (price < 0){
            throw new Exception("Invalid price");
        }
    }

    public void validateNumberSeat(int numberSeat) throws Exception {
        if (numberSeat < 0){
            throw new Exception("Invalid number seats");
        }
    }

    public void validateFuelConsumption(double FuelConsumption) throws Exception {
        if (FuelConsumption < 0){
            throw new Exception("Invalid fuel consumption");
        }
    }

    public   void validateMaxPayload(double maxPayload) throws Exception {
        if (maxPayload < 0){
            throw new Exception("Invalid max payload");
        }
    }
}
