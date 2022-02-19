package com.epam.jwd.task1.util;


import com.epam.jwd.task1.model.entity.Minibus;
import com.epam.jwd.task1.model.entity.Taxicab;
import com.epam.jwd.task1.validator.ValidatorMinibus;
import com.epam.jwd.task1.validator.ValidatorTaxicab;

public class CreatorTaxicab {
    private ValidatorTaxicab validator;

    public CreatorTaxicab(ValidatorTaxicab validator) {
        this.validator = validator;
    }

    public Taxicab create(double price, double fuelConsumption, int numberSeat,
                          double maxPayload, double priceTaxiMeter) throws Exception {
        validator.validate(price, fuelConsumption, numberSeat,
                maxPayload, priceTaxiMeter);
        return new Taxicab(price, fuelConsumption, numberSeat,
                maxPayload, priceTaxiMeter);
    }
}
