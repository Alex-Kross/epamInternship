package com.epam.jwd.task1.util.creatorCar;


import com.epam.jwd.task1.model.entity.Taxicab;
import com.epam.jwd.task1.util.validator.ValidatorTaxicab;

public class CreatorTaxicab {
    private ValidatorTaxicab validator;

    public CreatorTaxicab(ValidatorTaxicab validator) throws Exception{
        if (validator == null) {
            throw new Exception("Validator for taxicab is null");
        }
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
