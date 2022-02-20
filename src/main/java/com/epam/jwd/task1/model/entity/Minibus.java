package com.epam.jwd.task1.model.entity;

import java.util.Objects;

/**
 * Minibus is special type of taxi, that extends class Car
 * Here price calculates with include price for car and
 * for license. License is document, that you need to buy
 * for transport group people on certain way.
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 */
public class Minibus extends Car {

    /** It's price for licence */
    private double priceLicense;

    public Minibus() {
    }

    public Minibus(double price, double fuelConsumption, int numberSeat, double maxPayload, double priceLicense) {
        super(price, fuelConsumption, numberSeat, maxPayload);
        this.priceLicense = priceLicense;
    }

    /**
     * Calculate all price from license and car
     *
     * @return price general price for this car
     */
    @Override
    public double getPrice() {
        return super.getPrice() + priceLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minibus minibus = (Minibus) o;
        return Double.compare(minibus.price, price) == 0
                && Double.compare(minibus.fuelConsumption, fuelConsumption) == 0
                && Double.compare(minibus.maxPayload, maxPayload) == 0
                && Double.compare(minibus.priceLicense, priceLicense) == 0
                && numberSeat == minibus.numberSeat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), priceLicense);
    }

    @Override
    public String toString() {
        return "Minibus: " +
                "price=" + super.getPrice() + "$" +
                ", fuelConsumption=" + super.getFuelConsumption() + " liter/100km" +
                ", numberSeat=" + super.getNumberSeat() +
                ", maxPayload=" + super.getMaxPayload() + " kg" +
                ", priceLicense=" + priceLicense + "$" +
                ';';
    }
}
