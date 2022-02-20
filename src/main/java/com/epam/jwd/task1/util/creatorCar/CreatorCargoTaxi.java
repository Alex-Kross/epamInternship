package com.epam.jwd.task1.util.creatorCar;

import com.epam.jwd.task1.model.entity.CargoTaxi;
import com.epam.jwd.task1.util.validator.ValidatorCargoTaxi;

/**
 * Class for create and initial object CargoTaxi
 * Creating object depend on certain validator
 * that validate parameters for create correct object.
 * Before creating object class delegate to check
 * parameters of car in method inner class validator
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class CreatorCargoTaxi{

    /** Validator for check cargo taxi */
    private ValidatorCargoTaxi validator;

    /**
     * Initial validator for cargo taxi
     *
     * @param validator special type validator for
     *                  create correct cargo taxi
     * @throws Exception occur if validator will be empty
     */
    public CreatorCargoTaxi(ValidatorCargoTaxi validator) throws Exception{
        if (validator == null) {
            throw new Exception("Validator for cargo taxi is null");
        }
        this.validator = validator;
    }

    /**
     * Create object if parameters will be correct
     *
     * @param price price for cargo taxi
     * @param fuelConsumption fuel consumption for cargo taxi
     * @param numberSeat number seats in cargo taxi
     * @param maxPayload max payload for cargo taxi
     * @param percentFillingCarBody percent filling car body cargo taxi
     * @return correct object cargo taxi
     * @throws Exception occur if method in validator throw exception
     * @see com.epam.jwd.task1.util.validator.ValidatorCargoTaxi#validate(double, double, int, double, int)
     */
    public CargoTaxi create(double price, double fuelConsumption, int numberSeat,
                      double maxPayload, int percentFillingCarBody) throws Exception {

        // call method for validate parameters for create object
        validator.validate(price, fuelConsumption, numberSeat,
                maxPayload, percentFillingCarBody);

        return new CargoTaxi(price, fuelConsumption, numberSeat,
                maxPayload, percentFillingCarBody);
    }
}
