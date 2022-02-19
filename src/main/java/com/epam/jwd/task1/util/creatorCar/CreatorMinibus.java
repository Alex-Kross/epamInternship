package com.epam.jwd.task1.util;


import com.epam.jwd.task1.model.entity.CargoTaxi;
import com.epam.jwd.task1.model.entity.Minibus;
import com.epam.jwd.task1.validator.ValidatorCargoTaxi;
import com.epam.jwd.task1.validator.ValidatorMinibus;

public class CreatorMinibus {
    private ValidatorMinibus validator;

    public CreatorMinibus(ValidatorMinibus validator) {
        if (validator == null) {

        }
        this.validator = validator;
    }

    public Minibus create(double price, double fuelConsumption, int numberSeat,
                      double maxPayload,  double priceLicense) throws Exception {
        validator.validate(price, fuelConsumption, numberSeat,
                maxPayload, priceLicense);
        return new Minibus(price, fuelConsumption, numberSeat,
                maxPayload, priceLicense);
    }
}
