package org.example.creational_patterns.factory.cars.factories;

import org.example.creational_patterns.factory.cars.products.Camry;
import org.example.creational_patterns.factory.cars.products.Car;
import org.example.creational_patterns.factory.cars.products.Corolla;

public class ToyotaFactory extends CarsFactory{
    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if(productName.equalsIgnoreCase("CAMRY")){
            car = new Camry();
        }else if(productName.equalsIgnoreCase("COROLLA")){
            car = new Corolla();
        }

        return car;
    }
}
