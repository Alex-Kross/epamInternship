package com.epam.jwd.task1.util;

import com.epam.jwd.task1.model.entity.CargoTaxi;
import com.epam.jwd.task1.model.entity.Minibus;
import com.epam.jwd.task1.model.entity.Taxicab;
import com.epam.jwd.task1.validator.Validator;
import com.epam.jwd.task1.validator.ValidatorCargoTaxi;
import com.epam.jwd.task1.validator.ValidatorMinibus;
import com.epam.jwd.task1.validator.ValidatorTaxicab;

import java.util.ArrayList;

public class CreatorListCar {
    public static ArrayList<Minibus> createListMinibus() {
        ArrayList<Minibus> minibuses = new ArrayList<>();
        CreatorMinibus creatorCar = new CreatorMinibus(new ValidatorMinibus());

        try {
            minibuses.add(creatorCar.create(-20432, 38.5, 18, 3942.23,  101.2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            minibuses.add(creatorCar.create(25123, 42.7, 9, 2341.12,  253.2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            minibuses.add(creatorCar.create(30234, 35.7, 20, 3023.43,  210.3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return minibuses;
    }

    public static ArrayList<CargoTaxi> createListCargoTaxi() throws Exception {
        ArrayList<CargoTaxi> cargoTaxis = new ArrayList<>();
        CreatorCargoTaxi creatorCar = new CreatorCargoTaxi(new ValidatorCargoTaxi());

        cargoTaxis.add(creatorCar.create(28465, 12.1, 1, 10374.22,  72));
        cargoTaxis.add(creatorCar.create(31783, 10.3, 2, 13947.34,  43));
        cargoTaxis.add(creatorCar.create(37461, 8.9, 1, 25343.43,  85));

        return cargoTaxis;
    }

    public static ArrayList<Taxicab> createListTaxicab() throws Exception {
        ArrayList<Taxicab> taxicabs = new ArrayList<>();
        CreatorTaxicab creatorCar = new CreatorTaxicab(new ValidatorTaxicab());
        taxicabs.add(creatorCar.create(12213, 61.8, 3, 1345.12,  225.5));
        taxicabs.add(creatorCar.create(6123, 43.1, 1, 1111.15,  333.3));
        taxicabs.add(creatorCar.create(9533, 51.2, 4, 1034.32,  199.9));
        return taxicabs;
    }
}
