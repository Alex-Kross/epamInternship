package com.epam.jwd.task1.util.validator;

/**
 * Class validates cargo taxi
 * It uses method in class Validator for
 * validates base properties
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class ValidatorCargoTaxi{

    /**
     * Validate base parameters and special
     * parameter for cargo taxi
     *
     * @param price price for car
     * @param fuelConsumption fuel consumption for car
     * @param numberSeat number seats in car
     * @param maxPayload max payload for car
     * @param percent percent filling car body
     * @throws Exception occur if one from calling method
     *                   throw exception
     * @see Validator#validate(double, double, int, double)
     */
    public void validate(double price, double fuelConsumption,
                         int numberSeat, double maxPayload,
                         int percent) throws Exception {
        Validator.validate(price, fuelConsumption, numberSeat, maxPayload);
        validatePercent(percent);
    }

    /**
     * Check percent on correctly
     * @param percent percent filling car body
     * @throws Exception occur if condition doesn't execute
     */
    public void validatePercent(int percent) throws Exception {
        if (percent < 0 || percent > 100){
            throw new Exception("Invalid percent. Percent only be 0 to 100");
        }
    }
}

