package com.epam.jwd.task1.util;

import com.epam.jwd.task1.model.entity.CargoTaxi;
import com.epam.jwd.task1.model.entity.Minibus;
import com.epam.jwd.task1.model.entity.Taxicab;
import com.epam.jwd.task1.validator.Validator;
import com.epam.jwd.task1.validator.ValidatorCargoTaxi;

import java.util.ArrayList;

public class CreatorListCar {
    public static ArrayList<Minibus> createListMinibus() throws Exception {
        ArrayList<Minibus> minibuses = new ArrayList<>();

        Minibus minibus1 = new Minibus(20432, 38.5, 18, 3942.23,  101.2);

//        Validator validator = new Validator();
//        CreatorCar creatorCar = new CreatorCar(new ValidatorCargoTaxi());
        CreatorCar creatorCar = new CreatorCar(new ValidatorCargoTaxi());
        creatorCar.create(28465, 12.1, 1, 10374.22);//,  72);
        minibuses.add(minibus1);
        minibuses.add(new Minibus(25123, 42.7, 9, 2341.12,  253.2));
        minibuses.add(new Minibus(30234, 35.7, 20, 3023.43,  210.3));
        return minibuses;
    }

    public static ArrayList<CargoTaxi> createListCargoTaxi(){
        ArrayList<CargoTaxi> cargoTaxis = new ArrayList<>();
        cargoTaxis.add(new CargoTaxi(28465, 12.1, 1, 10374.22,  72));
        cargoTaxis.add(new CargoTaxi(31783, 10.3, 2, 13947.34,  43));
        cargoTaxis.add(new CargoTaxi(37461, 8.9, 1, 25343.43,  85));
        return cargoTaxis;
    }

    public static ArrayList<Taxicab> createListTaxicab(){
        ArrayList<Taxicab> taxicabs = new ArrayList<>();
        taxicabs.add(new Taxicab(12213, 61.8, 3, 1345.12,  225.5));
        taxicabs.add(new Taxicab(6123, 43.1, 1, 1111.15,  333.3));
        taxicabs.add(new Taxicab(9533, 51.2, 4, 1034.32,  199.9));
        return taxicabs;
    }
}
