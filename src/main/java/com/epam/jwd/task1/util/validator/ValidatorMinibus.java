package com.epam.jwd.task1.util.validator;

/**
 * Class validates minibus
 * It uses method in class Validator for
 * validates base properties
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class ValidatorMinibus {

    /**
     * Validate base parameters and special
     * parameter for minibus
     *
     * @param price price for car
     * @param fuelConsumption fuel consumption for car
     * @param numberSeat number seats in car
     * @param maxPayload max payload for car
     * @param priceLicense price license
     * @throws Exception occur if one from calling method
     *                   throw exception
     * @see Validator#validate(double, double, int, double)
     */
    public void validate(double price, double fuelConsumption,
                         int numberSeat, double maxPayload,
                         double priceLicense) throws Exception {
        Validator.validate(price, fuelConsumption, numberSeat, maxPayload);
        validatePriceLicense(priceLicense);
    }

    /**
     * Check price license on correctly
     * @param priceLicense price license
     * @throws Exception occur if condition doesn't execute
     */
    public void validatePriceLicense(double priceLicense) throws Exception {
        if (priceLicense < 0){
            throw new Exception("Invalid price of license. Only it'll be more zero");
        }
    }
}

