package com.epam.jwd.task1.model.logic.sercher;

import com.epam.jwd.task1.model.entity.Car;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Search cars by max payload.
 * It has only method search from start
 * to end value.
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class MaxPayloadSearcher extends InRangeSearcher {

    /**
     * Search cars by max payload in range
     */
    @Override
    public <T extends Number> ArrayList<Car> search(ArrayList<Car> taxis, T start,
                                                    T finish) throws Exception{
        if (taxis == null) {
            throw new Exception("list for search cars by max payload is null");
        }

        ArrayList<Car> carArrayList = new ArrayList<>();
//        double maxPayload;
        double starting = start.doubleValue();
        double finishing = finish.doubleValue();

        if (finishing >= starting && starting >= 0) {
            carArrayList.addAll(taxis.stream()
                    .filter(x -> x.getMaxPayload() >= starting)
                    .filter(x -> x.getMaxPayload() <= finishing)
                    .collect(Collectors.toList()));
//            for (Car car : taxis) {
//                maxPayload= car.getMaxPayload();
//                if (maxPayload >= starting && maxPayload <= finishing) {
//                    carArrayList.add(car);
//                }
//            }
        }
        return carArrayList;
    }
}
