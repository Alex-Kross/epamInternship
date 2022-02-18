package com.epam.jwd.task1.model.entity;

import java.util.Objects;

public class Minibus extends Car{
    private double priceLicense;

    public Minibus() {}

    public Minibus(double price, double fuelConsumption, int numberSeat, double maxPayload, double priceLicense) {
        super(price, fuelConsumption, numberSeat, maxPayload);
        this.priceLicense = priceLicense;
    }

    public double getPriceLicense() {
        return priceLicense;
    }

    public void setPriceLicense(double priceLicense) {
        double minPrice = 0;
        if (priceLicense >= minPrice){
            this.priceLicense = priceLicense;
        }
    }

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
