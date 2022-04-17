package com.epam.jwd.task1.controller;

import com.epam.jwd.task1.model.entity.Car;
import com.epam.jwd.task1.model.logic.TaxiCompany;
import com.epam.jwd.task1.model.logic.comparator.CarFuelComparator;
import com.epam.jwd.task1.model.logic.comparator.CarPriceComparator;
import com.epam.jwd.task1.model.logic.sercher.MaxPayloadSearcher;
import com.epam.jwd.task1.model.logic.sercher.SeatSearcher;
import com.epam.jwd.task1.util.ListCarCreator;
import com.epam.jwd.task1.view.Printer;

import java.util.ArrayList;

/**
 * Point enter to program
 * Build script execution program
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class Main {
    public static void main(String[] args) throws Exception {
        // create lists cars
        ArrayList minibuses = ListCarCreator.createListMinibus();
        ArrayList cargoTaxis = ListCarCreator.createListCargoTaxi();
        ArrayList taxicabs = ListCarCreator.createListTaxicab();

        // create taxi company and add taxis in it
        TaxiCompany taxiCompany = new TaxiCompany();
        taxiCompany.addListTaxi(minibuses);
        taxiCompany.addListTaxi(cargoTaxis);
        taxiCompany.addListTaxi(taxicabs);

        // show list taxi
        Printer.PrintInConsole(taxiCompany);

        // Calculate price all car in taxi company
        taxiCompany.calculatePriceAllCar();
        double allPrice = taxiCompany.getPriceTaxiCompany();

        // Show price taxi company
        Printer.PrintInConsole("Summary price for all taxis in taxi company: ");
        Printer.PrintInConsole(allPrice);

        // Sort list taxi by fuel consumption
        taxiCompany.sortByComparator(new CarFuelComparator());

        // Show first type of sort
        Printer.PrintInConsole("Taxi company sort by fuel consumption");
        Printer.PrintInConsole(taxiCompany);

        // Sort list taxi by price
        taxiCompany.sortByComparator(new CarPriceComparator());

        // Show second type of sort
        Printer.PrintInConsole("Taxi company sort by price");
        Printer.PrintInConsole(taxiCompany);

        // create 2 list car
        ArrayList <Car> listCar1 = new ArrayList<>();
        ArrayList <Car> listCar2 = new ArrayList<>();

        // search list car by seats
        SeatSearcher searcherSeat = new SeatSearcher();
        int start1 = 2;
        int finish1 = 10;
        listCar1 = searcherSeat.search(taxiCompany.getTaxis(),start1,finish1);

        // show taxi that was search by number seats
        Printer.PrintInConsole("Search in taxi company by seats from %d to %d: ".formatted(start1,finish1));
        Printer.PrintInConsole(listCar1);

        // search list car by max payload
        MaxPayloadSearcher searcherMaxPayload = new MaxPayloadSearcher();
        int start2 = 10000;
        int finish2 = 30000;
        listCar2 = searcherMaxPayload.search(taxiCompany.getTaxis(),start2,finish2);

        // show taxi that was search by max payload
        Printer.PrintInConsole("Search in taxi company by max payload from %d to %d: ".formatted(start2,finish2));
        Printer.PrintInConsole(listCar2);
    }
}
