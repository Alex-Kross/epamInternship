package com.epam.jwd.task1.model.logic.sercher;

import com.epam.jwd.task1.model.entity.Car;

import java.util.ArrayList;

public abstract class SearcherInRange {
    public abstract <T extends Number> ArrayList<Car> search(ArrayList<Car> taxis, T start, T finish) throws Exception;
}
