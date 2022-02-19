package com.epam.jwd.task1.validator;

public class Validator{
    private Validator(){}

    public static void validate(double price, double fuelConsumption,
                         int numberSeat, double maxPayload) throws Exception {
        validatePrice(price);
        validateFuelConsumption(fuelConsumption);
        validateMaxPayload(maxPayload);
        validateNumberSeat(numberSeat);
    }

    private static void validatePrice(double price) throws Exception {
        if (price < 0){
            throw new Exception("Invalid price");
        }
    }

    private static void validateNumberSeat(int numberSeat) throws Exception {
        if (numberSeat < 0){
            throw new Exception("Invalid number seats");
        }
    }

    private static void validateFuelConsumption(double FuelConsumption) throws Exception {
        if (FuelConsumption < 0){
            throw new Exception("Invalid fuel consumption");
        }
    }

    private static void validateMaxPayload(double maxPayload) throws Exception {
        if (maxPayload < 0){
            throw new Exception("Invalid max payload");
        }
    }
}
