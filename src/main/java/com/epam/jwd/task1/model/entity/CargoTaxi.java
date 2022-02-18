package com.epam.jwd.task1.model.entity;

import java.util.Objects;

public class CargoTaxi extends Car{
    private final static int factor = 300;
    private int percentFillingCarBody;

    public CargoTaxi() {}

    public CargoTaxi(double price, double fuelConsumption, int numberSeat, double maxPayload, int percentFillingCarBody) {
        super(price, fuelConsumption, numberSeat, maxPayload);
        this.percentFillingCarBody = percentFillingCarBody;
    }

    public int getPercentFillingCarBody() {
        return percentFillingCarBody;
    }

    public void setPercentFillingCarBody(int percentFillingCarBody) {
        int minPercent = 0;
        int maxPercent = 100;
        if (percentFillingCarBody >= minPercent && maxPercent <= percentFillingCarBody) {
            this.percentFillingCarBody = percentFillingCarBody;
        }
    }

    @Override
    public double getPrice() {
        return super.getPrice() + percentFillingCarBody * factor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoTaxi cargoTaxi = (CargoTaxi) o;
        return Double.compare(cargoTaxi.price, price) == 0
                && Double.compare(cargoTaxi.fuelConsumption, fuelConsumption) == 0
                && Double.compare(cargoTaxi.maxPayload, maxPayload) == 0
                && numberSeat == cargoTaxi.numberSeat
                && percentFillingCarBody == cargoTaxi.percentFillingCarBody;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), percentFillingCarBody);
    }

    @Override
    public String toString() {
        return "CargoTaxi: " +
                "price=" + super.getPrice() + "$" +
                ", fuelConsumption=" + super.getFuelConsumption() + " liter/100km" +
                ", numberSeat=" + super.getNumberSeat() +
                ", maxPayload=" + super.getMaxPayload() + " kg" +
                ", percentFillingCarBody=" + percentFillingCarBody + "$" +
                ';';

    }
}
