package com.epam.jwd.task1.util.creatorCar;

import com.epam.jwd.task1.model.entity.CargoTaxi;
import com.epam.jwd.task1.util.validator.ValidatorCargoTaxi;

public class CreatorCargoTaxi{
    private ValidatorCargoTaxi validator;

    public CreatorCargoTaxi(ValidatorCargoTaxi validator) throws Exception{
        if (validator == null) {
            throw new Exception("Validator for cargo taxi is null");
        }
        this.validator = validator;
    }

    public CargoTaxi create(double price, double fuelConsumption, int numberSeat,
                      double maxPayload, int percentFillingCarBody) throws Exception {
        validator.validate(price, fuelConsumption, numberSeat,
                maxPayload, percentFillingCarBody);
        return new CargoTaxi(price, fuelConsumption, numberSeat,
                maxPayload, percentFillingCarBody);
    }
}
