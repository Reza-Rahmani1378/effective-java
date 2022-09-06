package com.amazon.effective_java.section2.item2.builder_design_pattern.site.cars;

import com.amazon.effective_java.section2.item2.builder_design_pattern.site.components.Engine;
import com.amazon.effective_java.section2.item2.builder_design_pattern.site.components.GPSNavigator;
import com.amazon.effective_java.section2.item2.builder_design_pattern.site.components.Transmission;
import com.amazon.effective_java.section2.item2.builder_design_pattern.site.components.TripComputer;

public class Car {
    private final int seats;
    private final CarType carType;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    private final Engine engine;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }

    }




    public double getFuel() {
        return this.fuel;
    }


    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public CarType getCarType() {
        return carType;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }


    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public Engine getEngine() {
        return engine;
    }
}
