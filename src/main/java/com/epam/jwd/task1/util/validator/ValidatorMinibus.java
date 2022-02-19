package com.epam.jwd.task1.validator;

public class ValidatorMinibus {

    public void validate(double price, double fuelConsumption,
                         int numberSeat, double maxPayload,
                         double priceLicense) throws Exception {
        Validator.validate(price, fuelConsumption, numberSeat, maxPayload);
        validatePriceLicense(priceLicense);
    }

    public   void validatePriceLicense(double priceLicense) throws Exception {
        if (priceLicense < 0){
            throw new Exception("Invalid price of license");
        }
    }
}

