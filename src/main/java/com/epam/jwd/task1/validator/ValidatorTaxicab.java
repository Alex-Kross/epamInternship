package com.epam.jwd.task1.validator;

import com.epam.jwd.task1.model.entity.Minibus;
import com.epam.jwd.task1.model.entity.Taxicab;

public class ValidatorTaxicab {

    public void validate(Taxicab taxicab) throws Exception {
        validatePrice(taxicab.getPrice());
        validateFuelConsumption(taxicab.getFuelConsumption());
        validateMaxPayload(taxicab.getMaxPayload());
        validateNumberSeat(taxicab.getNumberSeat());
        validatePriceTaxiMeter(taxicab.getPriceTaxiMeter());
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

    public   void validatePriceTaxiMeter(double priceTaxiMeter) throws Exception {
        if (priceTaxiMeter < 0){
            throw new Exception("Invalid price of taxi meter");
        }
    }

}

