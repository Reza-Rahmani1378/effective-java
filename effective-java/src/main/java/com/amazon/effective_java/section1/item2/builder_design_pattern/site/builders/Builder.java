package com.amazon.effective_java.section1.item2.builder_design_pattern.site.builders;

import com.amazon.effective_java.section1.item2.builder_design_pattern.site.cars.CarType;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.components.Engine;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.components.GPSNavigator;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.components.Transmission;
import com.amazon.effective_java.section1.item2.builder_design_pattern.site.components.TripComputer;

public interface Builder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGPSNavigator(GPSNavigator gpsNavigator);
    void setTripComputer(TripComputer tripComputer);
}
