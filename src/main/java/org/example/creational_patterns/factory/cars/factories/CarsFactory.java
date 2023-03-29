package org.example.creational_patterns.factory.cars.factories;

import org.example.creational_patterns.factory.cars.products.Car;

public abstract class CarsFactory {
    public abstract Car createProduct(String productName);
}
