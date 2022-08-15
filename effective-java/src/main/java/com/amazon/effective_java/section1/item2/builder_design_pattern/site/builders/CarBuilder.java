package com.amazon.effective_java.section1.item2.builder_design_pattern.site.builders;

import com.amazon.effective_java.section1.item2.builder_design_pattern.site.builders.Builder;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.cars.Car;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.cars.CarType;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.components.Engine;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.components.GPSNavigator;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.components.Transmission;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.components.TripComputer;

public class CarBuilder implements Builder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;
    private TripComputer tripComputer;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Car getResult() {
        return new Car(carType , seats , engine , transmission , tripComputer , gpsNavigator);
    }
}
