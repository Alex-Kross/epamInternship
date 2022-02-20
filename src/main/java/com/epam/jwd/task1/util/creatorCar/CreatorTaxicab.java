package com.epam.jwd.task1.util.creatorCar;

import com.epam.jwd.task1.model.entity.Taxicab;
import com.epam.jwd.task1.util.validator.ValidatorTaxicab;

/**
 * Class for create and initial object Taxicab
 * Creating object depend on certain validator
 * that validate parameters for create correct object.
 * Before creating object class delegate to check
 * parameters of car in method inner class validator
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class CreatorTaxicab {

    /** Validator for check taxicab */
    private ValidatorTaxicab validator;

    /**
     * Initial validator for taxicab
     *
     * @param validator special type validator for
     *                  create correct taxicab
     * @throws Exception occur if validator will be empty
     */
    public CreatorTaxicab(ValidatorTaxicab validator) throws Exception{
        if (validator == null) {
            throw new Exception("Validator for taxicab is null");
        }
        this.validator = validator;
    }

    /**
     * Create object if parameters will be correct
     *
     * @param price price for taxicab
     * @param fuelConsumption fuel consumption for taxicab
     * @param numberSeat number seats in taxicab
     * @param maxPayload max payload for taxicab
     * @param priceTaxiMeter price taxi meter for taxicab
     * @return correct object taxicab
     * @throws Exception occur if method in validator throw exception
     * @see com.epam.jwd.task1.util.validator.ValidatorTaxicab#validate(double, double, int, double, double)
     */
    public Taxicab create(double price, double fuelConsumption, int numberSeat,
                          double maxPayload, double priceTaxiMeter) throws Exception {

        // call method for validate parameters for create object
        validator.validate(price, fuelConsumption, numberSeat,
                maxPayload, priceTaxiMeter);

        return new Taxicab(price, fuelConsumption, numberSeat,
                maxPayload, priceTaxiMeter);
    }
}
