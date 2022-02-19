package com.epam.jwd.task1.util.validator;

public class ValidatorTaxicab {

    public void validate(double price, double fuelConsumption,
                         int numberSeat, double maxPayload,
                         double priceTaxiMeter) throws Exception {
        Validator.validate(price, fuelConsumption, numberSeat, maxPayload);
        validatePriceTaxiMeter(priceTaxiMeter);
    }

    public void validatePriceTaxiMeter(double priceTaxiMeter) throws Exception {
        if (priceTaxiMeter < 0){
            throw new Exception("Invalid price of taxi meter. Only it'll be more zero");
        }
    }
}

