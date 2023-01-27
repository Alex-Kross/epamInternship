package com.epam.jwd.task1.model.logic.sercher;

import com.epam.jwd.task1.model.entity.Car;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Search cars by number seats.
 * It has only method search from start
 * to end value.
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class SeatSearcher extends InRangeSearcher {

    /**
     * Search cars by number seats in range
     */
    @Override
    public <T extends Number> ArrayList<Car> search(ArrayList<Car> taxis, T start,
                                                    T finish) throws Exception{
        if (taxis == null) {
            throw new Exception("list for search car by seats is null");
        }

        ArrayList<Car> carArrayList = new ArrayList<>();
//        int numberSeat;
        int starting = start.intValue();
        int finishing = finish.intValue();

        if (finishing >= starting && starting >= 0) {
            carArrayList.addAll(taxis.stream()
                    .filter(x -> x.getNumberSeat() >= starting)
                    .filter(x -> x.getNumberSeat() <= finishing)
                    .collect(Collectors.toList()));
//            for (Car car : taxis) {
//                numberSeat = car.getNumberSeat();
//                if (numberSeat >= starting && numberSeat <= finishing) {
//                    carArrayList.add(car);
//                }
//            }
        }
        return carArrayList;
    }
}
