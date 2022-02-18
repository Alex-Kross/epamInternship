package com.epam.jwd.task1.controller;

import com.epam.jwd.task1.model.entity.Car;
import com.epam.jwd.task1.model.entity.Minibus;
import com.epam.jwd.task1.model.logic.TaxiCompany;
import com.epam.jwd.task1.util.CreatorListCar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList minibuses = CreatorListCar.createListMinibus();
        ArrayList cargoTaxis = CreatorListCar.createListCargoTaxi();
        ArrayList taxicabs = CreatorListCar.createListTaxicab();

        TaxiCompany taxiCompany = new TaxiCompany();
//
        taxiCompany.addListTaxi(minibuses);
        taxiCompany.addListTaxi(cargoTaxis);
        taxiCompany.addListTaxi(taxicabs);
//
//
//        double allPrice = taxiCompany.calculatePriceAllCar();
//
//        ArrayList <Car> cars = new ArrayList<>();
//
////        searcherSeatInListCarsearcherInRange = new searcherSeatInListCar();
////        cars = searcherInRange.searchForNumberSeat(cars,2,10);
////        cars = searcherInRange.searchForMaxPayload(cars,30000,10000);
////        taxiCompany.searchForMaxPayload();
//        taxiCompany.searchInRange(new SearcherSeat(), 10,100);
////        Searcher searcher = new Searcher();
////        searcher.search(taxiCompany.getTaxis(), 12,100.2);
//        System.out.println(taxiCompany);
//        System.out.println();
//        taxiCompany.sortByComparator(new FuelComparator());
//
        Minibus minibus1 = new Minibus(20432, 38.5,
                18, 3942.23,  101.2);
        Car car = new Car(20432, 38.5,
                18, 3942.23);
//        boolean b = minibus1.equals(car);
//        Collections.sort(taxiCompany.getTaxis(),new FuelComparator());
//        System.out.println(taxiCompany);

    }
}
