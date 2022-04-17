package com.epam.jwd.task1.model.entity;

import java.util.Objects;

/**
 * This car is special type of taxi that extend class Car
 * Cargo taxi contain parameter percent filling car body.
 * It can be fill only to 100 %. Price this car
 * calculates from price plus coefficient.
 * Coefficient contains from percent filling and
 * factor(max price for full a fill car body).
 * Factor is constanta, that set up drivers or boss
 * taxi company.
 *
 * @author Karpuk A.U.
 * @version 1.1 20.2.2022
 * */
public class CargoTaxi extends Car{

    /** It's price for a fill car body */
    private final static int FACTOR = 300;

    /** percent filling car body. Min - 0 %. Max - 100% */
    private int percentFillingCarBody;

    public CargoTaxi() {}

    public CargoTaxi(double price, double fuelConsumption, int numberSeat, double maxPayload, int percentFillingCarBody) {
        super(price, fuelConsumption, numberSeat, maxPayload);
        this.percentFillingCarBody = percentFillingCarBody;
    }

    /**
     * Consider factor and percent filling car
     * for calculate general price for this car
     *
     * @return price general price for this car
     */
    @Override
    public double getPrice() {
        return super.getPrice() + percentFillingCarBody * FACTOR;
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
