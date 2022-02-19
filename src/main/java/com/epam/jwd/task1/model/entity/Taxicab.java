package com.epam.jwd.task1.model.entity;

import java.util.Objects;

public class Taxicab extends Car{
    private double priceTaxiMeter;

    public Taxicab() {}

    public Taxicab(double price, double fuelConsumption, int numberSeat, double maxPayload, double priceTaxiMeter) {
        super(price, fuelConsumption, numberSeat, maxPayload);
        this.priceTaxiMeter = priceTaxiMeter;
    }

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
