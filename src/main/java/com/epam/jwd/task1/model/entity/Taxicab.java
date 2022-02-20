package com.epam.jwd.task1.model.entity;

import java.util.Objects;

/**
 * Taxicab is special type of taxi that extend class Car
 * This car has a taxi meter that include in
 * general price of all car.
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 */
public class Taxicab extends Car{

    /**
     * It's price for taxi meter that
     * use every taxicab
     */
    private double priceTaxiMeter;

    public Taxicab() {}

    public Taxicab(double price, double fuelConsumption, int numberSeat, double maxPayload, double priceTaxiMeter) {
        super(price, fuelConsumption, numberSeat, maxPayload);
        this.priceTaxiMeter = priceTaxiMeter;
    }

    /**
     * Consider cost taxi meter and car together
     *
     * @return price general price of this car
     */
    @Override
    public double getPrice() {
        return super.getPrice() + priceTaxiMeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxicab taxicab = (Taxicab) o;
        return Double.compare(taxicab.price, price) == 0
                && Double.compare(taxicab.fuelConsumption, fuelConsumption) == 0
                && Double.compare(taxicab.maxPayload, maxPayload) == 0
                && Double.compare(taxicab.priceTaxiMeter, priceTaxiMeter) == 0
                && numberSeat == taxicab.numberSeat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), priceTaxiMeter);
    }

    @Override
    public String toString() {
        return "Taxicab: " +
                "price=" + super.getPrice() + "$" +
                ", fuelConsumption=" + super.getFuelConsumption() + " liter/100km" +
                ", numberSeat=" + super.getNumberSeat() +
                ", maxPayload=" + super.getMaxPayload() + " kg" +
                ", priceTaxiMeter=" + priceTaxiMeter + "$" +
                ';';
    }
}
