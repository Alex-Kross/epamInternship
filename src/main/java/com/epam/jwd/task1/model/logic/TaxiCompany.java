package com.epam.jwd.task1.model.logic;

import com.epam.jwd.task1.model.entity.Car;
import com.epam.jwd.task1.model.logic.sercher.SearcherInRange;

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

    public void addListTaxi(ArrayList<Car> listTaxi){
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

//    public <T extends Number> List<Car> searchInRange(SearcherInRange searcherInRange, T start, T finish){
//        return searcherInRange.search(taxis, start, finish);
//    }

    public void sortByComparator(Comparator comparator){
        Collections.sort(taxis, comparator);
    }

    @Override
    public String toString() {
        String str = "";
        for (Car car : taxis) {
            str += car.toString() + "\n";
        }
        return "TaxiCompany:\n" + str;
    }
}
