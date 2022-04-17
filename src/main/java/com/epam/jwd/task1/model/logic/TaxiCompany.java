package com.epam.jwd.task1.model.logic;

import com.epam.jwd.task1.model.entity.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Real taxi company that contains consist of list taxi
 * This taxi company can calculate price all cars,
 * sort taxis by their properties.
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class TaxiCompany {

    /** Price all car include in this taxi company */
    private double priceTaxiCompany = 0.0;

    /** List taxis in this taxi company */
    private ArrayList <Car> taxis=new ArrayList<Car>();

    public double getPriceTaxiCompany() {
        return priceTaxiCompany;
    }

    public ArrayList<Car> getTaxis() {
        return taxis;
    }

    /**
     * Add list cars in taxi company
     *
     * @param listTaxi list cars that will include in taxi company
     * @throws Exception occur if list taxi will be empty
     */
    public void addListTaxi(ArrayList<Car> listTaxi) throws Exception{
        if (listTaxi == null) {
            throw new Exception("Taxi list is null");
        }
        taxis.addAll(listTaxi);
    }

    /**
     * Sum prices all car in taxi company
     */
    public void calculatePriceAllCar(){
        for (Car car : taxis) {
            priceTaxiCompany += car.getPrice();
        }
    }

    /**
     * Sort list taxis depend on type of comparator
     *
     * @param comparator special comparator that compare
     *                   certain properties taxis
     * @throws Exception occur if comparator will be empty
     * @see com.epam.jwd.task1.model.logic.comparator.CarFuelComparator#compare(Car, Car)
     * @see com.epam.jwd.task1.model.logic.comparator.CarPriceComparator#compare(Car, Car)
     */
    public void sortByComparator(Comparator comparator) throws Exception{
        if (comparator == null) {
            throw new Exception("Comparator is null");
        }
        Collections.sort(taxis, comparator);
    }

    @Override
    public String toString() {
        String str = "TaxiCompany:\n";

        for (Car car : taxis) {
            str += car.toString() + "\n";
        }
        return str;
    }
}
