package com.epam.jwd.task1.model.logic.sercher;

import com.epam.jwd.task1.model.entity.Car;
import com.epam.jwd.task1.model.logic.sercher.SearcherInRange;

import java.util.ArrayList;

public class SearcherMaxPayload extends SearcherInRange {

    @Override
    public <T extends Number> ArrayList<Car> search(ArrayList<Car> taxis, T start, T finish) throws Exception{
        if (taxis == null) {
            throw new Exception("list for search cars by max payload is null");
        }
        ArrayList<Car> carArrayList = new ArrayList<>();
        double starting = start.doubleValue();
        double finishing = finish.doubleValue();

        if (finishing >= starting && starting >= 0) {
            for (Car car : taxis) {
                double maxPayload= car.getMaxPayload();
                if (maxPayload >= starting && maxPayload <= finishing) {
                    carArrayList.add(car);
                }
            }
        }
        return carArrayList;
    }
}
