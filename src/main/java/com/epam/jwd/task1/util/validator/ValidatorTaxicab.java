package com.epam.jwd.task1.util.validator;

/**
 * Class validates taxicab
 * It uses method in class Validator for
 * validates base properties
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class ValidatorTaxicab {

    /**
     * Validate base parameters and special
     * parameter for taxicab
     *
     * @param price price for car
     * @param fuelConsumption fuel consumption for car
     * @param numberSeat number seats in car
     * @param maxPayload max payload for car
     * @param priceTaxiMeter price taxi meter
     * @throws Exception occur if one from calling method
     *                   throw exception
     * @see Validator#validate(double, double, int, double)
     */
    public void validate(double price, double fuelConsumption,
                         int numberSeat, double maxPayload,
                         double priceTaxiMeter) throws Exception {
        Validator.validate(price, fuelConsumption, numberSeat, maxPayload);
        validatePriceTaxiMeter(priceTaxiMeter);
    }

    /**
     * Check price taxi meter on correctly
     * @param priceTaxiMeter price taxi meter
     * @throws Exception occur if condition doesn't execute
     */
    public void validatePriceTaxiMeter(double priceTaxiMeter) throws Exception {
        if (priceTaxiMeter < 0){
            throw new Exception("Invalid price of taxi meter. Only it'll be more zero");
        }
    }
}

