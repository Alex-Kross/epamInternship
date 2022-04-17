package com.epam.jwd.task1.util;

import com.epam.jwd.task1.model.entity.CargoTaxi;
import com.epam.jwd.task1.model.entity.Minibus;
import com.epam.jwd.task1.model.entity.Taxicab;
import com.epam.jwd.task1.util.creatorCar.CreatorCargoTaxi;
import com.epam.jwd.task1.util.creatorCar.CreatorMinibus;
import com.epam.jwd.task1.util.creatorCar.CreatorTaxicab;
import com.epam.jwd.task1.util.validator.ValidatorCargoTaxi;
import com.epam.jwd.task1.util.validator.ValidatorMinibus;
import com.epam.jwd.task1.util.validator.ValidatorTaxicab;

import java.util.ArrayList;

/**
 * Class create lists objects CargoTaxi, Taxicab, Minibus
 * It consists of three methods for create and validate on
 * correctly special type of taxi
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class ListCarCreator {

    /**
     * Create list minibuses
     * Use class for initial and validate properties
     * for minibuses. For validate need special
     * validator for minibus.
     *
     * @return list correct minibuses
     * @throws Exception occur if transfer in constructor
     *                  creator minibus null. Or if method
     *                  create inner creator minibus throw
     *                  exception that say us that parameter
     *                  of car invalid
     * @see com.epam.jwd.task1.util.creatorCar.CreatorMinibus#create(double, double, int, double, double)
     */
    public static ArrayList<Minibus> createListMinibus() throws Exception {
        ArrayList<Minibus> minibuses = new ArrayList<>();
        CreatorMinibus creatorCar = new CreatorMinibus(new ValidatorMinibus());

        minibuses.add(creatorCar.create(20432, 38.5, 18, 3942.23,  101.2));
        minibuses.add(creatorCar.create(25123, 42.7, 9, 2341.12,  253.2));
        minibuses.add(creatorCar.create(30234, 35.7, 20, 3023.43,  210.3));

        return minibuses;
    }

    /**
     * Create list cargo taxis
     * Use class for initial and validate properties
     * for cargo taxis. For validate need special
     * validator for cargo taxi.
     *
     * @return list correct cargo taxis
     * @throws Exception occur if transfer in constructor
     *                  creator cargo taxi null. Or if method
     *                  create inner creator cargo taxi throw
     *                  exception that say us that parameter
     *                  of car invalid
     * @see com.epam.jwd.task1.util.creatorCar.CreatorCargoTaxi#create(double, double, int, double, int)
     */
    public static ArrayList<CargoTaxi> createListCargoTaxi() throws Exception {
        ArrayList<CargoTaxi> cargoTaxis = new ArrayList<>();
        CreatorCargoTaxi creatorCar = new CreatorCargoTaxi(new ValidatorCargoTaxi());

        cargoTaxis.add(creatorCar.create(28465, 12.1, 1, 10374.22,  72));
        cargoTaxis.add(creatorCar.create(31783, 10.3, 2, 13947.34,  43));
        cargoTaxis.add(creatorCar.create(37461, 8.9, 1, 25343.43,  85));

        return cargoTaxis;
    }

    /**
     * Create list taxicabs
     * Use class for initial and validate properties
     * for taxicabs. For validate need special
     * validator for taxicab.
     *
     * @return list correct taxicabs
     * @throws Exception occur if transfer in constructor
     *                  creator taxicab null. Or if method
     *                  create inner creator taxicab throw
     *                  exception that say us that parameter
     *                  of car invalid
     * @see com.epam.jwd.task1.util.creatorCar.CreatorTaxicab#create(double, double, int, double, double)
     */
    public static ArrayList<Taxicab> createListTaxicab() throws Exception {
        ArrayList<Taxicab> taxicabs = new ArrayList<>();
        CreatorTaxicab creatorCar = new CreatorTaxicab(new ValidatorTaxicab());

        taxicabs.add(creatorCar.create(12213, 61.8, 3, 1345.12,  225.5));
        taxicabs.add(creatorCar.create(6123, 43.1, 1, 1111.15,  333.3));
        taxicabs.add(creatorCar.create(9533, 51.2, 4, 1034.32,  199.9));

        return taxicabs;
    }
}
