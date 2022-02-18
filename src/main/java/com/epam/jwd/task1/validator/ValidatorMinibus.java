package com.epam.jwd.task1.validator;

import com.epam.jwd.task1.model.entity.Minibus;

import java.util.Map;

public class ValidatorMinibus {

    public void validate(Minibus minibus) throws Exception {
        validatePrice(minibus.getPrice());
        validateFuelConsumption(minibus.getFuelConsumption());
        validateMaxPayload(minibus.getMaxPayload());
        validateNumberSeat(minibus.getNumberSeat());
        validatePriceLicense(minibus.getPriceLicense());
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

    public   void validatePriceLicense(double priceLicense) throws Exception {
        if (priceLicense < 0){
            throw new Exception("Invalid price of license");
        }
    }

}

