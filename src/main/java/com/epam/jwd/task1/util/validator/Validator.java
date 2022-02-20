package com.epam.jwd.task1.util.validator;

/**
 * Class validates base properties of car
 * It is template for special type of validator
 * to other cars
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class Validator{
    private Validator(){}

    /**
     *  Validate all parameters for car.
     *  It calls methods for validate every
     *  parameter
     *
     * @param price price for car
     * @param fuelConsumption fuel consumption for car
     * @param numberSeat number seats in car
     * @param maxPayload max payload for car
     * @throws Exception occur if one from calling method
     *                    throw exception
     */
    public static void validate(double price, double fuelConsumption,
                         int numberSeat, double maxPayload) throws Exception {
        validatePrice(price);
        validateFuelConsumption(fuelConsumption);
        validateMaxPayload(maxPayload);
        validateNumberSeat(numberSeat);
    }

    /**
     * Check price on correctly
     *
     * @param price for car
     * @throws Exception occur if condition doesn't execute
     */
    private static void validatePrice(double price) throws Exception {
        if (price < 0){
            throw new Exception("Invalid price. Only it'll be more zero");
        }
    }

    /**
     * Check number seats on correctly
     *
     * @param numberSeat number seats for car
     * @throws Exception occur if condition doesn't execute
     */
    private static void validateNumberSeat(int numberSeat) throws Exception {
        if (numberSeat < 0){
            throw new Exception("Invalid number seats. Only it'll be more zero");
        }
    }

    /**
     * Check fuel consumption on correctly
     *
     * @param FuelConsumption fuel consumption for car
     * @throws Exception occur if condition doesn't execute
     */
    private static void validateFuelConsumption(double FuelConsumption) throws Exception {
        if (FuelConsumption < 0){
            throw new Exception("Invalid fuel consumption. Only it'll be more zero");
        }
    }

    /**
     * Check max payload on correctly
     *
     * @param maxPayload max payload for car
     * @throws Exception occur if condition doesn't execute
     */
    private static void validateMaxPayload(double maxPayload) throws Exception {
        if (maxPayload < 0){
            throw new Exception("Invalid max payload. Only it'll be more zero");
        }
    }
}
