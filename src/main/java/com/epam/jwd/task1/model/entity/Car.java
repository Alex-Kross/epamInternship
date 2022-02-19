package com.epam.jwd.task1.model.entity;

import java.util.Objects;

public class Car{
    protected double price;
    protected double fuelConsumption;
    protected int numberSeat;
    protected double maxPayload;

    public Car(){}

    public Car(double price, double fuelConsumption, int numberSeat, double maxPayload) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.numberSeat = numberSeat;
        this.maxPayload = maxPayload;
    }

    public double getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public double getMaxPayload() {
        return maxPayload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0
                && Double.compare(car.fuelConsumption, fuelConsumption) == 0
                && Double.compare(car.maxPayload, maxPayload) == 0
                && numberSeat == car.numberSeat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, fuelConsumption, numberSeat, maxPayload);
    }

    @Override
    public String toString() {
        return "Car: " +
                "price=" + price + "$" +
                ", fuelConsumption=" + fuelConsumption + " liter/100km" +
                ", numberSeat=" + numberSeat +
                ", maxPayload=" + maxPayload + " kg" +
                ';';
    }
}
