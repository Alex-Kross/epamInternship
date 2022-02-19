package com.epam.jwd.task1.util.creatorCar;

import com.epam.jwd.task1.model.entity.Minibus;
import com.epam.jwd.task1.util.validator.ValidatorMinibus;

public class CreatorMinibus {
    private ValidatorMinibus validator;

    public CreatorMinibus(ValidatorMinibus validator) throws Exception{
        if (validator == null) {
            throw new Exception("Validator for minibus taxi is null");
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
