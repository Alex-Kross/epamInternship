package com.epam.jwd.task1.model.logic.sercher;

import com.epam.jwd.task1.model.entity.Car;

import java.util.ArrayList;

/**
 * Class template for search cars in list cars by properties
 * It contains only method search in range from start
 * to end value.
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public abstract class SearcherInRange {

    /**
     * Method searches cars for certain parameters
     * that set up in extending classes.
     * Search from start to end value.
     *
     * @param cars list cars that use for search special cars
     * @param start initial value for search
     * @param finish ending value for search
     * @param <T> allow set up initial and ending value
     *           any type what extend Number
     * @return list cars that appropriate range
     * @throws Exception occur if in method transfer empty list cars
     */
    public abstract <T extends Number> ArrayList<Car> search(ArrayList<Car> cars,
                                                             T start, T finish) throws Exception;
}
