package com.amazon.effective_java.section2.item2.builder_design_pattern.site;

import com.amazon.effective_java.section2.item2.builder_design_pattern.site.builders.CarBuilder;
import com.amazon.effective_java.section2.item2.builder_design_pattern.site.builders.CarManualBuilder;
import com.amazon.effective_java.section2.item2.builder_design_pattern.site.cars.Car;
import com.amazon.effective_java.section2.item2.builder_design_pattern.site.cars.Manual;
import com.amazon.effective_java.section2.item2.builder_design_pattern.site.director.Director;

public class Demo {

    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();

        System.out.println("Car built : \n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\n Car Manual Built : \n" + manual.print());

    }
}
