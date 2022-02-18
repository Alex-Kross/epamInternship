package com.epam.jwd.task1.validator;

import com.epam.jwd.task1.model.entity.Car;
import com.epam.jwd.task1.model.entity.CargoTaxi;

public class ValidatorCargoTaxi extends Validator{
    @Override
    public void validate(Car car) throws Exception {
        super.validate(car);
        validatePercent(( (CargoTaxi) car).getPercentFillingCarBody());
    }

    public   void validatePercent(int percent) throws Exception {
        if (percent < 0 || percent > 100){
            throw new Exception("Invalid percent");
        }
    }

}

