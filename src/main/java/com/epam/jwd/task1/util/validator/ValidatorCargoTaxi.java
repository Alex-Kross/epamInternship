package com.epam.jwd.task1.util.validator;

public class ValidatorCargoTaxi{

    public void validate(double price, double fuelConsumption,
                         int numberSeat, double maxPayload,
                         int percent) throws Exception {
        Validator.validate(price, fuelConsumption, numberSeat, maxPayload);
        validatePercent(percent);
    }

    public void validatePercent(int percent) throws Exception {
        if (percent < 0 || percent > 100){
            throw new Exception("Invalid percent. Percent only be 0 to 100");
        }
    }
}

