package org.example.creational_patterns.factory.cars.factories;

import org.example.creational_patterns.factory.cars.products.Car;
import org.example.creational_patterns.factory.cars.products.Tsuru;
import org.example.creational_patterns.factory.cars.products.Versa;

public class NissanFactory extends CarsFactory{

    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if(productName.equalsIgnoreCase("TSURU")){
            car = new Tsuru();
        }else if(productName.equalsIgnoreCase("VERSA")){
            car = new Versa();
        }

        return car;
    }
}
