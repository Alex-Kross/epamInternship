package com.epam.jwd.task1.model.logic.sercher;

import com.epam.jwd.task1.model.entity.Car;
import com.epam.jwd.task1.model.logic.sercher.SearcherInRange;

import java.util.ArrayList;

public class SearcherSeat extends SearcherInRange {
    @Override
    public <T extends Number> ArrayList<Car> search(ArrayList<Car> taxis, T start, T finish) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        int starting = start.intValue();
        int finishing = finish.intValue();

        if (finishing >= starting && starting >= 0) {
            for (Car car : taxis) {
                int numberSeat = car.getNumberSeat();
                if (numberSeat >= starting && numberSeat <= finishing) {
                    carArrayList.add(car);
                }
            }
        }
        return carArrayList;
    }
}
