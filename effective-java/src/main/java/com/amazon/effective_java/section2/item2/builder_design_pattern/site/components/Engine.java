package com.amazon.effective_java.section2.item2.builder_design_pattern.site.components;

public class Engine {

    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume , double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }


    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (!started) {
            System.out.println("Can't go please start the car first.");
        }
        else {
            this.mileage += mileage;
        }
    }

    public double getMileage() {
        return mileage;
    }

    public double getVolume() {
        return volume;
    }
}
