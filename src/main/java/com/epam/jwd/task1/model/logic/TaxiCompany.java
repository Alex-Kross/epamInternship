package com.epam.jwd.task1.model.logic;

import com.epam.jwd.task1.model.entity.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TaxiCompany {
    private double priceTaxiCompany = 0.0;

    private ArrayList <Car> taxis=new ArrayList<Car>();

    public double getPriceTaxiCompany() {
        return priceTaxiCompany;
    }

    public void addTaxi(Car taxi){
        taxis.add(taxi);
    }

    public void addListTaxi(ArrayList<Car> listTaxi) throws Exception{
        if (listTaxi == null) {
            throw new Exception("Taxi list empty");
        }
        taxis.addAll(listTaxi);
    }

    public ArrayList<Car> getTaxis() {
        return taxis;
    }

    public void calculatePriceAllCar(){
        for (Car car : taxis) {
            priceTaxiCompany += car.getPrice();
        }
    }

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
