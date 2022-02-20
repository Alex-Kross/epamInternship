package com.epam.jwd.task1.util.creatorCar;

import com.epam.jwd.task1.model.entity.Minibus;
import com.epam.jwd.task1.util.validator.ValidatorMinibus;

/**
 * Class for create and initial object Minibus
 * Creating object depend on certain validator
 * that validate parameters for create correct object.
 * Before creating object class delegate to check
 * parameters of car in method inner class validator
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class CreatorMinibus {

    /** Validator for check minibus */
    private ValidatorMinibus validator;

    /**
     * Initial validator for minibus
     *
     * @param validator special type validator for
     *                  create correct minibus
     * @throws Exception occur if validator will be empty
     */
    public CreatorMinibus(ValidatorMinibus validator) throws Exception{
        if (validator == null) {
            throw new Exception("Validator for minibus taxi is null");
        }
        this.validator = validator;
    }

    /**
     * Create object if parameters will be correct
     *
     * @param price price for minibus
     * @param fuelConsumption fuel consumption for minibus
     * @param numberSeat number seats in minibus
     * @param maxPayload max payload for minibus
     * @param priceLicense price license for minibus
     * @return correct object minibus
     * @throws Exception occur if method in validator throw exception
     * @see com.epam.jwd.task1.util.validator.ValidatorMinibus#validate(double, double, int, double, double)
     */
    public Minibus create(double price, double fuelConsumption, int numberSeat,
                      double maxPayload,  double priceLicense) throws Exception {

        // call method for validate parameters for create object
        validator.validate(price, fuelConsumption, numberSeat,
                maxPayload, priceLicense);

        return new Minibus(price, fuelConsumption, numberSeat,
                maxPayload, priceLicense);
    }
}
