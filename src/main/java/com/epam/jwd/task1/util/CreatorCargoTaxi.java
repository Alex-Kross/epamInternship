package com.epam.jwd.task1.util;


import com.epam.jwd.task1.model.entity.CargoTaxi;
import com.epam.jwd.task1.validator.ValidatorCargoTaxi;

public class CreatorCargoTaxi{
    private ValidatorCargoTaxi validator;

    public CreatorCargoTaxi(ValidatorCargoTaxi validator) {
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
